package com.geekhub.hw2.parts;

import com.geekhub.hw2.Energy;
import com.geekhub.hw2.parts.EnergySource;

import java.lang.Override;

public class GasTank implements EnergySource {
	
	  @Override
	    public Energy get(){
	        return new Energy(100);
	    }

}
