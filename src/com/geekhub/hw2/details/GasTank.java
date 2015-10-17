package com.geekhub.hw2.details;

import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.FuelTank;

public class GasTank implements FuelTank {

    private Gas gas;

    public GasTank(int gasAmount, int maxCapacity) {
        if (gasAmount > maxCapacity) {
            System.out.println("Fuel spilled from the tank");
            gas = new Gas(maxCapacity);
        } else {
            gas = new Gas(gasAmount);
        }
    }

    @Override
    public void add(int amount) {

    }

    @Override
    public EnergySource get() {
        return gas;
    }
}
