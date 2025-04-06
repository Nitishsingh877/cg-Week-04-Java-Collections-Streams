package com.filterstreams;

import java.io.*;
import java.util.Locale;

public class ConvertUppercaseToLowercase {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\NITISH SINGH\\OneDrive\\Desktop\\Cg-training\\Week04\\Day03-JavaStreams\\src\\main\\resources\\console.txt";
        String destinationFile = "C:\\Users\\NITISH SINGH\\OneDrive\\Desktop\\Cg-training\\Week04\\Day03-JavaStreams\\src\\main\\resources\\writeconsole.txt";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFile));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destinationFile))
        ) {
            String  line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line.toLowerCase());
            }

            System.out.println("copied in lower case");

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
