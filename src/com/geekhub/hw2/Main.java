package com.geekhub.hw2;

import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.Driveable;
import com.geekhub.hw2.vehicle.Vehicle;

public class Main {

    private static Car car;
    private static SolarCar solarCar;
    private static Boat boat;

    public static void main(String[] args) {
        //TODO: Invoke testDrive method for every vehicle
        System.out.println("HW! ");
        Vehicle[] vehicles = {
                getCar(),
                getSolarCar(),
                getBoat(),
        };

        for (int i = 0; i < vehicles.length; i++) {
            testDrive(vehicles[i]);
            System.out.println("_______________________");
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

    public static Car getCar() {
        return car;
    }

    public static SolarCar getSolarCar() {
        return solarCar;
    }

    public static Boat getBoat() {
        return boat;
    }
}
