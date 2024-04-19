public class Main {
    public static void main(String[] args) {
        BankCard creditCard = new CreditCard(10000.00);
        creditCard.getAvailableFundsInfo();
        creditCard.deposit(5000.00);
        creditCard.getAvailableFundsInfo();
        creditCard.pay(5000.00);
        creditCard.getAvailableFundsInfo();
        creditCard.pay(3000.00);
        creditCard.getAvailableFundsInfo();
        creditCard.deposit(2000.00);
        creditCard.getAvailableFundsInfo();
        creditCard.deposit(2000.00);
        creditCard.getAvailableFundsInfo();

    }
}
