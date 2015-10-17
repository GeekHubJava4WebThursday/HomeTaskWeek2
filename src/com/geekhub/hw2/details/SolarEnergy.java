package com.geekhub.hw2.details;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.parts.EnergySource;

public class SolarEnergy implements EnergySource {

    private int charge;

    public SolarEnergy(int charge) {
        this.charge = charge;
    }

    @Override
    public int getAmount() {
        return charge;
    }

    public void addCharge(int charge) {
        this.charge += charge;
    }

    private void consumeEnergy(int amount) {
        this.charge -= amount;
    }

    private boolean isEnoughEnergy(int amount) {
        if (this.charge < amount) {
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
