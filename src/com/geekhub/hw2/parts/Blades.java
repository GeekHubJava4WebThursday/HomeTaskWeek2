package com.geekhub.hw2.parts;

import com.geekhub.hw2.Force;

/**
 * Class for boat blades
 */
public class Blades implements RunDevice{
    public int go(Force force){
        return(force.getAmount());
    }
}