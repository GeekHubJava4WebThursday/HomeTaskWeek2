package com.geekhub.hw2.parts;

import com.geekhub.hw2.Energy;

/**
 * Class for Battery
 */
public class Battery implements EnergySource{

    // capacity abstract unit of energy
    private int batteryCapacity;

    public Battery(int batteryCapacity){
        setBatteryCapacity(batteryCapacity);
    }

    @Override
    public Energy get() {
        if(batteryCapacity >= 1){ //if battery is not empty we are still run
            batteryCapacity--;
            return new Energy(10);
        }else{
            System.out.println("Your battery is empty ");
            return new Energy(0);
        }
    }

    private void setBatteryCapacity(int batteryCapacity) {
        if (batteryCapacity < 0) {
            throw new IllegalArgumentException("Error: Battery capacity must be positive value");
        } else {
            this.batteryCapacity = batteryCapacity;
        }
    }
}
