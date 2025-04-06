package com.bufferesstreams;

import java.io.*;
import java.util.concurrent.TimeUnit;

public class BufferedStreams {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\NITISH SINGH\\OneDrive\\Desktop\\Cg-training\\notes\\example.txt";
        String destinationFile = "C:\\Users\\NITISH SINGH\\OneDrive\\Desktop\\Cg-training\\notes\\copyExample.txt";

        File file = new File(sourceFile);

        if(!file.exists()){
            System.out.println("Error: source file not exists!!");
            return;
        }

        long startTime = System.nanoTime();

        try (BufferedInputStream bufferedInputStream = new  BufferedInputStream(new FileInputStream(sourceFile));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destinationFile))
        ){
            int charData;
            byte[] buffer = new byte[4096];
            while ((charData = bufferedInputStream.read(buffer)) != -1){
                bufferedOutputStream.write(charData);
            }
            System.out.println("file larger than 100Mb copied successfully!!");
        }catch (IOException e){
            System.out.println("error file handling" +e.getStackTrace());

        }
        long endTime = System.nanoTime();
        long diff = endTime - startTime;

        System.out.println("buffered time is " + diff);
        System.out.println("in milli s " + TimeUnit.NANOSECONDS.toMillis(diff));
    }
}
