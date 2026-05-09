package com.tw.bootcamp.p5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class bagTests {
    @Test
    void shouldAddBalls() {
        Bag bag = new Bag();
        boolean isAdded = bag.addBall();
        assertTrue(isAdded);
    }

    @Test
    void shouldntAddBallIfTheBagHasTwelveOrMore() {
        Bag bag = new Bag();
        for (int i = 0; i < 12; i++) {
            bag.addBall();
        }
        boolean isAdded = bag.addBall();
        assertFalse(isAdded);
    }
}