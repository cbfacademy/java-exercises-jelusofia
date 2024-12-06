package com.cbfacademy.accounts;

public class CurrentAccount extends Account {
    double overdraftLimit = 100 ;

    public CurrentAccount() {

    }

    @Override
    public double withdraw(double amountToWithdraw) {
        if (amountToWithdraw < 0 || amountToWithdraw > balance || amountToWithdraw < overdraftLimit) {
            System.out.println(amountToWithdraw + " is not a valid amount. Please insert a valid amount to withdraw");
        } else {
            balance -= amountToWithdraw;
            System.out.println("You withdrew " + amountToWithdraw);
            return amountToWithdraw;
        }
        return amountToWithdraw;
    }

    public void deposit(int amountToDeposit) {
        balance += amountToDeposit;
        System.out.println("You just deposited " + amountToDeposit);
    }

}
