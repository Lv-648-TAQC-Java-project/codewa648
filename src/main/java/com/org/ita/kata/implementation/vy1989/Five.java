package com.org.ita.kata.implementation.vy1989;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Five implements com.org.ita.kata.Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }
    
    /*function should return the first pair of two prime numbers spaced with a gap of g between the limits m, n 
     *if these numbers exist otherwise null*/
    private static boolean isPrime(long n) {
		/*if(n <= 1)return false;
		int dividersCount = 0;
		for(long i = 1; i <= n; i++) {
			if(n % i == 0)
				dividersCount++;
			if(dividersCount > 2) 
				return false;
		}
		return true;*/
		 for (int i = 2; i<= n/i; i++)
	         if (n % i == 0)
	             return false;
	     return n > 1;
	        
	}
    @Override
    public long[] gap(int g, long m, long n) {
    	if(g < 2 || m < 3 || n < m || n > 1100000) return null;
        
        List<Long> primesList = new ArrayList<Long>();
        List<Long> specifiedGapPrimesList = new ArrayList<Long>();
        
        for(long i = m; i <= n; i++) 
        	if(isPrime(i))primesList.add(i);
       
        for(int i = 0; i < primesList.size()-1;i++) 
        	if(Math.abs(primesList.get(i) - primesList.get(i+1)) == g) {
        		specifiedGapPrimesList.add(primesList.get(i));
        		specifiedGapPrimesList.add(primesList.get(i+1));
        		break;
        	}
        
        if(specifiedGapPrimesList.size() != 2 ) return null;
        long[] specifiedGapPrimesArray = new long[specifiedGapPrimesList.size()];
		
        for(int i = 0; i < specifiedGapPrimesArray.length; i++) 
			specifiedGapPrimesArray[i] = specifiedGapPrimesList.get(i).longValue();
	
        return specifiedGapPrimesArray;
    }
    
    //------------------------------------------------------------------------------------------------------
    @Override
    public int zeros(int n) {
        return 0;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        return null;
    }

    @Override
    public double solveSum(double m) {
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
