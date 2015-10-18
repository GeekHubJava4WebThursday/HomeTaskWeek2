package com.geekhub.hw2;

import com.geekhub.hw2.parts.*;
import com.geekhub.hw2.vehicle.*;


public class Main {

    public static void main(String[] args) {
        //Install some vehicle (boat, car, solar car)

        Boat boat =  new Boat(new GasTank(100), new GasEngine(), new BoatGear(), new Blades());
        Car car =  new Car(new GasTank(100), new GasEngine(), new CarGear(), new Wheels());
        SolarCar solarCar =  new SolarCar(new Battery(100), new ElectroEngine(), new CarGear(), new Wheels());

        Vehicle[] vehicles = {
            boat,
            car,
            solarCar
        };

        for (int i = 0; i < vehicles.length; i++) {
            testDrive(vehicles[i]);
            System.out.println(".................................");
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
