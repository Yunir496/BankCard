public class CashBackCreditCard extends CreditCard {
    private static final double THRESHOLD_BONUS_VALUE = 5000;

    public CashBackCreditCard(double limit) {
        super(limit);
    }

    @Override
    public boolean pay(Double amount) {
        boolean result = super.pay(amount);
        if (result && amount >= THRESHOLD_BONUS_VALUE) {
            super.deposit(amount * 0.05);
        }
        return result;
    }

    @Override
    public void deposit(Double amount) {
        double bonusPart = amount*0.005;
        super.deposit(amount+bonusPart);
    }
}
