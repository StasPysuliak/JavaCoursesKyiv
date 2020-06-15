package copyFile;

public class MyClass {
    private static class Progress implements IProgress {
        long n = 0;
        @Override
        public void update(double p) {
            final long rounded = Math.round(p);
            long add = rounded - n;
            n = rounded;
            while (add-- > 0)
                System.out.print('.');
        }
    }
    public static void main(String[] args) {
        Copy c = new Copy("C:\\Users\\Stanislav\\Desktop\\Monitor\\1.mp4", "C:\\Users\\Stanislav\\Desktop\\Monitor\\2.mp4", new Progress());
        c.start();
    }
}