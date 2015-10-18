package com.geekhub.hw2.parts.engine;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.Force;

public class InternalCombustionEngine implements Engine {
    private final double EFFICIENCY = 0.4;

    @Override
    public Force transform(Energy energy) {
        return new Force(convertChemicalEnergy(energy.getAmount()));
    }

    private int convertChemicalEnergy(int amount){
        return (int) (amount * EFFICIENCY);
    }
}
