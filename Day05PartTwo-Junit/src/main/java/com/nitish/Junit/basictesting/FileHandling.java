package com.nitish.Junit.basictesting;

import java.io.*;

public class FileHandling {
    public void WriteFile(String filepath,String input){
        try (BufferedWriter br = new BufferedWriter(new FileWriter(filepath))){
            br.write(input);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

    public String readFromFile(String filepath){
        try(BufferedReader br = new BufferedReader(new FileReader(filepath))){
            String line = br.readLine();
            return line;
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        return "";
    }
}
