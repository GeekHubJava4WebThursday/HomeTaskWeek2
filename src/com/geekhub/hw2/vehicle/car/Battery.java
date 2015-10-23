package com.geekhub.hw2.vehicle.car;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.parts.EnergySource;


public class Battery implements EnergySource {
    private Energy capability;
    public Battery(Energy capability){
        this.capability = capability;

    }
    @Override
    public Energy get() {
        return new Energy(capability.getAmount()-30);
    }
}
