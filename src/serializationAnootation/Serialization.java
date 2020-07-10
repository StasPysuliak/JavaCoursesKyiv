package serializationAnootation;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Serialization {
    public static String serialization (Object o) throws Exception {

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

            sb.append(";");
        }
        return sb.toString();
    }
}
