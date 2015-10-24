package com.geekhub.hw2;

import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.Driveable;
import com.geekhub.hw2.vehicle.Vehicle;
import com.geekhub.hw2.vehicle.boat.Boat;
import com.geekhub.hw2.vehicle.car.Car;
import com.geekhub.hw2.vehicle.car.SolarCar;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        Vehicle[] vehicles = {
                main.getCar(), main.getSolarCar(), main.getBoat()
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
    public Car getCar(){
        return new Car();}
    public Boat getBoat(){
        return new Boat();}
    public SolarCar getSolarCar(){
        return new SolarCar();}

    }

