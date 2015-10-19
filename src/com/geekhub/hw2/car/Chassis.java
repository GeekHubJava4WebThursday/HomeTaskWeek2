package com.geekhub.hw2.car;

import com.geekhub.hw2.Torque;
import com.geekhub.hw2.parts.MovingPart;
import com.geekhub.hw2.vehicle.Direction;

public class Chassis implements MovingPart {

    public final int CONVERSION_FACTOR = 2;
    public final int BRAKE_VALUE = 5;
    Wheel[] wheels = new Wheel[4];
    private int revolutionsPerMinute;
    Direction direction;

    public Chassis() {
        System.out.println(getClass().toString() + " - creating...");
        for (int i = 0; i < wheels.length; i++) {
            this.wheels[i] = new Wheel();
        }
        this.revolutionsPerMinute = 0;
        direction = Direction.FORWARD;
    }

    @Override
    public void turn(Direction direction) {
        this.direction = direction;
    }

    @Override
    public void accelerate(Torque torque) {
        System.out.println(getClass().toString() + " - accelerate...");
        revolutionsPerMinute += torque.getAmount() * CONVERSION_FACTOR;
        for (int i = 0; i < 3; i++) {
            wheels[i].rotate(revolutionsPerMinute);
        }
    }

    @Override
    public void brake() {
        System.out.println(getClass().toString() + " - brake...");
        if (revolutionsPerMinute > BRAKE_VALUE) {
            revolutionsPerMinute -= BRAKE_VALUE;
        }
    }

    public int getRevolutionsPerMinute() {
        return revolutionsPerMinute;
    }

    public Direction getDirection() {
        return direction;
    }
}
