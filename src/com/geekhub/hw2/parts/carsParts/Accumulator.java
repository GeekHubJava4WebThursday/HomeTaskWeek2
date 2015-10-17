package com.geekhub.hw2.parts.carsParts;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.parts.interfaces.EnergySource;

public class Accumulator implements EnergySource {

    private static final float CHARGE_PORTION = 0.05F;
    private static final int ENERGY_PORTION = 100;

    private float charge;

    public Accumulator(float charge) {
        if (charge < 0 || charge > 100) {
            throw new IllegalArgumentException("Percentage of accumulator charging must be between 0 and 100");
        }
        this.charge = charge;
    }

    public void charging() {
        charge = 100;
    }

    @Override
    public Energy get() {
        if (charge >= CHARGE_PORTION) {
            charge -= CHARGE_PORTION;
            return new Energy(ENERGY_PORTION);
        } else {
            Energy energyRest = new Energy(Math.round(ENERGY_PORTION * charge / CHARGE_PORTION));
            charge = 0;
            return energyRest;
        }

    }

}
