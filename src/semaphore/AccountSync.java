package semaphore;

import java.util.concurrent.Semaphore;
//Решить задачу про банк с помощью чего-нибудь из java.util.concurrent.* Не через Atomic  :)
public class AccountSync {

    public static void main(String[] args) {

        Semaphore sem = new Semaphore(1);
        Account acc = new Account(1000);
        Transaction[] transactions = {
                new Transaction(sem, acc, -100),
                new Transaction(sem, acc, -500),
                new Transaction(sem, acc, -200),
                new Transaction(sem, acc, 300),
                new Transaction(sem, acc, -50),
                new Transaction(sem, acc, -150),
                new Transaction(sem, acc, -180),
                new Transaction(sem, acc, -120)
        };

        // запускаем транзакции
        for (Transaction t : transactions)
            t.start();

        // ждем их завершения
        for (Transaction t : transactions) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // на экране 0 или "ерунда" если убрать synchronized
        System.out.println("Total: " + acc.get());
    }
}
