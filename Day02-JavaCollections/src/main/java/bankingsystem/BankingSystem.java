package bankingsystem;

import java.util.*;

public class BankingSystem {
    HashMap<Long,Double> accounts = new HashMap<>();
    TreeMap<Double,Long> sortedBalance = new TreeMap<>();
    Queue<WithdrawlRequest> withdrawlRequests = new LinkedList<>();

    private static class WithdrawlRequest {
        long accountNumber;
        double amount;

        public WithdrawlRequest(long accountNumber, double amount) {
            this.accountNumber = accountNumber;
            this.amount = amount;
        }
    }

    public void addAccount(long accountNumber, double amount){
        //add in hm
        accounts.put(accountNumber,amount);

        //add in tm for sorted balance
        sortedBalance.put(amount,accountNumber);
    }

    public void processWithdraw(long accountNumber, double amount){
        withdrawlRequests.add(new WithdrawlRequest(accountNumber,amount));
    }

    public void processAllWithdrawls(){
        while (!withdrawlRequests.isEmpty()){
            WithdrawlRequest request = withdrawlRequests.poll();

            if(accounts.containsKey(request.accountNumber)) {
                double balance = accounts.get(request.accountNumber);

                if (balance >= request.amount) {
                    accounts.put(request.accountNumber, balance - request.amount);
                } else {
                    System.out.println("insufficient balance");
                }
            }
                else {
                System.out.println("Account number not matched!! " +
                        "Retry");
                }
        }
    }

    public void displayDetails(){
        for (Map.Entry<Long,Double> entry : accounts.entrySet())
        {
            System.out.println("account number is " + entry.getKey() + ". Balance is " + entry.getValue());
        }
    }

    public void sortWithBalance(){
        for (Map.Entry<Double,Long> entry : sortedBalance.entrySet()){
            System.out.println("account number is " + entry.getValue() + ". Balance is " + entry.getKey());
        }
    }

    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        // Add accounts with initial balances
        bank.addAccount(12345, 5000.00);
        bank.addAccount(67890, 1500.00);
        bank.addAccount(11223, 3000.00);

        // Process withdrawal requests
        bank.processWithdraw(12345, 2000.00);  // Successful
        bank.processWithdraw(67890, 2000.00);  // Insufficient balance
        bank.processWithdraw(11223, 1000.00);  // Successful
        bank.processWithdraw(00000, 500.00);   // Account not found

        // Process all withdrawal requests
        bank.processAllWithdrawls();

        // Display account balances after processing withdrawals
        bank.displayDetails();

        //in sorted balance
        System.out.println("sorted");
        bank.sortWithBalance();
    }
}
