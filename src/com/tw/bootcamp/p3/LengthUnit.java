package com.tw.bootcamp.p3;

public enum LengthUnit {
    CM(0.4), IN(1), FT(12), MM(0.04);

    public final double baseValue;

    LengthUnit(double baseValue) {
        this.baseValue = baseValue;
    }
}
