package com.tw.bootcamp.p5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BagTests {
    @Test
    void shouldAddBalls() {
        Bag bag = new Bag();
        boolean isAdded = bag.addBall(BallColor.BLUE);
        assertTrue(isAdded);
    }

    @Test
    void shouldNotAddBallIfTheBagHasTwelveOrMore() {
        Bag bag = new Bag();
        for (int i = 0; i < 12; i++) {
            bag.addBall(BallColor.BLUE);
        }
        boolean isAdded = bag.addBall(BallColor.BLUE);
        assertFalse(isAdded);
    }

    @Test
    void shouldNotAddMoreThan3GreenBalls() {
        Bag bag = new Bag();

        assertTrue(bag.addBall(BallColor.GREEN));
        assertTrue(bag.addBall(BallColor.GREEN));
        assertTrue(bag.addBall(BallColor.GREEN));
        assertFalse(bag.addBall(BallColor.GREEN));
    }
}