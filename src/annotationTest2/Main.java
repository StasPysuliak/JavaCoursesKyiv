package annotationTest2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
//Написать класс TextContainer, который содержит в себе строку.
// С помощью механизма аннотаций указать
// 1) в какой файл должен сохраниться текст
// 2) метод, который выполнит сохранение. Написать класс Saver,
// который сохранит поле класса TextContainer в указанный файл.
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
