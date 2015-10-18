package com.geekhub.hw2.parts.engine;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.Force;

public class ElectricEngine implements Engine {
    private final double EFFICIENCY = 0.8;

    @Override
    public Force transform(Energy energy) {
        return new Force(convertElectricEnergy(energy.getAmount()));
    }

    private int convertElectricEnergy(int amount){
        return (int) (amount * EFFICIENCY);
    }
}
