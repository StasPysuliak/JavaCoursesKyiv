package threadOfThreads;

public class LittleThreads implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getId());
    }
}
