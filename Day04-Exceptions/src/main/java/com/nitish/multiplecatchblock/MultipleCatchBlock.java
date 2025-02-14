package com.nitish.multiplecatchblock;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlock {
    public static void indexValue(int[] arr, int index)  {
        if(arr == null){
            throw new NullPointerException("Array is not initialized!!");
        }
        if(index < 0){
            throw new ArrayIndexOutOfBoundsException("index out of bounds!");
        }
        System.out.println("value at index" + index + " : " + arr[index]);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = null;
        System.out.println("Enter index value Size" + "for array");
        try {
            int size = sc.nextInt();
            array = new int[size];
        }catch (InputMismatchException e){
            System.out.println("invalid input for array.");
            sc.next();
            return;
        }

        if(array != null){
            System.out.println("enter value for array!!");
                for (int i = 0; i < array.length ; i++) {
                    while (true){
                        System.out.println("enter value for " + (i+1) + " : ");
                        try{
                            array[i] = sc.nextInt();
                            break;
                        }catch (InputMismatchException e){
                            System.out.println("Invalid input ! try Again.");
                            sc.next();
                        }
                    }
                }
            }

        System.out.println("enter the index to search");
        try{
            int index = sc.nextInt();
            indexValue(array,index);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("array index out of bound" + e.getMessage());
        }catch (NullPointerException e){
            System.out.println("array is not intialised  "  + e.getMessage());
        }catch (InputMismatchException e){
            System.out.println("input for array is not correct!!"+ e.getMessage());
        }






    }
}
