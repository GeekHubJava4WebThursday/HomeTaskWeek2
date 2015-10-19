package com.geekhub.hw2.car;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.parts.EnergySource;

public class GasTank implements EnergySource {

    private int amount;
    private final int engineCapacity = 1;

    public GasTank(int amount) {
        System.out.println(getClass().toString() + " - creating...");
        this.amount = amount;
    }

    @Override
    public Energy get() {
        System.out.println(getClass().toString() + " - get...");
        if (amount > engineCapacity) {
            amount -= engineCapacity;
        } else {
            System.out.println("Not enough gasoline!");
        }
        return new Energy(engineCapacity);
    }
}
