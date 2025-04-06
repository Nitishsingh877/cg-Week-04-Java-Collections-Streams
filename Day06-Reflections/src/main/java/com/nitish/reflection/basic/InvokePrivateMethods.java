package com.nitish.reflection.basic;

import java.lang.reflect.Method;
import java.util.Map;

class Calculator {
    private int multiply(int a, int b){
        return a*b;
    }
}

public class InvokePrivateMethods {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();
        Class<?> cls = calculator.getClass();

        //access private method
        Method method = cls.getDeclaredMethod("multiply", int.class, int.class);
        method.setAccessible(true);

        //invoke dynamically
        int result  = (int) method.invoke(calculator,5,10);
        System.out.println("multiply result is : " + result);
    }
}
