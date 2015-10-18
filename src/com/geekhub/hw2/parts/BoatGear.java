package com.geekhub.hw2.parts;

import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.Gear;

/**
 * Class for Boat Gear
 */
public class BoatGear implements Gear{
    @Override
    public void consume(Force force) {
        System.out.println("start moving");
    }
}
