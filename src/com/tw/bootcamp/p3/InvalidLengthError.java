package com.tw.bootcamp.p3;

public class InvalidLengthError extends Throwable {
    public InvalidLengthError() {
        super("Invalid length value");
    }
}
