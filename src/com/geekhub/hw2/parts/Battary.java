package com.geekhub.hw2.parts;

import com.geekhub.hw2.Energy;

/**
 * Created by kvart on 25.10.15.
 */
public class Battary implements EnergySource {

    private double battaries;

    public Battary(double battaries){
        this.battaries = battaries;

    }
    @Override
    public Energy get() {
        return new Energy(100);
    }
}
