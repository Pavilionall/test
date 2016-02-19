package business;

import account.interfaces.*;

import java.text.*;
import java.util.*;


public class Account implements Depositable, Withdrawable, Balanceable{

    public Account () {}

    private double dblBalanceAmount = 1000;



    public void deposit(double amount) {
        dblBalanceAmount += amount;

    }
    public void withdraw(double amount) {
        dblBalanceAmount -= amount;
    }
    public double getBalance() {
        return dblBalanceAmount;

    }
    public void setBalance(double amount) {
        dblBalanceAmount = amount;
    }

    public String getBalanceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        return currency.format(dblBalanceAmount);

    }




}
