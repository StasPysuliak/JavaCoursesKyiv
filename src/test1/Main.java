package test1;

public class Main {

    public static void main(String[] args) {

        Sample s = new Sample();
        s.start();

        try {
            Thread.sleep(500);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        s.stopPlease();
    }
}
