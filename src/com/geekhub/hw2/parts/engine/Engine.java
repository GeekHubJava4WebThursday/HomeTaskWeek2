package com.geekhub.hw2.parts.engine;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.Force;

public interface Engine {

    Force transform(Energy energy);
}
