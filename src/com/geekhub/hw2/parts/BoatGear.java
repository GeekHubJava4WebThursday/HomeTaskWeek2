package com.geekhub.hw2.parts;

import com.geekhub.hw2.Force;

public class BoatGear implements Gear {

    @Override
    public void consume(Force force) {
        System.out.println("start motion");
    }
}
