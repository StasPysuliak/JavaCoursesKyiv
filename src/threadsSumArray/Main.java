package threadsSumArray;

import threadsSumArray.Calc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//Написать код для многопоточного подсчета суммы элементов массива целых чисел. Сравнить скорость подсчета с простым алгоритмом.
public class Main {
    public static void main(String[] args) throws Exception {
        int[] arr = new int[100000000];
        int procCount = Runtime.getRuntime().availableProcessors();
        List<Calc> list = new ArrayList<>();
        Calc calc;
        int p = 0,partSize = arr.length/procCount;

        Arrays.fill(arr, 1);
        long tm1 = System.currentTimeMillis();

        for (int i = 0; i < procCount; i++) {
            calc = new Calc(arr, p, p += partSize);
            list.add(calc);
            calc.start();
        }

        long sum = 0;
        for (Calc c : list) {
            c.join();
            sum += c.getSum();
        }

        System.out.println("Sum1 = " + sum);
        System.out.println("Time1 = " + (System.currentTimeMillis()-tm1));
    }
}
