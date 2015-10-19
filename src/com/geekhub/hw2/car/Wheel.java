package com.geekhub.hw2.car;

import com.geekhub.hw2.parts.Rotateable;

public class Wheel implements Rotateable {

    private int rpm;

    public Wheel() {
        System.out.println(getClass().toString() + " - creating...");
        this.rpm = 0;
    }

    public int getRpm() {
        return rpm;
    }

    @Override
    public void rotate(int rpm) {
        System.out.println(getClass().toString() + " - rotate...");
        this.rpm = rpm;
    }
}
