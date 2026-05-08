package com.tw.bootcamp.p3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VolumeTest {
    @Test
    void oneGallonShouldBeThreeLiters() throws InvalidVolumeError {
        Volume gallon = Volume.create(1, VolumeUnit.GAL);
        Volume liter = Volume.create(3.78, VolumeUnit.L);
        assertTrue(gallon.equals(liter));
    }

    @Test
    void oneGallonShouldBe5Liters() throws InvalidVolumeError {
        Volume gallon = Volume.create(1, VolumeUnit.GAL);
        Volume liter = Volume.create(5, VolumeUnit.L);
        assertFalse(gallon.equals(liter));
    }

    @Test
    void tenLitershouldBeTenLiter() throws InvalidVolumeError {
        Volume liter = Volume.create(10, VolumeUnit.L);
        Volume liter1 = Volume.create(10,VolumeUnit.L);
        assertTrue(liter.equals(liter1));
    }
    @Test
    void tenGallonShouldBe10Gallon() throws InvalidVolumeError {
        Volume liter = Volume.create(10, VolumeUnit.GAL);
        Volume liter1 = Volume.create(10, VolumeUnit.GAL);
        assertTrue(liter.equals(liter1));
    }

    @Test
    void oneGallonPlusOneLiterIs4Point78Liter() throws InvalidVolumeError {
        Volume oneGallon = Volume.create(1, VolumeUnit.GAL);
        Volume oneLiter = Volume.create(1, VolumeUnit.L);

        Volume res = oneGallon.add(oneLiter);
        assertEquals(Volume.create(4.78,VolumeUnit.L),res);
    }

    @Test
    void forNegativeValuesItShouldThrowError() throws InvalidVolumeError {
        InvalidVolumeError invalidVolumeError = assertThrows(InvalidVolumeError.class, () -> Volume.create(-9, VolumeUnit.L));
        assertEquals("Volume should be greater than zero", invalidVolumeError.getMessage());
    }
}