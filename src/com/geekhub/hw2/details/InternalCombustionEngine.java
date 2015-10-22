package com.geekhub.hw2.details;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.Engine;

public class InternalCombustionEngine implements Engine {

    @Override
    public Force transform(Energy energy) {
        if (energy == null) {
            System.out.println("The vehicle will not go further");
            return null;
        }
        return new Force(energy.getAmount());
    }
}
