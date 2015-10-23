package com.geekhub.hw2.vehicle;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.parts.EnergySource;


public class GasTank implements EnergySource {
   private Energy capability;
    public GasTank(Energy capability){
        this.capability = capability;

    }
    @Override
    public Energy get() {
        return new Energy(capability.getAmount()-5);
    }
}
