package com.nitish.Junit.advancejunit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordStrengthTest {
    PasswordStrength passwordStrength = new PasswordStrength();

    @Test
    void main() {
        assertTrue(passwordStrength.isValid("Nitish@09"));
        assertTrue(passwordStrength.isValid("Ddvnjvdn@D09"));
    }
}