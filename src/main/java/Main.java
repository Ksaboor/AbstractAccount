import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        //reading form the keyboard
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1 checking, 2 for savings, and 3 for Business:");
        int choice = input.nextInt();

        switch (choice){
            case 1:
                CheckingAccount ch = new CheckingAccount(70000);

            case 2:

                    Savings();
            case 3:
                BusinessAccount bs = new BusinessAccount(225000);

        }

    }
    static void Savings(){
        Scanner input = new Scanner(System.in);

        //request user deposit
        System.out.print("Please enter initial deposit");
        double amount = input.nextDouble();

        SavingAccount account = new SavingAccount(amount, 2.0);

        System.out.println("Enter 1 for deposit, 2 for withdrawal:");
        int choice = input.nextInt();

        System.out.println("Transaction Amount:");
        amount = input.nextDouble();

        switch (choice){
            case 1:
                account.deposit(amount);
                break;
            case 2:
                account.withdraw(amount);
                break;
        }
        System.out.println(account.toString());
    }
}