package com.org.ita.kata.implementation.Mykhailo5;

import java.math.BigInteger;

public class Five implements com.org.ita.kata.Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    public static boolean isPrime(long num){
        for(int i=2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    @Override
    public long[] gap(int g, long m, long n) {
        long prime = 0;
        for (long i = m; i < n; i++) {
            if(isPrime(i)){
                if(i-prime==g) {
                    return new long[]{prime, i};
                }
                prime=i;
            }
        }
        return null;
    }

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
