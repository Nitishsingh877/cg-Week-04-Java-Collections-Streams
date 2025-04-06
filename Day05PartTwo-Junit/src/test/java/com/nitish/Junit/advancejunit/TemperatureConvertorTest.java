package com.nitish.Junit.advancejunit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConvertorTest {
    TemperatureConvertor temperatureConvertor;
    @BeforeEach
    void Setup(){
        temperatureConvertor = new TemperatureConvertor();
    }

    @Test
    void celsiusToFahrenheit() {
        assertEquals(77.0,temperatureConvertor.celsiusToFahrenheit(25.0));
    }

    @Test
    void fahrenheitToCelsius() {
        assertEquals(25.0,temperatureConvertor.fahrenheitToCelsius(77.0));
    }
}