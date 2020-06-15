package hello1234;
//Написать программу, которая считает текстовый файл, заменит в нем все слова “Hello” на “1234” и запишет изменения в тот-же файл
public class Main {
    public static void main(String[] args) {

        Transform transform = new Transform("C:\\Users\\Stanislav\\Desktop\\Monitor\\1.txt");

        try {
            transform.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
