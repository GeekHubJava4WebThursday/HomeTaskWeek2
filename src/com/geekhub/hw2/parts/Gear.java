package com.geekhub.hw2.parts;

import com.geekhub.hw2.Force;
import com.geekhub.hw2.Torque;

public interface Gear {

    Torque transmit(Force force);
}
