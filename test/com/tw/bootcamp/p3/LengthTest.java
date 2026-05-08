package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthTest {
    @Test
    void oneFeetShouldBeTwelveInch() throws InvalidLengthError {
        Length feet = Length.create(1, LengthUnit.FT);
        Length inch = Length.create(12, LengthUnit.IN);
        assertTrue(feet.equals(inch));
    }

    @Test
    void twoInchShouldBeFiveCm() throws InvalidLengthError {
        Length inch = Length.create(2, LengthUnit.IN);
        Length centimeter = Length.create(5, LengthUnit.CM);
        assertTrue(inch.equals(centimeter));
        System.out.println(centimeter);
        System.out.println(inch);
    }

    @Test
    void fiveCMShouldBeFiveCM() throws InvalidLengthError {
        Length centimeter = Length.create(5, LengthUnit.CM);
        Length centimeter1 = Length.create(5, LengthUnit.CM);
        assertTrue(centimeter.equals(centimeter1));
    }

    @Test
    void TenMMShouldEqualsToOneCM() throws InvalidLengthError {
        Length centimeter = Length.create(1, LengthUnit.CM);
        Length milliMeter = Length.create(10, LengthUnit.MM);
        assertTrue(centimeter.equals(milliMeter));
    }

    @Test
    void ShouldThrowAnErrorIfAnyValueIsLessThanZero() {
        InvalidLengthError invalidLengthError = assertThrows(InvalidLengthError.class, () -> Length.create(-99, LengthUnit.CM));
        assertEquals("Invalid length value", invalidLengthError.getMessage());
    }

    @Test
    void twoInchPlusTwoInchIsRInch() throws InvalidLengthError {
        Length inch1 = Length.create(2, LengthUnit.IN);
        Length inch2 = Length.create(2,LengthUnit.IN);
        Length expected = Length.create(4, LengthUnit.IN);
        assertEquals(expected, inch1.add(inch2));
    }

    @Test
    void twoInchPlusTwoPointFiveCMIsThreeInch() throws InvalidLengthError {
        Length twoInch = Length.create(2, LengthUnit.IN);
        Length twoPointFiveCM = Length.create(2.5, LengthUnit.CM);
        assertEquals(Length.create(3,LengthUnit.IN), twoInch.add(twoPointFiveCM));
    }
}