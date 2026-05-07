package com.tw.bootcamp.p1;

public class InvalidRectangleCreationError extends Throwable {
    public InvalidRectangleCreationError() {
        super("Invalid length or width");
    }
}
