public class SavingAccount extends Account {

    private double interestRate;

    public SavingAccount(Double intialDeposit, Double interestRate) {
        super(intialDeposit);
        this.interestRate = interestRate;
    }

    public void withdraw(double amount){
        //calling the superclass withdraw to include the $2 fee
        super.withdraw(amount + 2);
    }

    @Override
    public String toString() {
        return "SavingAccount created on: " + dataCreated + "has a current balance of " + balance;
    }
}
