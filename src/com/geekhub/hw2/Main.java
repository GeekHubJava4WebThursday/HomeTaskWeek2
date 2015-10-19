package com.geekhub.hw2;

import com.geekhub.hw2.parts.*;
import com.geekhub.hw2.vehicle.*;

public class Main {

    public static void main(String[] args) {
        //TODO: Invoke testDrive method for every vehicle
        Vehicle[] vehicles = {new Car(new GasTank(120),new CarEngine(),new Wheels()),
                new SolarCar(new SolarBattery(55),new SolarEngine(),new Wheels()),
                new Boat(new GasTank(88),new BoatEngine(),new Screw()),
                new SolarCar(new SolarBattery(21),new SolarEngine(),new Wheels()),
                new Car(new GasTank(19),new CarEngine(),new Wheels())

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
