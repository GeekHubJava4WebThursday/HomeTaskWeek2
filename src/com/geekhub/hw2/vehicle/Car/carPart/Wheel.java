package com.geekhub.hw2.vehicle.Car.carPart;

import com.geekhub.hw2.vehicle.Detail;

/**
 * Created by COMRADE on 17.10.2015.
 */
public class Wheel extends Detail {

    private final int diam;
    private final int width;

    public Wheel(int diam1, int width1){
        this.diam = diam1;
        this.width = width1;
    }
    @Override
    public int square(){
        return (diam * width) / (diam - width);
    }

}
