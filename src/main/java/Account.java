import java.util.Date;

public abstract class Account {
    protected Date dataCreated;
    protected Double balance;

    public Account(double intialDeposite){
        balance = intialDeposite;
        dataCreated = new Date();
    }

    public void withdraw(Double amount){
        try {
            balance-=amount;
        }catch (IllegalArgumentException e){
            System.out.println("Error: Cannot withdraw more than balance!");
        }
    }

    public void deposit(Double amount){
        balance+= amount;
    }
}