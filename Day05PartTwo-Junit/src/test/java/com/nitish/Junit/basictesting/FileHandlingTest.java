package com.nitish.Junit.basictesting;

import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class FileHandlingTest {
    private final String filepath = "C:\\Users\\NITISH SINGH\\OneDrive\\Desktop\\Cg-training\\Week04\\Day05PartTwo-Junit\\src\\main\\resources\\text.txt";

    FileHandling fileHandling = new FileHandling();

    @Test
    void writeFile() {
        String input = "hello";
        fileHandling.WriteFile(filepath,input);
        String readContent = fileHandling.readFromFile(filepath);
        assertEquals(input,readContent);
    }

    @Test
    void readFromFile() {
    }
}