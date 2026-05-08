package com.tw.bootcamp.p4;

public class NegativeCapacityError extends Throwable {
    public NegativeCapacityError() {
        super("Invalid capacity count");
    }
}
