package threadWrite;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\Stanislav\\Desktop\\aaa\\1.txt";
        int numberOfThreads = 10;
        List<Thread> threads = new ArrayList<>();
        for (int i = 1; i <= numberOfThreads; i++) {
            StringBuilder sb = new StringBuilder("Thread ")
                    .append(i)
                    .append(" of ")
                    .append(numberOfThreads)
                    .append(" threads.")
                    .append("\n");
            Thread thread = new Thread(new ThreadWrite(path, sb.toString()));
            thread.start();
            threads.add(thread);
        }
        for (Thread th:threads) {
            try {
                th.join();
            } catch (InterruptedException e) {
                ;
            }
        }
    }
}
