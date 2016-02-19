package ui;
import business.*;
import account.interfaces.*;


public class AccountApp {

    public static void main(String[] args) {

        String strChoice = "y";

        Console c = new Console();



        //Prints "Hello, World" to the terminal window.
        System.out.println("Welcome to the Account Calculator\n");

        CheckingAccount custAccount = new CheckingAccount();

        System.out.println("Starting Balance");

        System.out.println("Checking: " + custAccount.getBalanceFormatted() +"\n");

        System.out.println("Enter the transactions for the month \n");

        while (strChoice.equalsIgnoreCase("y")) {

            String strAccountType = (c.getString("Withdrawal or deposit?  (w/d): "));

            double amount = (c.getDouble("Amount: "));

            if (strAccountType.equalsIgnoreCase("w")) {
                if (amount <= custAccount.getBalance()) {
                    custAccount.withdraw(amount);
                }
                else {
                    System.out.println("amount is greater than balance!!!!!");
                }
            }
            else{
                if (amount <= 10000) {
                    custAccount.deposit(amount);

                }
                else {
                    System.out.println("You are depositing too much money!");
                }

            }

            strChoice = c.getString("\nContinue? (y/n): ");

        }
        System.out.println("\nMonthly Fees");
        System.out.println("Checking Fee:           " + custAccount.getMonthlyFeeFormatted() + "\n");
        System.out.println("Final Balance");
        custAccount.setBalance(custAccount.getBalance() - custAccount.getMonthlyFee());
        System.out.println("Checking:  " + custAccount.getBalanceFormatted());









    }

}
