package com.tw.bootcamp.problem1;

public class Rectangle implements Polygon {
    private final float length;
    private final float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(float side) {
        this.length = side;
        this.width = side;
    }


    @Override
    public float calculateArea() {
        return length * width;
    }

    @Override
    public float calculatePerimeter() {
        return 2 * (length + width);
    }


}
