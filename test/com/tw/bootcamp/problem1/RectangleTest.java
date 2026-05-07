package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldCalculateAreaOf1X1() {
        Rectangle rectangle = new Rectangle(1, 1);
        float area = rectangle.calculateArea();
        assertEquals(1.0f, area);
    }

    @Test
    void shouldCalculatePerimeterOfARectangleOf1X2() {
        Rectangle rectangle = new Rectangle(1, 2);
        float perimeter = rectangle.calculatePerimeter();
        assertEquals(6.0f, perimeter);
    }
}