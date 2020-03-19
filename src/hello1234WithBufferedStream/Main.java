package hello1234WithBufferedStream;

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
