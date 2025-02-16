package com.nitish.Junit.advancejunit;

public class BankingTransaction {
    private double balance;

    public BankingTransaction(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public double deposits(double amount){
        return balance += amount;
    }

    public double withdraw(double amount){
        if(amount > balance){
            return 0;
        } balance -= amount;
          return balance;
    }

}
