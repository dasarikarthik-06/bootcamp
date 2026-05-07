package com.tw.bootcamp.problem1;

public class Square {
    private final float side;

    public Square(float side) {
        this.side = side;
    }

    public float calculateArea() {
        return side *side;
    }

    public float calculatePerimeter() {
        return 4 * side;
    }
}
