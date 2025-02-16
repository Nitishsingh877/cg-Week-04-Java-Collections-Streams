package com.nitish.Junit.basictesting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseConnectionTest {
    DatabaseConnection databaseConnection = new DatabaseConnection();

    @BeforeEach
    void setup(){
        databaseConnection.connect();
    }
    @Test
    void connect(){
        assertTrue(databaseConnection.isConnected());
    }
    @Test
    void disconnct() {
        databaseConnection.disconnect();
        assertTrue(databaseConnection.isConnected());
    }



}