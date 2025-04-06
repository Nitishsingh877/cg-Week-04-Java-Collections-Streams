package com.readuserinputfromconsole;

import java.io.*;

public class InputFromConsole {
    public static void main(String[] args) {
        String  filePath = "C:\\Users\\NITISH SINGH\\OneDrive\\Desktop\\Cg-training\\Week04\\Day03-JavaStreams\\src\\main\\resources\\console.txt";
        File file = new File(filePath);
        if(!file.exists()){
            System.out.println("file not exists.");
            return;
        }

        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter fileWriter = new FileWriter(filePath);
                ){
            //ask user for input
            System.out.println("Enetr your name?");
            String name  = bufferedReader.readLine();

            System.out.println("Enetr your age");
            String age = bufferedReader.readLine();

            System.out.println("Enetr your fav language");
            String language = bufferedReader.readLine();
            //write to file

            fileWriter.write("Name: " + name + "\n");
            fileWriter.write("Age: " + age + "\n");
            fileWriter.write("Favorite Programming Language: " + language + "\n");
            fileWriter.write("----------------------------\n");


            System.out.println("User information saved successfully to '" + filePath + "'.");


        }catch (IOException e){
            System.out.println(e.getStackTrace());

        }
    }
}
