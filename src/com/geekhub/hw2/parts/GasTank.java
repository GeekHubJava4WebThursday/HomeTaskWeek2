package com.geekhub.hw2.parts;

import com.geekhub.hw2.Energy;

/**
 * Created by Администратор on 18.10.2015.
 */
public class GasTank implements EnergySource {

    public int getCountGas() {
        return countGas;
    }

    private int countGas;
    public GasTank(int countGas) {
        this.countGas = countGas;
    }

    @Override
    public Energy get() {
        System.out.println("Gas tank obtain "+this.getCountGas()
                +" units of fuel, from this it will be "
                +this.getCountGas()*10+" units of energy");
        return new Energy(this.getCountGas()*10);
    }
}
