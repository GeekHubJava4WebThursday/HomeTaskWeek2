package com.geekhub.hw2;

import com.geekhub.hw2.parts.Blades;
import com.geekhub.hw2.parts.GasEngine;
import com.geekhub.hw2.parts.BoatGear;
import com.geekhub.hw2.parts.GasTank;
import com.geekhub.hw2.vehicle.Boat;
import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.Driveable;
import com.geekhub.hw2.vehicle.Vehicle;


public class Main {

    public static void main(String[] args) {
        //Install some vehicle (boat, car, solar car)

        Boat boat =  new Boat(new GasTank(100), new GasEngine(), new BoatGear(), new Blades());

        Vehicle[] vehicles = {
            boat
        };

        for (int i = 0; i < vehicles.length; i++) {
            testDrive(vehicles[i]);
        }
    }

    private static void testDrive(Driveable driveable) {
        driveable.accelerate();
        driveable.turn(Direction.LEFT);
        driveable.turn(Direction.RIGHT);
        driveable.brake();
        driveable.accelerate();
        driveable.brake();
    }
}
