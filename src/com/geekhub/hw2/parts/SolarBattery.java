package com.geekhub.hw2.parts;

import com.geekhub.hw2.Energy;

/**
 * Created by Вадимка on 18.10.2015.
 */
public class SolarBattery implements EnergySource {
    @Override
    public Energy get() {
        return new Energy(100);
    }
}
