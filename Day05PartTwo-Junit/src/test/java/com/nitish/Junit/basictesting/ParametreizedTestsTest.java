package com.nitish.Junit.basictesting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class ParametreizedTestsTest {
    ParametreizedTests parametreizedTests = new ParametreizedTests();

    @Test
    void isEven() {
        assertTrue(parametreizedTests.isEven(6));
    }
    @ParameterizedTest
    @ValueSource(ints = {1,2,4,6,9})
    void isNumber(int num){
        assertTrue(parametreizedTests.isEven(num));
    }
}