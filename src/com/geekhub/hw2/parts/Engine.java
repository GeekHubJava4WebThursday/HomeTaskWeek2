package com.geekhub.hw2.parts;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.Force;
import com.geekhub.hw2.vehicle.Detail;

public interface Engine {

    Force transform(Energy energy, Detail detail);

}
