package com.org.ita.kata.implementation.vy1989;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Five implements com.org.ita.kata.Five {
    @Override
    public int artificialRain(int[] v) {
    	int length = v.length; 
        int result = 0;
        
        int[] left = new int[length];
        int[] right = new int[length];
        for (int i = 0; i < length; i++) {
            left[i] = 0;
            right[i] = 0;
        }
        
        for (int i = 1 ; i < length ; i++){
            if(v[i] >= v[i-1]) {
        	left[i] += left[i-1] + 1;
            }
            
            if(v[length-i-1] >= v[length-i]) {
                right[length-1-i] += right[length-i] + 1;
            }
            
        }
        
        for (int i = 0 ; i < length; i++) {
            if(result < left[i] + right[i]+1) {
        	result = left[i] + right[i] + 1;
            } 
        }
        
        return result;
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
    
    @Override
    public int zeros(int n) {
    	int zeros = 0;
		for(int i = n; i>0; i/=5,zeros+=i);
		return zeros;
    }
    
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
    	return (2 * m + 1 -  Math.sqrt(4 * m + 1)) / (2 * m);
    }

    @Override
    public long[] smallest(long n) {
    	String stringedNumber = n + "";
    	long smallestNumber = n;
    	int numberLength = stringedNumber.length();
       
            long[] result = new long[3];
            
            for (int i = 0; i < numberLength; i++) {
                for (int j = 0; j < numberLength; j++) {
                    
            	StringBuilder numberSB = new StringBuilder(stringedNumber);
                    char digit = numberSB.charAt(i);
                    
                    numberSB.deleteCharAt(i);
                    numberSB.insert(j, digit);
                    
                    long currentNumber = Long.parseLong(numberSB.toString());
                    
                    if (currentNumber < smallestNumber) {
                        smallestNumber = currentNumber;
                        result[0] = smallestNumber;
                        result[1] = i;
                        result[2] = j;
                    }
                }
            }
            
            return result;
    }
}
