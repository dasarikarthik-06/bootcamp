package com.tw.bootcamp.p3;

import java.util.Objects;

public class Length {
    private final double unitValue;
    private final LengthUnit unit;

    private Length(double unitValue, LengthUnit unit) {
        this.unitValue = unitValue;
        this.unit = unit;
    }

    public static Length create(double unitValue, LengthUnit lengthUnit) throws InvalidLengthError {
        if (unitValue < 0) {
            throw new InvalidLengthError();
        }
        return new Length(unitValue* lengthUnit.baseValue, lengthUnit);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Math.abs(unitValue- length.unitValue) < 0.1;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(unitValue);
    }

    public Length add(Length other) throws InvalidLengthError {
        return create(this.unitValue + other.unitValue, LengthUnit.CM);
    }
}
