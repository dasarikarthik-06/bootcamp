package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureTest {
    @Test
    void _212FIs100C() {
        Temperature celsius = Temperature.createCelsius(100, TemperatureUnit.C);
        Temperature farenheit = Temperature.createFarehneit(212, TemperatureUnit.F);
        assertTrue(celsius.equals(farenheit));
    }
}