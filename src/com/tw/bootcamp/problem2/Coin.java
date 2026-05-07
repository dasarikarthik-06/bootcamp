package com.tw.bootcamp.problem2;

import java.util.List;

public class Coin {
    private final List<String> sides;

    public Coin() {
        sides = List.of("head", "tail");
    }

    public double getProbabilityOf(String side) {
        List<String> tails = sides.stream().filter((x) -> x == side.toLowerCase()).toList();
        return ((double) tails.size() / sides.size()) * 100;
    }

    public double getProbabilityNotTail() {
        return getProbabilityOf("head");
    }
}
