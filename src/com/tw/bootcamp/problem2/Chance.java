package com.tw.bootcamp.problem2;

import java.util.Objects;

public class Chance {
    double chance;

    private Chance(double chance) {
        this.chance = chance;
    }

    public static Chance createChance(double chance) throws Exception {
        if (chance > 1 || chance < 0) {
            throw new Exception("Chance should be in between 0 and 1");
        }
        return new Chance(chance);
    }

    public Chance not() throws Exception {
        return createChance(1 - chance);
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

    public Chance and(Chance otherChance) throws Exception {
        double combinedProbability = chance * otherChance.chance;
        return createChance(combinedProbability);
    }

    public Chance or(Chance otherChance) throws Exception {
        Chance thisComplement = this.not();
        Chance otherComplement = otherChance.not();

        return thisComplement.and(otherComplement).not();
    }
}
