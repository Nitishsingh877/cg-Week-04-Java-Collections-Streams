package com.datastreams;

import java.io.*;

public class StoreandRetrivePrimitiveData {
    public static void main(String[] args) {
        String filePath = "C:\\Users\\NITISH SINGH\\OneDrive\\Desktop\\Cg-training\\Week04\\Day03-JavaStreams\\src\\main\\resources\\Student.bin";

        //write student details.
        try(DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(filePath))) {
            dataOutputStream.writeInt(1);
            dataOutputStream.writeUTF("nitish singh");
            dataOutputStream.writeDouble(4.8);

            dataOutputStream.writeInt(2);
            dataOutputStream.writeUTF("siddhu singh");
            dataOutputStream.writeDouble(8.5);

        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        //write student details
        try(DataInputStream dataInputStream = new DataInputStream(new FileInputStream(filePath))){
            System.out.println("Student details!!");
            int n = 2;
            while (n --> 0){
                System.out.println("Name: " + dataInputStream.readInt() + " RollNumber " + dataInputStream.readUTF() + " GPA :" + dataInputStream.readDouble());

            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
