package com.geekhub.hw2.details;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.Force;
import com.geekhub.hw2.parts.Engine;
import com.geekhub.hw2.parts.EngineDecorator;
import com.geekhub.hw2.vehicle.Direction;

public class BoatEngineDecorator extends EngineDecorator {

    public BoatEngineDecorator(Engine decoratedEngine) {
        super(decoratedEngine);
    }

    @Override
    public Force transform(Energy energy) {
        return super.transform(energy);
    }

    @Override
    public void turn(Direction direction) {
        System.out.println("Engine turned " + direction.toString());
    }

    @Override
    public void consume(Force force) {
        System.out.println(force != null ? "Engine consumed " + force.getAmount() + " kW" : "");
    }
}

