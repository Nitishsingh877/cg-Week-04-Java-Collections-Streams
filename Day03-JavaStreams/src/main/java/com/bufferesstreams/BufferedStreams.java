package com.bufferesstreams;

import java.io.File;

public class BufferedStreams {
    public static void main(String[] args) {
        String sourceFile = "C:\\Users\\NITISH SINGH\\OneDrive\\Desktop\\Cg-training\\notes\\example.txt";
        String destinationFile = "C:\\Users\\NITISH SINGH\\OneDrive\\Desktop\\Cg-training\\notes\\copyExample.txt";

        File file = new File(sourceFile);

        if(!file.exists()){
            System.out.println("Error: source file not exists!!");
            return;
        }

    }
}
