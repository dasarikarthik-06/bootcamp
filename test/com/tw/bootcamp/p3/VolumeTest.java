package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void oneGallonShouldBeThreeLiters() {
        Volume gallon = Volume.create(1, VolumeUnit.GAL);
        Volume liter = Volume.create(3.78, VolumeUnit.L);
        assertTrue(gallon.equals(liter));
    }

    @Test
    void oneGallonShouldBe5Liters() {
        Volume gallon = Volume.create(1, VolumeUnit.GAL);
        Volume liter = Volume.create(5, VolumeUnit.L);
        assertFalse(gallon.equals(liter));
    }

    @Test
    void tenLitershouldBeTenLiter() {
        Volume liter = Volume.create(10, VolumeUnit.L);
        Volume liter1 = Volume.create(10,VolumeUnit.L);
        assertTrue(liter.equals(liter1));
    }
    @Test
    void tenGallonShouldBe10Gallon() {
        Volume liter = Volume.create(10, VolumeUnit.GAL);
        Volume liter1 = Volume.create(10, VolumeUnit.GAL);
        assertTrue(liter.equals(liter1));
    }

}