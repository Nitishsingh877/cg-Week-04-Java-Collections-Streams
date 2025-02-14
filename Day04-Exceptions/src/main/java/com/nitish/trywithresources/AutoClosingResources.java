package com.nitish.trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutoClosingResources {
    public static void main(String[] args) {
        String filePath  =  "C:\\Users\\NITISH SINGH\\OneDrive\\Desktop\\Cg-training\\Week04\\Day04-Exceptions\\src\\main\\resources\\info.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
              String firstLine = bufferedReader.readLine();
              if(firstLine != null){
                  System.out.println(firstLine);
              }else {
                  System.out.println("file not found!!");
              }


        }catch (IOException e){
            System.out.println("error while reading file" + e.getMessage());
        }
    }
}
