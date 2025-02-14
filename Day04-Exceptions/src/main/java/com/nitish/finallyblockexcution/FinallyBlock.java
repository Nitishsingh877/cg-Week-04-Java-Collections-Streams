package com.nitish.finallyblockexcution;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {
    public static void IntegerDivision(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("can`t divide by zero!");
        }
        int c = a/b;
        System.out.println("quotient is  " + c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the first number");
            int a = sc.nextInt();
            System.out.println("Enter the Second number");
            int b = sc.nextInt();

            IntegerDivision(a,b);
        }catch (ArithmeticException e){
            System.out.println("exception is " + e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("please enter valid details : " + e.getMessage());
            sc.next();
        }finally {
            System.out.println("Operation completed");
            sc.close();
        }
    }
}
