package semaphore;

class Account {
    private int money;

    public Account(int money) {
        this.money = money;
    }

    public int get() {
        return money;
    }

    public void withdraw(int amount) {
        if (amount > 0 || money >= -1 * amount)
            money += amount;
    }
}