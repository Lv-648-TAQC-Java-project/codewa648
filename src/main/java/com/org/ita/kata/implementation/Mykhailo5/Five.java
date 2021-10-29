package com.org.ita.kata.implementation.Mykhailo5;

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
        int count = 0;
        for (int i = 5; i <= n; i *= 5) {
            count+=n/i;
        }
        return count;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        return null;
    }

    @Override
    public double solveSum(double m) {
        return ((2.0 * m + 1.0 - Math.sqrt(4.0 * m + 1.0))/(2.0 * m));
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
