package com.org.ita.kata.implementation.vy1989;

import java.math.BigDecimal;

import com.org.ita.kata.Eight;

public class Eigth implements Eight {
    @Override
    public int liters(double time) {
        return 0;
    }

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

    //Your task is to create a function that returns true if the given number is a Wilson prime.
    @Override
    public boolean amIWilson(double n) {
    	if(isPrime(n)) {
			BigDecimal one = new BigDecimal(1);
			BigDecimal nPowed = new BigDecimal(Math.pow(n, 2));
			return factorial(n - 1).add(one).remainder(nPowed) == BigDecimal.ZERO; // implements formula ((P-1)! + 1) / (P * P)
		}
		return false;
    }
    private boolean isPrime(double n) {
		if(n <= 1)return false;
		int dividersCount = 0;
		
		for(long i = 1; i <= n; i++) {
			if(n % i == 0)
				dividersCount++;
			if(dividersCount > 2) 
				return false;
		}
		return true;
	}
	private BigDecimal factorial(double n) {
		BigDecimal factorial = new BigDecimal(1);
		
		for(int i = 1; i <= n; i++) {
			factorial = factorial.multiply(new BigDecimal(i));
		}
		return factorial;
	}
	
	//---------------------------------------------------------------------------------------------------------------------------------------------


    @Override
    public double twoDecimalPlaces(double number) {
        return 0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }
}
