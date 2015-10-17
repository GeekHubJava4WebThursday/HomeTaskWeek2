package com.geekhub.hw2.parts.sharedParts;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.parts.interfaces.EnergySource;

public class GasTank implements EnergySource {

    private static final float FUEL_PORTION = 0.01F;
    private static final int ENERGY_PORTION = 100;

    private final float volume;
    private float fuel;

    public GasTank(float volume, float fuel) {
        this.volume = volume;
        this.fuel = fuel;
    }

    public GasTank(float volume) {
        this(volume, 0);
    }

    public float addFuel(float fuel) {
        if (this.fuel + fuel <= volume) {
            this.fuel += fuel;
            return 0;
        } else {
            this.fuel = volume;
            return (fuel - (volume - this.fuel));
        }
    }

    @Override
    public Energy get() {
        if (fuel >= FUEL_PORTION) {
            fuel -= FUEL_PORTION;
            return new Energy(ENERGY_PORTION);
        } else {
            Energy energyRest = new Energy(Math.round(ENERGY_PORTION * fuel / FUEL_PORTION));
            fuel = 0;
            return energyRest;
        }

    }

}
