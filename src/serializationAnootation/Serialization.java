package serializationAnootation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.InetAddress;
import java.security.InvalidParameterException;

public class Serialization {

    public static void serializer(Object o, String path) throws Exception {

        Class<?> cls = o.getClass();
        StringBuilder sb = new StringBuilder();
        Field[] fields = cls.getDeclaredFields();

        for (Field filed : fields) {

            if (!filed.isAnnotationPresent(Save.class)) {
                continue;
            }

            if (Modifier.isPrivate(filed.getModifiers())) {
                filed.setAccessible(true);
            }

            sb.append(filed.getName() + "=");

            if (filed.getType() == int.class) {
                sb.append(filed.getInt(o));
            } else if (filed.getType() == String.class) {
                sb.append((String) filed.get(o));
            } else if (filed.getType() == long.class) {
                sb.append(filed.getLong(o));
            }

            sb.append("\n");
        }
        try (FileOutputStream fos = new FileOutputStream(path)) {
            fos.write(sb.toString().getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static <T> T deserialize(Class<T> cls, String path) {
        T res = null;
        try {
            res = cls.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try (FileInputStream fis = new FileInputStream(path)) {
            byte[] buffer = new byte[(int) new File(path).length()];
            fis.read(buffer);

            String s = new String(buffer, "UTF-8");
            String[] pairs = s.split("\n");


            for (String p : pairs) {
                String[] nv = p.split("=");
                if (nv.length != 2)
                    throw new InvalidParameterException(s);

                String name = nv[0];
                String value = nv[1];
                Field f = cls.getDeclaredField(name);
                if (Modifier.isPrivate(f.getModifiers()))
                    f.setAccessible(true);

                if (f.getType() == int.class) {
                    f.setInt(res, Integer.parseInt(value));
                } else if (f.getType() == String.class) {
                    f.set(res, value);
                } else if (f.getType() == long.class) {
                    f.setLong(res, Long.parseLong(value));
                }
            }

            return res;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }
}
