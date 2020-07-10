package annotationTest2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<?> cls = TextContainer.class;
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(SaveTo.class) && method.isAnnotationPresent(Saver.class)) {
                SaveTo saveTo = method.getAnnotation(SaveTo.class);
                try {
                    method.invoke(cls, saveTo.path());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
