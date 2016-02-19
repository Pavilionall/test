package business;

import java.text.*;
import java.util.*;

public class CheckingAccount extends Account {

    public CheckingAccount() {
    }

    private double dblMonthlyFee = 1.00;

    public void subtractMonthlyFee() {
    }

    public void setMontlyFee(double monthlyFee) {
        this.dblMonthlyFee = monthlyFee;
    }

    public double getMonthlyFee() {
        return dblMonthlyFee;
    }

    public String getMonthlyFeeFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(dblMonthlyFee);


    }
}