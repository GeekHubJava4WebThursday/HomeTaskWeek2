package com.geekhub.hw2;

import com.geekhub.hw2.parts.*;
import com.geekhub.hw2.vehicle.*;

public class Main {

    public static void main(String[] args) {
        Vehicle[] vehicles = {
                new Boat(new GasTank(100), new GasEngine(), new BoatGear()),
                new Car(new GasTank(100), new GasEngine(), new CarGear()),
                new SolarCar(new Battary(200), new BattaryEngine(), new CarGear())

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
