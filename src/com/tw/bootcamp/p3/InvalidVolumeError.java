package com.tw.bootcamp.p3;

public class InvalidVolumeError extends Throwable {
    public InvalidVolumeError() {
        super("Volume should be greater than zero");
    }
}
