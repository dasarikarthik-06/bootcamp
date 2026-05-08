package com.tw.bootcamp.p3;

import java.util.Objects;

public class Volume {
    private final double unitValue;
    private final VolumeUnit unit;

    private Volume(double unitValue, VolumeUnit unit) {
        this.unitValue = unitValue;
        this.unit = unit;
    }

    public static Volume create(double unitValue, VolumeUnit unit) throws InvalidVolumeError {
        if(unitValue < 0) {
            throw new InvalidVolumeError();
        }
        return new Volume(unitValue*unit.baseValue, unit);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Math.abs(unitValue- volume.unitValue) < 0.1;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(unitValue);
    }

    public Volume add(Volume other) throws InvalidVolumeError {
        return create(unitValue + other.unitValue, VolumeUnit.L);
    }

    @Override
    public String toString() {
        return Math.round(unitValue) + " " + unit;
    }
}
