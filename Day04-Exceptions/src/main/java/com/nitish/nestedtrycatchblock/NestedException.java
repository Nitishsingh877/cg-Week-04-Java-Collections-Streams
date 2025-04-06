package com.nitish.nestedtrycatchblock;

import com.sun.jdi.Value;

public class NestedException {
    public static void getIndex(int[] arr, int index) throws ArrayIndexOutOfBoundsException{
        if(index < 0 || index >= arr.length){
            throw new ArrayIndexOutOfBoundsException("give index in between range");
        }
        System.out.println("value of index" + index + " is : " + arr[index]);
    }


    public static  void getQuotient(int[] arr, int index) throws ArithmeticException,ArrayIndexOutOfBoundsException{
        if(index < 0 || index >= arr.length){
            throw new ArrayIndexOutOfBoundsException("Index out of bounds!!");
        }
        int divisor = arr[index];
        if(divisor == 0 || divisor <0){
            throw new ArithmeticException("can`t divide by zero");
        }
        int res = divisor/index;
        System.out.println("result is " + res);
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};

        try {
            //handle array out of bound
            try {
                //handle arithmetic
                getIndex(arr, 2);
                getIndex(arr, 10);//out of bound
                getQuotient(arr, 2);
                getQuotient(arr, 0);//arthritic error

            } catch (ArithmeticException e) {
                System.out.println("Arithmetic exception caught : " + e.getMessage());
            }
        }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("Array index bound exception " + e.getMessage());
            }
            System.out.println("program continues after exception handled!!");
        }

    }

