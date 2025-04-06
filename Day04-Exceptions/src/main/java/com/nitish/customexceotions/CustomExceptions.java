package com.nitish.customexceotions;

import java.util.Scanner;

public class CustomExceptions {

    static  class  InvalidAgeException extends Exception {
        public InvalidAgeException(String message){
            super(message);
        }
    }

    public static void valiadateAge(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("Age must be greater than 18");
        }else {
            System.out.println("You must Vote For BJP!!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age!!");
        int age = sc.nextInt();

        try {
            valiadateAge(age);
        }catch (InvalidAgeException e){
            System.out.println("caught custom exception : " + e.getMessage());
        }
    }

}
