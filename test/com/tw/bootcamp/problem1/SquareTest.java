package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void shouldCalculateAreaOfASquare() {
        Square square = new Square(1);
        float area = square.calculateArea();
        assertEquals(1.0, area);
    }

    @Test
    void shouldCalculatePerimeterOfSquare() {
        Square square = new Square(1);
        float area = square.calculatePerimeter();
        assertEquals(4.0, area);
    }

}