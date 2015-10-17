package com.geekhub.hw2.details;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.parts.EnergySource;

public class Gas implements EnergySource {

    private int amount;

    public Gas(int amount) {
        this.amount = amount;
    }

    private void consumeEnergy(int amount) {
        this.amount -= amount;
    }

    private boolean isEnoughEnergy(int amount) {
        if (this.amount < amount) {
            System.out.println("Not enough energy!");
            return false;
        }
        return true;
    }

    @Override
    public Energy get(int amount) {
        if (isEnoughEnergy(amount)) {
            consumeEnergy(amount);
            return new Energy(amount);
        }
        return null;
    }
}
