package Test2;

import java.math.BigInteger;

public class Main {
    static interface IFinish {
        void done(BigInteger result);
    }
    static class Finish implements IFinish {
        @Override
        public void done(BigInteger result) {
            System.out.println(result);
        }
    }
}
