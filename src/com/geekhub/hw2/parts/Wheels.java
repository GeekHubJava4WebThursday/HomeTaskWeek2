package com.geekhub.hw2.parts;

import com.geekhub.hw2.Force;

/**
 * Class for Wheels
 */
public class Wheels implements RunDevice{
    public int go(Force force){
        return(force.getAmount());
    }
}