package test3;

public class CalcThread extends Thread {
    long res;
    int[] arr;

    public CalcThread(int[] arr) {
        this.arr = arr;
    }

    public void run() {
        synchronized (this) {
            for (int i : arr) {
                res += i;
            }
            res /= arr.length;
            notify();
        }
    }
    public long getResult() {
        return res;
    }
}
