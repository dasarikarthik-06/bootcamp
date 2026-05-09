package com.tw.bootcamp.p4;

import java.util.ArrayList;

public class ParkingLots {
    private final ArrayList<ParkingLot> parkingLots;
    private int parkingLotNo = 0;

    public ParkingLots() {
        this.parkingLots = new ArrayList<>();
    }

    public void add(ParkingLot parkingLot) {
        parkingLots.add(parkingLot);
    }

    private boolean hasAllParkingLotsUsed(){ //
        return parkingLots.size() == parkingLotNo;
    }

    public boolean park() {
        if (hasAllParkingLotsUsed()) return false;
        ParkingLot currentLot = getCurrentLot();
        return currentLot.park();
    }

    private ParkingLot getCurrentLot() {
        if (hasAllParkingLotsUsed()) return parkingLots.get(parkingLotNo - 1);

        ParkingLot parkingLot = parkingLots.get(parkingLotNo);

        if ( parkingLot.hasParkingLotFulled()) {
            parkingLotNo++;
            return getCurrentLot();
        }

        return parkingLot;
    }


}
