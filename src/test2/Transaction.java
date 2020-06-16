package test2;

public class Transaction extends Thread {
    private Account account;
    private int withdraw;

    public Transaction (Account account, int withdraw) {
        this.account = account;
        this.withdraw = withdraw;
    }

    public void run() {
        try {
            Thread.sleep(System.currentTimeMillis() % 50);
        } catch (InterruptedException e) {
            ;
        }
        synchronized (account) {
            int total = account.getMoney();
            if (total >= withdraw)
                account.setMoney(total - withdraw);
        }
    }
}
