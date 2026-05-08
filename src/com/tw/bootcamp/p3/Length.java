package com.tw.bootcamp.p3;

import java.util.Objects;

public class Length {
    private final double unitValue;

    private Length(double unitValue) {
        this.unitValue = unitValue;
    }

    public static Length createFeet(double feet) throws InvalidLengthError {
        return createCentimeter(feet * 30.48);
    }

    public static Length createInch(double inch) throws InvalidLengthError {

        return createCentimeter(inch * 2.54);
    }

    public static Length createMillimeter(double mm) throws InvalidLengthError {
        return createCentimeter(mm * 0.1);
    }

    public static Length createCentimeter(double cm) throws InvalidLengthError {
        if (cm < 0) {
            throw new InvalidLengthError();
        }
        return new Length(cm);
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Math.abs(unitValue - length.unitValue) < 0.1;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(unitValue);
    }
}
