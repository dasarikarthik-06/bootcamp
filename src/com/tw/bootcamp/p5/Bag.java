package com.tw.bootcamp.p5;

import java.util.HashMap;

public class Bag {
    private final HashMap<BallColor, Integer> balls = new HashMap<>();

    private boolean isFull() {
        int totalCount = balls.values().stream().mapToInt(x -> x).sum();
        return totalCount >= 12;
    }

    public boolean addBall(BallColor color) {
        if (cannotStore(color)) {
            return false;
        }

        int ballCount = balls.getOrDefault(color, 0);
        balls.put(color, ballCount + 1);
        return true;
    }

    private boolean cannotStore(BallColor color) {
        int ballCount = balls.getOrDefault(color, 0);

        return (ballCount >= 3 && color == BallColor.GREEN) || isFull();
    }
}
