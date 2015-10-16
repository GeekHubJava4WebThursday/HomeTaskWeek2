package com.geekhub.hw2;

import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.Driveable;
import com.geekhub.hw2.vehicle.Vehicle;

public class Main {

    public static void main(String[] args) {
        //TODO: Invoke testDrive method for every vehicle
        Vehicle[] vehicles = {

        };

        for (Vehicle vehicle : vehicles) {
            testDrive(vehicle);
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
