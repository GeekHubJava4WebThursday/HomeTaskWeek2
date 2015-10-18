package com.geekhub.hw2.vehicle.car;

import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.energy.EnergySource;
import com.geekhub.hw2.parts.engine.Engine;
import com.geekhub.hw2.parts.gear.Gear;
import com.geekhub.hw2.parts.gear.Wheels;
import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.Vehicle;

public class Car extends Vehicle {
    private final Wheels wheels;

    public Car(EnergySource energySource, Engine engine, Gear gear, Wheels wheels){
        super(energySource, engine, gear);
        this.wheels = wheels;
    }

    @Override
    public void brake() {
        System.out.println("Try to stop the car");
        wheels.stop();
    }

    @Override
    public void turn(Direction direction) {
        wheels.turn(direction);
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerate");
        gear.consume(engine.transform(energySource.get()));
    }
}
