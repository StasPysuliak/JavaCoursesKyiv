package threadOfThreads;
//Создать поток, который создаст 50 потоков, каждый их которых выведет на экран свой номер и дождется, пока его прервут.
//Прерывание дочерних потоков должно выполнятся из потока их порождающего.
public class Main {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyThread());
        thread.start();
        thread.interrupt();
    }
}
