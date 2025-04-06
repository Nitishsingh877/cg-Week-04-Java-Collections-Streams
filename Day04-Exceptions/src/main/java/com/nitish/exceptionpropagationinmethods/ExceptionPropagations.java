package com.nitish.exceptionpropagationinmethods;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPropagations {
    public static void Method1(int a, int b)throws ArithmeticException{
        if(b == 0){
            throw  new ArithmeticException("can`t divide by zero!!");
        }
        int c = a/b;
        System.out.println("quotient is " + c);
    }

    public static void Method2(int p,int q ){
        Method1(p,q);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter first number");
            int a  = sc.nextInt();
            System.out.println("Enter second number");
            int b = sc.nextInt();

            Method2(a,b);
        }catch (ArithmeticException e){
            System.out.println("Handled exception in main " + e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("Enter valid details "+ e.getMessage());
        }
    }
}
