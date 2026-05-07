package com.tw.bootcamp.problem1;

public class Rectangle {
    private final float length;
    private final float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }


    public float calculateArea() {
        return length * width;
    }

    public float calculatePerimeter() {
        return 2 * (length + width);
    }
}
