package com.nitish.excersize;
 class Animal {
    void  makeSound (){
        System.out.println("animal make sound");
    };
}
 class Dog extends Animal {
     @java.lang.Override
     void makeSound() {
         System.out.println("Dog barks");
     }
 }
public class Override {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.makeSound();
    }
}
