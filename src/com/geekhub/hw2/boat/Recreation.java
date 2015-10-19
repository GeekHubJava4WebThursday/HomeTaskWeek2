package com.geekhub.hw2.boat;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.parts.EnergySource;

public class Recreation implements EnergySource {

    private int amountOfEnergy;
    private final int power = 1;

    public Recreation(int amountOfEnergy) {
        System.out.println(getClass().toString() + " - creating...");
        this.amountOfEnergy = amountOfEnergy;
    }

    @Override
    public Energy get() {
        System.out.println(getClass().toString() + " - get...");
        if (amountOfEnergy > power) {
            amountOfEnergy -= power;
        } else {
            System.out.println("Not enough human power!");
        }
        return new Energy(power);
    }
}
