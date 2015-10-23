package com.geekhub.hw2.vehicle.boat;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.vehicle.Direction;
import com.geekhub.hw2.vehicle.GasTank;
import com.geekhub.hw2.vehicle.Vehicle;

/**
 * Created by Mistes on 24.10.2015.
 */
public class Boat extends Vehicle {
    private Energy energy;
    private GasTank gasTank;
    private BoatPropeller boatpropeller;

    public Boat(){
        energy = new Energy(80);
        gasTank = new GasTank(energy);
        boatpropeller = new BoatPropeller();
    }
    @Override
    public void accelerate(){
        energy = gasTank.get();
        System.out.println("Accelerating in boat");
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
        System.out.println("Stoping boat...");
    }
}