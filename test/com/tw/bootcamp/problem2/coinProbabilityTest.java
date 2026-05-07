package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class coinProbabilityTest {

    @Test
    void shouldGetTheProbabilityOfTailsWhenFlips() {
        Coin coin = new Coin();
        double probability = coin.getProbabilityOf("tail");
        assertEquals(50.0, probability);
    }

    @Test
    void shouldGetTheProbabilityOfNotGettingTail() {
        Coin coin = new Coin();
        double probability = coin.getProbabilityNotTail();
        assertEquals(50.0, probability);
    }
}