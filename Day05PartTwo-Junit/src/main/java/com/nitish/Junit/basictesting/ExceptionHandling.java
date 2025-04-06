package com.nitish.Junit.basictesting;

public class ExceptionHandling {
    public static int Divide(int a, int b){
       if(b == 0){
           throw  new ArithmeticException("cant  be divided by zero");
       } return a/b;
    }
}
