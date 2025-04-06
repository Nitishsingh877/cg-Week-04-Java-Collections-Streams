package com.nitish.Junit.basictesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        assertEquals(5,Calculator.add(2,3),"not passed");
        System.out.println("test case passed for addition.");
    }

    @Test
    void sub() {
        assertEquals(0,Calculator.sub(3,3),"not passed");
        System.out.println("test case passed for Subtraction.");
    }

    @Test
    void multiply() {
        assertEquals(6,Calculator.multiply(2,3),"not passed");
        System.out.println("test case passed for multiply.");
    }

    @Test
    void divide() {
        assertEquals(1,Calculator.divide(3,3),"not passed");
        System.out.println("test case passed for Division.");
    }
}