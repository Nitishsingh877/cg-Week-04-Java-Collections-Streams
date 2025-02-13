package com.filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class FileHandling {
    public static void main(String[] args) {
        String sourceFilePath = "C:\\Users\\NITISH SINGH\\OneDrive\\Desktop\\Cg-training\\notes\\example.txt";
        String destinationPath = "C:\\Users\\NITISH SINGH\\OneDrive\\Desktop\\Cg-training\\Week04\\Day03-JavaStreams\\src\\main\\resources\\write.txt";

        File file = new File(sourceFilePath);

        if(!file.exists()){
            System.out.println("Error: source file not exists!!");
            return;
        }
        long startTime = System.nanoTime();

        try(
            FileInputStream inputStream = new FileInputStream(sourceFilePath);
            FileOutputStream outputStream = new FileOutputStream(destinationPath)
        ) {
        int data;
        while ((data = inputStream.read()) != -1){
            outputStream.write(data);
        }
            System.out.println("file copied successfully in :" + destinationPath);
        }catch (IOException e){
            System.out.println("error while copying file" + e.getStackTrace());

        }

        long end = System.nanoTime();
        long diffrenc = end - startTime;

        System.out.println("time taken in unbuffered streams is :" + diffrenc + "nanoS");
        System.out.println("in milli seconds " + TimeUnit.NANOSECONDS.toMillis(diffrenc) + "ms");

    }
}
