package Test;

class Test {
    private int a = 77; // !!!
    public void job() {
        final int b = 88; // !!!
        Thread th = new Thread(new Runnable() {
            public void run() {
                System.out.println(a + " " + b);
            }
        });
        th.start();
    }
}
class A {
    public static void main(String[] args) {
        Test t = new Test();
        t.job();
    }
}