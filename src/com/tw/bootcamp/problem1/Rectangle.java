package com.tw.bootcamp.problem1;

public class Rectangle {
    private final float length;
    private final float width;

    private Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public static Rectangle createSquare(float side) {
        return createRectangle(side, side);
    }

    public static Rectangle createRectangle(float length, float width) {
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
