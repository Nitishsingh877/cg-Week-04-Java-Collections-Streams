package com.nitish.checkedexception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptions {
    public static void main(String[] args) {
        String filepath = "data.txt";
        String file = "C:\\Users\\NITISH SINGH\\OneDrive\\Desktop\\Cg-training\\Week04\\Day04-Exceptions\\src\\main\\resources\\data.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filepath))){
            String line;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        }catch (IOException e){
            System.out.println("File not found!!"+ e.getMessage());
        }
    }
}
