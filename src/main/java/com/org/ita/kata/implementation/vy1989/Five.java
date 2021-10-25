package com.org.ita.kata.implementation.vy1989;

import java.math.BigInteger;

public class Five implements com.org.ita.kata.Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    @Override
    public int zeros(int n) {
        return 0;
    }
    
    /*Could you give the sum of the perimeters of all the squares in a rectangle when there are n + 1 
     * squares disposed in the same manner as in the drawing*/
    @Override
    public BigInteger perimeter(BigInteger n) {
    	BigInteger previous = BigInteger.valueOf(1);
		BigInteger current = BigInteger.valueOf(1);
		BigInteger fib; 
		BigInteger sumFib = BigInteger.valueOf(2);
		    
		for(BigInteger i = BigInteger.valueOf(1); i.compareTo(n) < 0; i=i.add(BigInteger.valueOf(1))) {
		    fib = previous.add(current);
		    sumFib = sumFib.add(fib);
		    previous = current;
		    current = fib;
		}
		    
		return sumFib.multiply(BigInteger.valueOf(4));
    }
    
    //---------------------------------------------------------------------------------------------------
    
    @Override
    public double solveSum(double m) {
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
