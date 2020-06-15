package timeInfo10;

import java.sql.SQLOutput;
import java.util.Date;

public class TimeInfo implements Runnable {

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            System.out.println(new Date());
            try {
                Thread.sleep(5000);
            }
            catch (InterruptedException e) {
                return;
            }
        }
    }
}
