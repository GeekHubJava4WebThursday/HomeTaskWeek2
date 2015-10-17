package com.geekhub.hw2.parts;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.Force;
import com.geekhub.hw2.vehicle.Direction;

public abstract class EngineDecorator implements Engine, Gear {

    private Engine decoratedEngine;

    public EngineDecorator(Engine decoratedEngine) {
        this.decoratedEngine = decoratedEngine;
    }

    @Override
    public Force transform(Energy energy) {
        return decoratedEngine.transform(energy);
    }

    public abstract void turn(Direction direction);
}
