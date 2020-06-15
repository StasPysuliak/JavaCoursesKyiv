package counter;
//Модифицировать класс Counter так, чтобы он циклически выводил числа из определенного диапазона.
public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        Thread thrd = new Thread(counter);
        thrd.start();
        try {
            Thread.sleep(10000);
            thrd.interrupt();
        }
        catch (Exception e) {
            ;
        }
    }
}
