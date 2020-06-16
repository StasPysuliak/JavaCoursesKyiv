package myMatrix;

import java.util.concurrent.atomic.AtomicLong;

public class MyMatrix implements Runnable {
    private int[][] matrix1;
    private int[][] matrix2;
    private int startPos;
    private int stopPos;
    AtomicLong[][] matrixAtom;

    public MyMatrix(int[][] matrix1, int[][] matrix2, int startPos, int stopPos, AtomicLong[][] matrixAtom) {
        this.matrix1 = matrix1;
        this.matrix2 = matrix2;
        this.startPos = startPos;
        this.stopPos = stopPos;
        this.matrixAtom = matrixAtom;
    }

    @Override
    public void run() {
        for (int i = startPos; i < stopPos; i++)
            for (int j = startPos; j < stopPos; j++) {
                matrixAtom[i][j].set(matrix1[i][j] * matrix2[j][i]);
            }
    }
}