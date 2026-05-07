package com.tw.bootcamp.p1;

public class Rectangle {
    private final float length;
    private final float width;

    private Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public static Rectangle createSquare(float side) throws InvalidRectangleCreationError {
        return createRectangle(side, side);
    }

    public static Rectangle createRectangle(float length, float width) throws InvalidRectangleCreationError {
        if (length <= 0 || width <= 0) {
            throw new InvalidRectangleCreationError();
        }
        return new Rectangle(length, width);
    }

    public float calculateArea() {
        return length * width;
    }

    public float calculatePerimeter() {
        return 2 * (length + width);
    }

    public boolean isSquare() {
        return length == width;
    }
}
