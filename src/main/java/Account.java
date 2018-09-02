import java.util.Date;

public abstract class Account {
    private Date dataCreated;
    private Double balance;

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

    public void deposite(Double amount){
        balance+= amount;
    }
}