package business;

import account.interfaces.*;


public class Transactions {

    public Transactions () {

    }

    public static void deposit (Depositable account, double amount) {
        account.deposit(amount);
    }

    public static void withdraw(Withdrawable account, double amount) {
        account.withdraw(amount);

    }

    }
