package com.nitish.uncheckedexceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RuntimeExceptions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =0;
        int b = 0;
        boolean validInput = false;

        //input a and validation
        while (!validInput){
            System.out.println("enter first Number");
            try {
                a = sc.nextInt();
                validInput = true;
            }catch (InputMismatchException e){
                System.out.println("Invalid input.Enter an integer.");
                sc.next();
            }
        }

        validInput = false;
        while (!validInput){
            System.out.println("enter Second Number");
            try {
                b = sc.nextInt();
                validInput = true;
            }catch (InputMismatchException e){
                System.out.println("Invalid input.Enter an integer.");
                sc.next();
            }
        }
            try {
                int c = a/b;
                System.out.println(c);
            }catch (ArithmeticException e){
                System.out.println("Division by zero leads to infinite!" + e.getMessage());
            } finally {
                sc.close();
            }
        }
    }

