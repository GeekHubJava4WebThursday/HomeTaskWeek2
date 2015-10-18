package com.geekhub.hw2.parts.energy;

import com.geekhub.hw2.Energy;

public class Accumulator implements EnergySource {
    private double charge;

    public Accumulator(double charge) {
        if(charge >= 0 && charge <= 100){
            this.charge = charge;
        }
        else
            throw new IllegalArgumentException("Accumulator charge should be in the range [0, 100]");
    }

    @Override
    public Energy get(){
        if(charge >= 0.5){
            charge -= 0.5;
            return new Energy(500);
        }
        else {
            System.out.println("Accumulator is discharged");
            return new Energy(0);
        }
    }

}
