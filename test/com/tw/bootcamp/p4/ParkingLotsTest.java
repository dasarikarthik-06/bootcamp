package com.tw.bootcamp.p4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParkingLotsTest {
    @Test
    void shouldCreateParkingLots() throws NegativeCapacityError {
        ParkingLots parkingLots = new ParkingLots();
        parkingLots.add(ParkingLot.createParkingLot(2));

        assertTrue(parkingLots.park());
        assertTrue(parkingLots.park());
        assertFalse(parkingLots.park());
    }

    @Test
    void shouldntParkIfParkingLotsAreNotThere() {
        ParkingLots parkingLots = new ParkingLots();
        assertFalse(parkingLots.park());
    }

    @Test
    void shouldParkOneAndShouldntParkAnother() throws NegativeCapacityError {
        ParkingLots parkingLots = new ParkingLots();
        parkingLots.add(ParkingLot.createParkingLot(1));
        parkingLots.add(ParkingLot.createParkingLot(1));
        assertTrue(parkingLots.park());
        assertTrue(parkingLots.park());
        assertFalse(parkingLots.park());
    }
}