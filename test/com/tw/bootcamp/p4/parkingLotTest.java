package com.tw.bootcamp.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class parkingLotTest {
    @Test
    void shouldParkInTheLot() throws NegativeCapacityError {
        ParkingLot parkingLot = ParkingLot.createParkingLot(2);
        boolean isPark = parkingLot.park();
        assertTrue(isPark);
    }

    @Test
    void ifSlotsFullCarShouldntAbleToPark() throws NegativeCapacityError {
        ParkingLot parkingLot = ParkingLot.createParkingLot(1);
        parkingLot.park();
        boolean park = parkingLot.park();
        assertFalse(park);
    }

    @Test
    void hasParkingLotFulled() throws NegativeCapacityError {
        ParkingLot parkingLot = ParkingLot.createParkingLot(1);
        parkingLot.park();
        assertTrue(parkingLot.hasParkingLotFulled());
    }

    @Test
    void shouldThrowAnErrorIfCountLessThanZero() {
        NegativeCapacityError negativeCapacityError = assertThrows(NegativeCapacityError.class, () -> ParkingLot.createParkingLot(0));
        assertEquals("Invalid capacity count", negativeCapacityError.getMessage());
    }
}