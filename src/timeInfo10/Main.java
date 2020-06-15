package timeInfo10;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//Создать поток, который будет каждые 5 секунд выводить текущее время на экран. Сделать возможность прерывания потока с помощью команды с консоли.
public class Main {
    public static void main (String[] args) {
        try {
            TimeInfo timeInfo = new TimeInfo();
            Thread thrd = new Thread(timeInfo);
            thrd.start();
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String interruptCommand = bf.readLine();
            if (interruptCommand.intern() == "stop") {
                thrd.interrupt();
                System.out.println("Done");
            }
        }
        catch (Exception e) {
            ;
        }
    }
}
