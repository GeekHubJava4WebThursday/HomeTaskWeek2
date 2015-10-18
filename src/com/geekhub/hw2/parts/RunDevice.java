package com.geekhub.hw2.parts;

import com.geekhub.hw2.Force;

/**
 * Interface for run devices(wheels, blades).
 */
public interface RunDevice {
    int go(Force force);
}
