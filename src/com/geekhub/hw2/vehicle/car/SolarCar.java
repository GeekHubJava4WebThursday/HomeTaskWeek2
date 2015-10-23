package com.geekhub.hw2.vehicle.car;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.GasTank;
import com.geekhub.hw2.vehicle.Vehicle;

/**
 * Created by Mistes on 18.10.2015.
 */
public class SolarCar extends Vehicle {
    private Energy energy;
    private Battery battery;
    private Wheels wheels;

    public SolarCar(){
        energy = new Energy(60);
        battery = new Battery(energy);
        wheels = new Wheels();
    }
    @Override
    public void accelerate(){
        energy = battery.get();
        System.out.println("Accelerating in solar car");
    }

    @Override
    public void turn(Direction direction){
        if (direction == Direction.LEFT) {
            System.out.println("Turning left");
        } else {
            System.out.println("Turning right");
        }
    }

    @Override
    public void brake(){
        System.out.println("Stoping in solar car...");
    }
}
