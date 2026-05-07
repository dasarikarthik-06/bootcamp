package com.tw.bootcamp.p2;

import java.util.Objects;

public class Chance {
    double chance;

    private Chance(double chance) {
        this.chance = chance;
    }

    public static Chance createChance(double chance) throws InvalidProbabilityCreationError {
        if (chance > 1 || chance < 0) {
            throw new InvalidProbabilityCreationError();
        }
        return new Chance(chance);
    }

    public Chance compliment() throws InvalidProbabilityCreationError {
        return createChance(1 - chance);
    }

    public Chance and(Chance other) throws InvalidProbabilityCreationError {
        double combinedProbability = chance * other.chance;
        return createChance(combinedProbability);
    }

    public Chance or(Chance other) throws InvalidProbabilityCreationError {
        return this.compliment().and(other.compliment()).compliment();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Chance chance1 = (Chance) o;
        return Double.compare(chance, chance1.chance) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(chance);
    }
}
