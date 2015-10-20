package com.geekhub.hw2.vehicle.car;

import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;
import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.Vehicle;


import java.lang.Override;

public class Car extends Vehicle {

    public Car(EnergySource energySource, Engine engine, Gear gear) {
        super(energySource, engine, gear);
    }

    @Override
    public void accelerate(){
        System.out.println("Car takes off");
    }

    public void turn(Direction direction) {
        System.out.println("Car turns "+direction.toString());
    }

    public void brake() {
        System.out.println("Car slows down");
    }

}