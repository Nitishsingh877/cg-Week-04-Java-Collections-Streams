package com.nitish.Junit.advancejunit;

public class TemperatureConvertor {

    public double celsiusToFahrenheit(double celsius) {
        return (celsius*9.0/5.0) + 32.0;
    }

    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }

}
