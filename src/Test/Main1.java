package Test;

import java.util.ArrayList;

public class Main1 {
    public static class Counter extends Thread {
        public void run() {
            int x = 1;
            while ( ! isInterrupted()) { // условие завершения потока №1
                System.out.println(getId() + ": " + x++);
                try {
                    Thread.sleep(1000); // закомментировать
                    // Thread.yield(); // или так
                } catch (InterruptedException e) {
                    return; // условие завершения потока №2
                }
            }
        }
    }
    public static void main(String[] args) {
        try {
            /*
            Counter c = new Counter();
            c.start(); // запускаем поток
            Thread.sleep(5000); // ждем 5 сек
            c.interrupt(); // прерываем пото
            */
            ArrayList<Counter> threads = new ArrayList<Counter>();
            for (int i = 0; i<10; i++) {
                Counter c = new Counter();
                c.start(); // запускаем поток
                threads.add(c);
            }
            Thread.sleep(5000); // ждем 5 сек
            for (Counter c : threads) {
                c.interrupt();
            }
        } catch (Exception e) {
            ;
        }
    }
}