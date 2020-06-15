package interruptedThreads;

public class MyThreads implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId());
    }
}
