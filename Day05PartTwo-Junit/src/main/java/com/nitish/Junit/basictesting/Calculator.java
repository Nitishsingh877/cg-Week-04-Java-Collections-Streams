package com.nitish.Junit.basictesting;

public class Calculator {
    public static int add(int a, int b){
        return a+b;
    }
    public static int  sub(int a, int b){
        return a-b;
    }
    public static int multiply(int a, int b){
        return a*b;
    }
    public  static int divide(int a, int b){
        return a/b;
    }

    public static void main(String[] args) {
        System.out.println("add is :" + add(5,8));
        System.out.println("Subtract is : " + sub(8,5));
        System.out.println("Multiply is : " + multiply(8,5));

        try {
            divide(1,0);
        }catch (ArithmeticException e){
            System.out.println("can`t divide by zero. " +e.getMessage());
        }
    }
}
