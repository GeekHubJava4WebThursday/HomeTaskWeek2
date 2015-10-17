package com.geekhub.hw2.vehicle.Boat;

import com.geekhub.hw2.parts.EnergySource;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.Gear;
import com.geekhub.hw2.vehicle.Boat.boatPart.Screw;
import com.geekhub.hw2.vehicle.Detail;
import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.Vehicle;

/**
 * Created by COMRADE on 17.10.2015.
 */
public class Boat extends Vehicle {
    public Boat(EnergySource energySource, Engine engine, Gear gear, Screw screw) {
        super(energySource, engine, gear, screw);
    }

    @Override
    public void accelerate() {
        System.out.println("The boat accelate!");
        gear.consume(engine.transform(energySource.get(),screw ));
    }

    @Override
    public void turn(Direction direction) {
        System.out.println("The boat turns to the " + direction.toString());
    }

    @Override
    public void brake() {
        System.out.println("Boat brakes/");
    }
}
