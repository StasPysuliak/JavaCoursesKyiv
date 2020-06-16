package test3;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = new int[10000000];
        Arrays.fill(arr, r.nextInt(Integer.MAX_VALUE));

        CalcThread ct = new CalcThread(arr);
        ct.start();

        synchronized (ct) {
            try {
                ct.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Result is " + ct.getResult());
        }
    }
}
