package myMatrix;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;
//Реализовать многопоточное перемножение квадратных матриц. Сравнить скорость выполнения алгоритма с однопоточным решением.
public class Main {
    public static void main(String[] args) {
        // одно-поточное перемножение квадратных матриц
        int matrixSize = 6000;
        int[][] matrix1  = new int[matrixSize][matrixSize];
        int[][] matrix2  = new int[matrixSize][matrixSize];
        long[][] matrixResult = new long[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++)
            for (int j = 0; j < matrixSize; j++) {
                matrix1[i][j] = new Random().nextInt();
                matrix2[i][j] = new Random().nextInt();
            }
        long timeWork = System.currentTimeMillis();
        for (int i = 0; i < matrixSize; i++)
            for (int j = 0; j < matrixSize; j++) {
                matrixResult[i][j] = matrix1[i][j] * matrix2[j][i];
            }
        System.out.println("Перемножение 2-х матриц разменостью " + matrixSize + "*"
                + matrixSize + " (в 1 поток) заняло " + (System.currentTimeMillis() - timeWork) + " милисекунд.");

        // много-поточное перемножение квадратных матриц
        AtomicLong[][] matrixAtom = new AtomicLong[matrixSize][matrixSize];
        for (int i = 0; i < matrixSize; i++)
            for (int j = 0; j < matrixSize; j++) {
                matrixAtom[i][j] = new AtomicLong(0);
            }
        int numberOfThreads = Runtime.getRuntime().availableProcessors();
        int partLength =  matrixSize/ numberOfThreads;
        ArrayList<Thread> threads = new ArrayList<>();
        timeWork = System.currentTimeMillis();
        for (int i = 0; i < numberOfThreads; i++) {
            Thread thread = new Thread(new MyMatrix(matrix1, matrix2, i * partLength, i + partLength, matrixAtom));
            thread.start();
            threads.add(thread);
        }
        for (Thread th:threads) {
            try {
                th.join();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Перемножение 2-х матриц разменостью " + matrixSize + "*"
                + matrixSize + " (в " + numberOfThreads + " поток(ов)) заняло "
                + (System.currentTimeMillis() - timeWork) + " милисекунд.");
    }
}
