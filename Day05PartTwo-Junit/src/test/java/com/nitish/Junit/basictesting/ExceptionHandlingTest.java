package com.nitish.Junit.basictesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExceptionHandlingTest {
    ExceptionHandling exceptionHandling = new ExceptionHandling();

    @Test
    void divide() {
        Exception exception = assertThrows(ArithmeticException.class,() -> exceptionHandling.Divide(10,0));
        assertEquals("cant  be divided by zero",exception.getMessage());
    }
    @Test
    void delete2() {
        assertEquals(10,exceptionHandling.Divide(100,10));
    }
}