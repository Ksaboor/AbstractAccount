import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        //reading form the keyboard
        Scanner input = new Scanner(System.in);
        //request user deposit
        System.out.print("Please enter initial deposit");
        double amount = input.nextDouble();

        SavingAccount account = new SavingAccount(amount, 2.0);



    }
}
