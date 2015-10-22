package com.geekhub.hw2;

import com.geekhub.hw2.parts.*;
import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.Driveable;
import com.geekhub.hw2.vehicle.Vehicle;

public class Main {

    private static Car car;
    private static SolarCar solarCar;
    private static Boat boat;

    public static void main(String[] args) {
        Car car = new Car(new DieselTank(),new DieselEngine(),new CarGear());
        SolarCar solarCar = new SolarCar(new SolarBattery(),new SolarEngine(),new SolarGear());
        Boat boat = new Boat(new DieselTank(),new BoatEngine(),new BoatGear());
        Vehicle[] vehicles = {
                car,
                solarCar,
                boat,
        };

        for (int i = 0; i < vehicles.length; i++) {
            testDrive(vehicles[i]);
            System.out.println("_______________________next Vehicle_______________________");
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
