package com.tw.bootcamp.p3;

public enum LengthUnit {
    CM(1), IN(2.54), FT(30.48), MM(0.1);

    public final double baseValue;

    LengthUnit(double baseValue) {
        this.baseValue = baseValue;
    }
}
