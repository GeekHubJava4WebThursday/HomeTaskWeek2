package com.geekhub.hw2.details;

import com.geekhub.hw2.parts.Wheels;
import com.geekhub.hw2.vehicle.Direction;

public class SmallCarWheels implements Wheels {

    @Override
    public void turnFrontWheels(Direction direction) {
        System.out.println("Wheels turned " + direction.toString());
    }
}
