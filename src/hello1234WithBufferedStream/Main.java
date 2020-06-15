package hello1234WithBufferedStream;
//Разобраться с java.io.BufferedInputStream и java.io. BufferedOutputStream. Подумать как улучшить программу №3 с помощью этих классов.
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
