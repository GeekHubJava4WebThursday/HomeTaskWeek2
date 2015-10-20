package com.geekhub.hw2.vehicle.car;

import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;
import com.geekhub.hw2.vehicle.Direction;

public class SolarCar extends Car {
	
    public SolarCar(EnergySource energySource, Engine engine, Gear gear) {
        super(energySource, engine, gear);
    }

    @Override
    public void accelerate(){
        System.out.println("Solar car takes off");
    }

    public void turn(Direction direction) {
        System.out.println("Solar car turns "+direction.toString());
    }

    public void brake() {
        System.out.println("Solar car slows down");
    }

}
