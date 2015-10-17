package com.geekhub.hw2.vehicle.Boat.boatPart;

import com.geekhub.hw2.vehicle.Detail;

/**
 * Created by COMRADE on 17.10.2015.
 */
public class Screw extends Detail {

    private final int diam;
    private final int petls;

    public Screw(int diam1, int petls){
        this.diam = diam1;
        this.petls = petls;
    }
    @Override
    public int square(){
        return (diam * petls) / (diam - petls);
    }

}
