package com.geekhub.hw2.vehicle.Car;

import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;
import com.geekhub.hw2.vehicle.Car.carPart.Wheel;
import com.geekhub.hw2.vehicle.Detail;
import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.Vehicle;

/**
 * Created by COMRADE on 17.10.2015.
 */
public class Car extends Vehicle {
    public Car(EnergySource energySource, Engine engine, Gear gear, Detail wheel) {
        super(energySource, engine, gear, wheel);
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerate!");
        gear.consume(engine.transform(energySource.get(), screw));
    }

    @Override
    public void turn(Direction direction) {
        System.out.println("The car turn to the" + direction.toString());
    }

    @Override
    public void brake() {
        System.out.println("The car brakes");
    }
}
