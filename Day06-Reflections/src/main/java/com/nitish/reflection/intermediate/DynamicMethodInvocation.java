package com.nitish.reflection.intermediate;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvocation {
    public int add(int a, int b){
        return a+b;
    }
    public int subtract(int a, int b){
        return a-b;
    }
    public int multiply(int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter method name(add,subtract,multiply)");
        String input = sc.nextLine();

        System.out.println("enter first number");
        int num1 = sc.nextInt();

        System.out.println("Enter second number");
        int num2 = sc.nextInt();

        try {
            //create an instance
            DynamicMethodInvocation obj = new DynamicMethodInvocation();

           Method method = DynamicMethodInvocation.class.getMethod(input,int.class,int.class);

           Object result = method.invoke(obj,num1,num2);

            System.out.println("result is " + result);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
