package counter;

public class Counter implements Runnable {

    @Override
    public void run() {
        while(!Thread.currentThread().isInterrupted()) {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getId() + ": " + i);
            }
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
                return;
            }
        }
    }

}
