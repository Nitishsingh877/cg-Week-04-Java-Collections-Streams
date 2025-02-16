package com.nitish.Junit.advancejunit;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    public String formatDate(String input){
        try {
            LocalDate date = LocalDate.parse(input, DateTimeFormatter.ofPattern("yyyy-MM-dd"));

            return date.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        }catch (DateTimeException e){
            return "Invalid date format.";
        }
    }
}
