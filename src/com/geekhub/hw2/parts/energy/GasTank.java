package com.geekhub.hw2.parts.energy;

import com.geekhub.hw2.Energy;

public class GasTank implements EnergySource {
    private final int MAX_CAPACITY;
    private double capacity;

    public GasTank(int maxCapacity, double capacity){
        MAX_CAPACITY = maxCapacity;
        setCapacity(capacity);
    }

    @Override
    public Energy get() {
        if(capacity >= 0.1){
            capacity -= 0.1;
            return new Energy(100);
        }
        else {
            System.out.print("There is no gas ");
            return new Energy(0);
        }
    }

    private void setCapacity(double capacity) {
        if(capacity < 0){
            throw new IllegalArgumentException("Gas tank capacity should be positive");
        }
        if(capacity > MAX_CAPACITY){
            this.capacity = MAX_CAPACITY;
            System.out.println("Overflowing gas tank. Max capacity: " + MAX_CAPACITY);
        }
        else
            this.capacity = capacity;
    }
}
