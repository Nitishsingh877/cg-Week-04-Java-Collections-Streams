package com.nitish.reflection.basic;

import java.lang.reflect.Field;

class Person{
    private int age = 18;
}

public class AccesPrivateField {
    public static void main(String[] args) throws Exception {
        Person person = new Person();
        Class<?> cls = person.getClass();

        //access private
        Field field = cls.getDeclaredField("age");
        field.setAccessible(true);

        //get field value

        System.out.println("original age is " + field.get(person));

        //modify values

        field.set(person, 22);

        //get modified value

        System.out.println("Modified age is " + field.get(person));
    }
    

}
