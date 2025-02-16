package com.nitish.Junit.basictesting;

public class DatabaseConnection {
    private boolean isConnected;
    public void connect(){
        System.out.println("Database Connected !");
        isConnected = true;
    }

    public boolean isConnected() {
        return isConnected;
    }

    public void disconnect(){
        System.out.println("Database Disconnected !");
        isConnected = false;
    }
}
