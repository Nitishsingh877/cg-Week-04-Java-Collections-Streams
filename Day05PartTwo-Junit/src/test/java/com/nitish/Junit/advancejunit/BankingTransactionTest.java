package com.nitish.Junit.advancejunit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankingTransactionTest {

    BankingTransaction bankingTransaction;

    @BeforeEach
    void setup(){
        bankingTransaction = new BankingTransaction(500.00);
    }

    @Test
    void deposits() {
        double d = bankingTransaction.deposits(500);
        assertEquals(1000,d,"not successful deposits");
        System.out.println("Deposits successful");

    }

    @Test
    void withdraw() {
         double e =bankingTransaction.withdraw(1000);
        assertEquals(0,e,"Not succesful deposits");
        System.out.println("Withdrawl successful");

    }

    @Test
    void getBalance() {
        assertEquals(500,bankingTransaction.getBalance());
    }
}