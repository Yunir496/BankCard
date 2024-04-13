public class CreditCard extends BankCard {
    private final double creditLimit;
    private double creditBalance;

    public CreditCard(double limit) {
        super();
        this.creditLimit = limit;
        this.creditBalance = limit;
    }

    @Override
    public boolean pay(Double amount) {
        if (amount < 0 || amount > (balance + creditBalance)) {
            return false;
        }
        if (balance - amount > 0) {
            balance -= amount;
            return true;
        }
        creditBalance = (creditBalance + balance) - amount;
        return true;
    }

    @Override
    public void getAvailableFundsInfo() {
        System.out.println("Кредитная карта с лимитом " + creditLimit + ". \n" +
                "Кредитные средства: " + creditBalance + ".\n" +
                "Собственные средства: " + balance + ". \n");
    }

    @Override
    public void deposit(Double amount) {
        if (creditBalance == creditLimit) {
            super.deposit(amount);
        } else if (amount >= 0 && creditBalance + amount <= creditLimit) {
            creditBalance += amount;
        } else if (amount >= 0) {
            double remainingAmount = amount - (creditLimit - creditBalance);
            creditBalance = creditLimit;
            super.deposit(remainingAmount);
        }
    }
}
