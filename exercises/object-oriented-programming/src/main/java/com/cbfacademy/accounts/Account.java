package com.cbfacademy.accounts;

public class Account{
    double balance;
    int accountNumber;

    public Account(int accountNumber, double balance){
        this.accountNumber = accountNumber;
        this.balance = balance;

    }


    public double withdraw(double amountToWithdraw){
        if (amountToWithdraw< 0 || amountToWithdraw > balance){
            System.out.println(amountToWithdraw + " is not a valid amount. Please insert a valid amount to withdraw");
        } else {
            balance -= amountToWithdraw;
            System.out.println("You withdrew "+ amountToWithdraw);
            return amountToWithdraw;
        }
        return amountToWithdraw;
    }

    public void deposit(int amountToDeposit){
        balance += amountToDeposit;
        System.out.println("You just deposited "+ amountToDeposit);
    }
    public static void main(String[] args){

    }
    

    









    
}
