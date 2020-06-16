package semaphore;

import java.util.concurrent.Semaphore;

class Transaction extends Thread {
    private Semaphore semMoney;
    private Account account;
    private int amount;

    public Transaction(Semaphore semMoney, Account account, int amount) {
        this.semMoney = semMoney;
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        try { // спим для эмуляции реального многопоточного доступа к ресурсу
            semMoney.acquire();
            Thread.sleep(System.currentTimeMillis() % 50);
        } catch (InterruptedException e) {}
        account.withdraw(amount);
        semMoney.release();
    }
}