package com.tw.bootcamp.p5;

import java.util.HashMap;

public class Bag {
    private final HashMap<BallColor, Integer> balls = new HashMap<>();

    private int getBallCount() {
        return balls.values().stream().mapToInt(x -> x).sum();
    }

    private boolean isFull() {
        int totalCount = getBallCount();
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
        if (isFull()) {
            return true;
        }

        int ballCount = balls.getOrDefault(color, 0);

        return switch (color) {
            case GREEN -> ballCount >= 3;
            case BLUE -> false;
            case RED -> getBallCountOf(BallColor.GREEN) * 2 <= ballCount;
            case YELLOW -> getBallCount() == 0 || ((ballCount + 1) / (getBallCount() + 1.0)) * 100 > 40;
        };
    }

    private Integer getBallCountOf(BallColor color) {
        return balls.getOrDefault(color, 0);
    }

    public String summary() {
        StringBuilder summary = new StringBuilder();
        for (BallColor color : balls.keySet()) {
            int count = getBallCountOf(color);
            summary.append(String.format("%-6s:%s%n", color, count));
        }
        summary.append("\n");
        summary.append(String.format("%-6s:%s%n", "Total", getBallCount()));

        return summary.toString();
    }
}
