public class BonusDebitCard extends DebitCard {
    private double bonusBalance;
    private double bonusPercent;//создана для регулирования процента бонусных рублей

    public BonusDebitCard(double bonusPercent) {
        super();
        this.bonusPercent = bonusPercent;
    }

    @Override
    public boolean pay(Double amount) {

        boolean result = super.pay(amount);
        if (result) {
            bonusBalance += amount * 0.01;
        }
        return result;
    }

    @Override
    public void getAvailableFundsInfo() {
        super.getAvailableFundsInfo();
        System.out.println("Бонусный счет: "+bonusBalance);
    }
}
