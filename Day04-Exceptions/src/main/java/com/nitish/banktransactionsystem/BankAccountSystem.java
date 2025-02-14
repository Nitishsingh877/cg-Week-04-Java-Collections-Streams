package com.nitish.banktransactionsystem;

public class BankAccountSystem {

    static class InsufficentFundsException extends Exception{
        private double amount;
        public InsufficentFundsException(String message,double amount){
            super(message);
            this.amount = amount;
        }

        public double getAmount() {
            return amount;
        }
    }


    public static  class BankAccount{
        private double balance;

        public BankAccount(double intialBalance){
            this.balance = intialBalance;
        }

        public void withdrawl(double amount) throws InsufficentFundsException{
            if(amount > balance){
                throw new InsufficentFundsException("Insufficient funds for withdrawal", amount - balance);
            }
            balance -= amount;
        }

        public double getBalance() {
            return balance;
        }
    }


    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(9999.00);

        try {
            System.out.println("Withdrawing $5000");
            bankAccount.withdrawl(15000);
            System.out.println("New balance : " + bankAccount.getBalance());

        }catch (InsufficentFundsException e){
            System.out.println("Exception is " + e.getMessage());
            System.out.println("shortfall " + e.getAmount());
        }
    }
}
