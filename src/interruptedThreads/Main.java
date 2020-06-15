package interruptedThreads;
import java.util.ArrayList;
//Создать 100 потоков, каждый их которых выведет на экран свой номер и дождется, пока его прервут.
public class Main {
    public static void main(String[] args) {
        ArrayList<Thread> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Thread thrd = new Thread(new MyThreads());
            thrd.start();
            list.add(thrd);
        }
        for (Thread th : list) {
            th.interrupt();
        }
    }
}
