package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void oneFeetShouldBeTwelveInch() throws InvalidLengthError {
        Length feet = Length.createFeet(1);
        Length inch = Length.createInch(12);
        assertTrue(feet.equals(inch));
    }

    @Test
    void twoInchShouldBeFiveCm() throws InvalidLengthError {
        Length inch = Length.createInch(2);
        Length centimeter = Length.createCentimeter(5);
        assertTrue(inch.equals(centimeter));
    }

    @Test
    void fiveCMShouldBeFiveCM() throws InvalidLengthError {
        Length centimeter = Length.createCentimeter(5);
        Length centimeter1 = Length.createCentimeter(5);
        assertTrue(centimeter.equals(centimeter1));
    }

    @Test
    void TenMMShouldEqualsToOneCM() throws InvalidLengthError {
        Length centimeter = Length.createCentimeter(1);
        Length milliMeter = Length.createMillimeter(10);
        assertTrue(centimeter.equals(milliMeter));
    }



    @Test
    void ShouldThrowAnErrorIfAnyValueIsLessThanZero() {
        InvalidLengthError invalidLengthError = assertThrows(InvalidLengthError.class, () -> Length.createCentimeter(-99));
        assertEquals("Invalid length value", invalidLengthError.getMessage());
    }
}