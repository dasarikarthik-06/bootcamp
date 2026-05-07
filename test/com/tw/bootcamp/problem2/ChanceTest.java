package com.tw.bootcamp.problem2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {
    @Test
    void shouldGetTheGettingChance() throws Exception {
        Chance chance = Chance.createChance(0.5);
        assertEquals(Chance.createChance(0.5), chance);
    }

    @Test
    void shouldGetTheNonGettingChance() throws Exception {
        Chance chance = Chance.createChance(0.5);
        assertEquals(Chance.createChance(0.5), chance.not());
    }

    @Test
    void shouldGetTheChanceOfGettingTwoTails() throws Exception {
        Chance firstCoinTail = Chance.createChance(0.5);
        Chance secondCoilTail = Chance.createChance(0.5);
        assertEquals(Chance.createChance(0.25), firstCoinTail.and(secondCoilTail));
    }

    @Test
    void shouldGetTheChanceOfGettingAtLeastOneTailWithTwoCoinsFlip() throws Exception {
        Chance firstCoinTail = Chance.createChance(0.5);
        Chance secondCoinTail = Chance.createChance(0.5);
        assertEquals(Chance.createChance(0.75), firstCoinTail.or(secondCoinTail));
    }

    @Test
    void shouldDoOrOperation() throws Exception {
        Chance firstCoinTail = Chance.createChance(0.5);
        Chance secondCoinTail = Chance.createChance(0.4);
        assertEquals(Chance.createChance(0.70), firstCoinTail.or(secondCoinTail));
    }

    @Test
    void shouldThrowAnErrorIfProbabilityNotBetween0And1() {
        Exception exception = assertThrows(Exception.class, () -> Chance.createChance(12));
        assertEquals("Chance should be in between 0 and 1", exception.getMessage());
    }
}