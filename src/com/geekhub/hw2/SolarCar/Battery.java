package com.geekhub.hw2.SolarCar;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.parts.EnergySource;

public class Battery implements EnergySource {

    private int powerAmount;
    private final int engineCapacity = 3;

    public Battery(int powerAmount) {
        System.out.println(getClass().toString() + " - creating...");
        this.powerAmount = powerAmount;
    }

    @Override
    public Energy get() {
        System.out.println(getClass().toString() + " - get...");
        if (powerAmount > engineCapacity) {
            powerAmount -= engineCapacity;
        } else {
            System.out.println("Not enough power!");
        }
        return new Energy(engineCapacity);
    }
}
