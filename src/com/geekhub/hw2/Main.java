package com.geekhub.hw2;

import com.geekhub.hw2.solarcar.Battery;
import com.geekhub.hw2.solarcar.ElectricMotor;
import com.geekhub.hw2.solarcar.SolarCar;
import com.geekhub.hw2.boat.Boat;
import com.geekhub.hw2.boat.Human;
import com.geekhub.hw2.boat.Paddles;
import com.geekhub.hw2.boat.Recreation;
import com.geekhub.hw2.car.*;
import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.Driveable;
import com.geekhub.hw2.vehicle.Vehicle;

public class Main {

    public static void main(String[] args) {
        System.out.println("Creating vehicles... \n");
        Boat boat = new Boat(new Recreation(50), new Human(), new Paddles());
        Car bmw = new Car(new GasTank(100), new Motor(), new Transmission(), new Chassis());
        SolarCar tesla = new SolarCar(new Battery(100), new ElectricMotor(), new Transmission(), new Chassis());
        Vehicle[] vehicles = {
            bmw, tesla, boat
        };

        for (int i = 0; i < vehicles.length; i++) {
            System.out.println("\nTesting " + vehicles[i].getClass().toString() + "\n");
            testDrive(vehicles[i]);
        }
    }

    private static void testDrive(Driveable driveable) {
        System.out.println("\nTest Drive \n");
        driveable.accelerate();
        System.out.println("\n");
        driveable.turn(Direction.LEFT);
        System.out.println("\n");
        driveable.turn(Direction.RIGHT);
        System.out.println("\n");
        driveable.brake();
        System.out.println("\n");
        driveable.accelerate();
        System.out.println("\n");
        driveable.brake();
    }
}
