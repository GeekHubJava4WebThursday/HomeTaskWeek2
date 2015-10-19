package com.geekhub.hw2.parts;

import com.geekhub.hw2.Torque;
import com.geekhub.hw2.vehicle.Direction;

public interface MovingPart {

    void turn(Direction direction);
    void accelerate(Torque torque);
    void brake();
}
