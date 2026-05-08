package com.tw.bootcamp.p3;

public enum VolumeUnit {
    L(1),GAL(3.78);

    public final double baseValue;

    VolumeUnit(double baseValue) {
        this.baseValue = baseValue;
    }
}
