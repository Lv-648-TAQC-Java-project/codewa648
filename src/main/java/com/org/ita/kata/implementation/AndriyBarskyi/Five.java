package com.org.ita.kata.implementation.AndriyBarskyi;

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
        int divider = 5;
        while ((n/divider) > 0) {
            count += n / divider;
            divider *= 5;
        }
        return count;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger[] fibo = new BigInteger[n.intValue() + 1];
        fibo[0] = BigInteger.valueOf(1);
        fibo[1] = BigInteger.valueOf(1);
        BigInteger sum = fibo[0].add(fibo[1]);
        for (int i = 2; i <= n.intValue(); i++) {
            fibo[i] = fibo[i-1].add(fibo[i-2]);
            sum = sum.add(fibo[i]);
        }
        return sum.multiply(BigInteger.valueOf(4));
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
