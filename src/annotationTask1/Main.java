package annotationTask1;

import java.lang.reflect.Method;
//Создать аннотацию, которая принимает параметры для метода.
// Написать код, который вызовет метод, помеченный этой аннотацией,
// и передаст параметры аннотации в вызываемый метод.
public class Main {
    public static void main(String[] args) {

        Class<?> cls = Test.class;
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(Anno.class)) {
                Anno anno = method.getAnnotation(Anno.class);
                try {
                    method.invoke(cls, anno.a(), anno.b());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

        }
    }
}