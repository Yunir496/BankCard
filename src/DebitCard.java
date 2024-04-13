public class DebitCard extends BankCard{

    public DebitCard() {
        super();
    }

    @Override
    public boolean pay(Double amount) {
       if(amount>balance || amount < 0){
           return false;
       }
       balance -= amount;
       return true;
    }

    @Override
    public void getAvailableFundsInfo() {
        System.out.println("Собственные средства: "+ balance);
    }
}
