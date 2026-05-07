package com.tw.bootcamp.p2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChanceTest {
    @Test
    void shouldGetTheGettingChance() throws  InvalidProbabilityCreationError {
        Chance chance = Chance.createChance(0.5);
        assertEquals(Chance.createChance(0.5), chance);
    }

    @Test
    void shouldGetTheNonGettingChance() throws InvalidProbabilityCreationError {
        Chance chance = Chance.createChance(0.5);
        assertEquals(Chance.createChance(0.5), chance.compliment());
    }

    @Test
    void shouldGetTheChanceOfGettingTwoTails() throws InvalidProbabilityCreationError {
        Chance firstCoinTail = Chance.createChance(0.5);
        Chance secondCoilTail = Chance.createChance(0.5);
        assertEquals(Chance.createChance(0.25), firstCoinTail.and(secondCoilTail));
    }

    @Test
    void shouldGetTheChanceOfGettingAtLeastOneTailWithTwoCoinsFlip() throws InvalidProbabilityCreationError {
        Chance firstCoinTail = Chance.createChance(0.5);
        Chance secondCoinTail = Chance.createChance(0.5);
        assertEquals(Chance.createChance(0.75), firstCoinTail.or(secondCoinTail));
    }

    @Test
    void shouldDoOrOperation() throws InvalidProbabilityCreationError {
        Chance firstCoinTail = Chance.createChance(0.5);
        Chance secondCoinTail = Chance.createChance(0.4);
        assertEquals(Chance.createChance(0.70), firstCoinTail.or(secondCoinTail));
    }

    @Test
    void shouldThrowAnErrorIfProbabilityComplimentBetween0And1() {
        InvalidProbabilityCreationError exception = assertThrows(InvalidProbabilityCreationError.class, () -> Chance.createChance(12));
        assertEquals("Invalid probability creation error", exception.getMessage());
    }
}