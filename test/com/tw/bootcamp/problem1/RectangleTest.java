package com.tw.bootcamp.problem1;

import org.junit.jupiter.api.Test;
import org.w3c.dom.css.Rect;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void shouldCalculateAreaOf1X1() {
        Rectangle rectangle = Rectangle.createRectangle(1, 1);
        float area = rectangle.calculateArea();
        assertEquals(1.0f, area);
    }

    @Test
    void shouldCalculatePerimeterOfARectangleOf1X2() {
        Rectangle rectangle = Rectangle.createRectangle(1, 2);
        float perimeter = rectangle.calculatePerimeter();
        assertEquals(6.0f, perimeter);
    }

    @Test
    void shouldCalculateAreaOfASquare() {
        Rectangle square = Rectangle.createSquare(1);
        float area = square.calculateArea();
        assertEquals(1.0, area);
    }

    @Test
    void shouldCalculatePerimeterOfSquare() {
        Rectangle square = Rectangle.createSquare(1);
        float area = square.calculatePerimeter();
        assertEquals(4.0, area);
    }

    @Test
    void shouldCheckIsSquare() {
        Rectangle square = Rectangle.createSquare(2);
        assertTrue(square.isSquare());
    }
}