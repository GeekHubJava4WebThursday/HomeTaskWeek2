package com.geekhub.hw2.parts;

import com.geekhub.hw2.Energy;

public class GasTank implements EnergySource {

    @Override
    public Energy get() {
        return new Energy(250);
    }
}
