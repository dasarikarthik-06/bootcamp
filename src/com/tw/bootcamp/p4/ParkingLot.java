package com.tw.bootcamp.p4;

public class ParkingLot {
    private final int capacity;
    private int usedSlots;

    private ParkingLot(int capacity) {
        this.capacity = capacity;
        this.usedSlots = 0;
    }

    public static ParkingLot createParkingLot(int capacity) throws NegativeCapacityError {
        if(capacity <= 0) {
            throw new NegativeCapacityError();
        }
        return new ParkingLot(capacity);
    }

    public boolean hasParkingLotFulled(){
        return capacity == usedSlots;
    }

    public boolean park() {
        if (hasParkingLotFulled()) return false;
        usedSlots++;
        return true;
    }
}
