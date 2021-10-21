package com.org.ita.kata.implementation.vy1989;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import com.org.ita.kata.Eight;

public class Eigth implements Eight {
	
	//You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.
	@Override
	public int liters(double time) {
	    return time > 0 ? (int) ((int)time * 0.5) : 0;
	}
		
	//---------------------------------------------------------------------------------------------------------------------------------------------


    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return 0;
    }

    @Override
    public float mpgToKPM(float mpg) {
        return 0;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        return new int[0];
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        return new int[0];
    }

    @Override
    public int stringToNumber(String str) {
        return 0;
    }

    @Override
    public boolean amIWilson(double n) {
        return false;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return 0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }
}
