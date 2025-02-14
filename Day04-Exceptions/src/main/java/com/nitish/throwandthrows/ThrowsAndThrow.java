package com.nitish.throwandthrows;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsAndThrow {
    public static void calculateInterest(double amount,double rate,int years) throws IllegalArgumentException{
        if(amount < 0 || rate <0 || years<=0){
            throw  new IllegalArgumentException("\"Invalid input: Amount and rate must be positive\"");
        }else {
            double si = (amount*rate*years)/100;
            System.out.println("interest is " + si);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter amount");
            double amount = sc.nextInt();
            System.out.println("Enter rate");
            double rate = sc.nextInt();
            System.out.println("enter years");
            int years = sc.nextInt();

            calculateInterest(amount,rate,years);
        }catch (IllegalArgumentException e){
            System.out.println("invalid parameters !!::" + e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Invalid input type : " + e.getMessage());
            sc.next();
        }finally {
            sc.close();
        }
    }
}
