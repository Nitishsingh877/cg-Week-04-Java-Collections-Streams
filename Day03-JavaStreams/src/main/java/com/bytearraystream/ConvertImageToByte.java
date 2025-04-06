package com.bytearraystream;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class ConvertImageToByte {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\NITISH SINGH\\OneDrive\\Desktop\\Cg-training\\Week04\\Day03-JavaStreams\\src\\main\\resources\\IMG_1125.JPG";
        String NewFilePath = "C:\\Users\\NITISH SINGH\\OneDrive\\Desktop\\Cg-training\\Week04\\Day03-JavaStreams\\src\\main\\resources\\Nitish.JPG";


        try {
                byte[] imagesBytes = Files.readAllBytes(Paths.get(filePath));

                try(ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(imagesBytes);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
                    int byteData;
                    while ((byteData = byteArrayInputStream.read()) != -1){
                        byteArrayOutputStream.write(byteData);
                    }
                    byte[] newImageBytes = byteArrayOutputStream.toByteArray();
                    try(FileOutputStream fileOutputStream = new FileOutputStream(NewFilePath)) {
                        fileOutputStream.write(newImageBytes);
                    }
                    System.out.println("Image copied!!!!!!");

                    boolean flag = Arrays.equals(imagesBytes,newImageBytes);
                    if(flag) System.out.println("Both image are equal !!");
                    else System.out.println("OOPS ! code failed to copy the image" +
                            "");
                }

        }

        catch (IOException e){
            e.printStackTrace();
            System.out.println(e.getMessage());

        }
    }
}
