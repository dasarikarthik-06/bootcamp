package com.tw.bootcamp.p5;

public class Bag {
    private final int capacity = 12;
    private int ballCount = 0;

    public boolean addBall() {
        if (ballCount >= 12) {
            return false;
        }

        ballCount++;
        return true;
    }
}
