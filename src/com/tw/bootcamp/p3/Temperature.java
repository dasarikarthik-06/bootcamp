package com.tw.bootcamp.p3;

import java.util.Objects;

public class Temperature {
    private final double value;
    private final TemperatureUnit unit;

    public Temperature(double value, TemperatureUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public static Temperature create(double value, TemperatureUnit unit) {
        return new Temperature(value, unit);
    }

    public static Temperature createCelsius(double value, TemperatureUnit unit) {
        return create(value, unit);
    }

    public static Temperature createFarehneit(double value, TemperatureUnit unit) {
        double valueInCelsius = (value - 32) * (5 / 9.0);
        return create(valueInCelsius, unit);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Temperature that = (Temperature) o;
        return Double.compare(value, that.value) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
