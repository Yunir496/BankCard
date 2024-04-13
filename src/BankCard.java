public abstract class BankCard {
    protected double balance;

    public BankCard() {
        this.balance = 0;
    }

    public void deposit(Double amount) {
        if (amount <= 0) {
            return;
        }
        balance += amount;
    }

    public abstract boolean pay(Double amount);

    public double getBalance() {
        return balance;
    }

    public abstract void getAvailableFundsInfo();


}
