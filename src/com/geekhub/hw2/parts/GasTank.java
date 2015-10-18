package com.geekhub.hw2.parts;

import com.geekhub.hw2.Energy;

/**
 * Class for GasTank
 */
public class GasTank implements EnergySource{

    // capacity abstract unit of fuel
    private int tankCapacity;

    public GasTank(int tankCapacity){
        setTankCapacity(tankCapacity);
        }

    @Override
    public Energy get() {
        if(tankCapacity >= 1){ //if tank is not empty we are still run
            tankCapacity--;
            return new Energy(10);
        }else{
            System.out.println("Your tank is empty ");
            return new Energy(0);
        }
    }

    private void setTankCapacity(int tankCapacity) {
        if (tankCapacity < 0) {
            throw new IllegalArgumentException("Error: Fuel capacity must be positive value");
        } else {
            this.tankCapacity = tankCapacity;
        }
    }
}
