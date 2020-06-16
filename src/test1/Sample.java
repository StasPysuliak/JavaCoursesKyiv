package test1;

public class Sample extends Thread {
    private volatile boolean stop;

    public void run() {
        while (! stop) {
            System.out.println(".");
        }
    }
    public void stopPlease() {
        stop = true;
    }
}
