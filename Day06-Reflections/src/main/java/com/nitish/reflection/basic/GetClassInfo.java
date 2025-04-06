package com.nitish.reflection.basic;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class GetClassInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a class name");
        String input = sc.nextLine();

        try {
            Class<?> cls = Class.forName(input);
            System.out.println("class name is " + cls.getName());

            //constructor
            System.out.println("\nDisplaying constructor");
            Constructor[] constructors = cls.getDeclaredConstructors();
            for (Constructor constructor : constructors){
                System.out.println(" " + constructor);
            }

            //Fields
            System.out.println("\nFields displaying");
            Field[] field = cls.getDeclaredFields();
            for (Field f : field) {
                System.out.println(" " + f);
            }
            //methods
            System.out.println("\nDisplaying Methods");
            Method[] method = cls.getDeclaredMethods();
            for (Method method1 : method){
                System.out.println(" " + method1);
            }
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
