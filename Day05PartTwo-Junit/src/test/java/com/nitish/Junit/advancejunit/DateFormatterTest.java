package com.nitish.Junit.advancejunit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class DateFormatterTest {
    DateFormatter dateFormatter;

    @BeforeEach
    void setup(){
        dateFormatter = new DateFormatter();
    }

    @Test
    void formatDate() {
        assertEquals("28-11-2023",dateFormatter.formatDate("2023-11-28"),"not successful conversion.");
    }
}