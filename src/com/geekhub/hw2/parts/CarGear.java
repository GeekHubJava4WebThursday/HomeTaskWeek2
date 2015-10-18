package com.geekhub.hw2.parts;

        import com.geekhub.hw2.Force;
        import com.geekhub.hw2.parts.Gear;

/**
 * Class for CarGear
 */
public class CarGear implements Gear{
    @Override
    public void consume(Force force) {
        System.out.println("start car moving");
    }
}