package com.geekhub.hw2.details;

import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.FuelTank;

public class Battery implements FuelTank {

    private SolarEnergy solarEnergy;

    public Battery(int charge, int maxCapacity) {
        if (charge > maxCapacity) {
            System.out.println("Ba-da boom!");
            solarEnergy = null;
        } else {
            solarEnergy = new SolarEnergy(charge);
        }
    }

    @Override
    public void add(int amount) {
        solarEnergy.addCharge(amount);
    }

    @Override
    public EnergySource get() {
        return solarEnergy;
    }
}
