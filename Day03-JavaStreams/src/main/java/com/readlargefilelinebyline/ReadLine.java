package com.readlargefilelinebyline;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadLine {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\NITISH SINGH\\OneDrive\\Desktop\\Cg-training\\Week04\\Day03-JavaStreams\\src\\main\\resources\\write.txt";

        try(
                BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))
                ){
                    String line;
                    while ((line = bufferedReader.readLine()) != null){
                        if(line.contains("Error")){
                            System.out.println(line);
                        }
                    }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
