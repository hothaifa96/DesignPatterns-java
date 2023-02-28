package com.intro.Encapsulation;

public class BankAccount {
    private double balance;

    public void deposit(double amount){
        if (amount >= 0 )
            this.balance += amount;
    }
    public void withdraw(double amount){
        if (amount > 0 && amount <= balance )
            this.balance -= amount;
    }

    public Double Info(){
        return balance;
    }


    public void setBalance(double balance){
        if (balance >= 0 )
            this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }

}
