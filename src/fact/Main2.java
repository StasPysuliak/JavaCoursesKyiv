package fact;

import java.math.BigInteger;

public class Main2 {
    static class Task extends Thread {
        Main.IFinish finish;
        BigInteger n;
        public Task(BigInteger n, Main.IFinish finish) {
            this.n = n;
            this.finish = finish;
        }
        private BigInteger fact(BigInteger x) {
// return (x == 0) ? 1 : x * fact(x - 1);
            if (x.equals(BigInteger.ZERO))
                return BigInteger.ONE;
            else
                return x.multiply(fact(x.subtract(BigInteger.ONE)));
        }
        public void run() {
            BigInteger res = fact(n);
            if (finish != null)
                finish.done(res);
        }
    }
    public static void main(String[] args) {
        Task t = new Task(new BigInteger("5"), new Main.Finish());
        t.start();
        System.out.println("Done!");
    }
}