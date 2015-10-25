package com.geekhub.hw2.parts;

import com.geekhub.hw2.Energy;

/**
 * Created by kvart on 25.10.15.
 */
public class GasTank implements EnergySource {

    private double galons;

    public GasTank(double galons){
        this.galons = galons;

    }
    @Override
    public Energy get() {
        return new Energy(100);
    }
}
