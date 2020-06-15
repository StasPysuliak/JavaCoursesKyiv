package threadOfThreads;

import java.util.ArrayList;

public class MyThread implements Runnable {

    @Override
    public void run() {
        ArrayList<Thread> list = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Thread thread = new Thread(new LittleThreads());
            thread.start();
            list.add(thread);
        }
        for (Thread th : list) {
            th.interrupt();
        }
    }
}
