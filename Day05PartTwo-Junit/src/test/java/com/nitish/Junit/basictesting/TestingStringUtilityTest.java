package com.nitish.Junit.basictesting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingStringUtilityTest {

    @Test
    void reverse() {
        assertEquals("aba",TestingStringUtility.Reverse("aba"));
        System.out.println("reverse passed!!");
    }

    @Test
    void isPalindrome() {
        assertTrue(TestingStringUtility.isPalindrome("aba"));
        System.out.println("Palindrome passed!!");
    }

    @Test
    void toUpperCase() {
        assertEquals("ABA",TestingStringUtility.toUpperCase("aba"));
        System.out.println("Uppercase passed!!");
    }


}