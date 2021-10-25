package com.org.ita.kata.implementation.MakKeywa;

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

    @Override
    public BigInteger perimeter(BigInteger n) {
        return BigInteger.valueOf(4).multiply(fibonacciSum(n));
    }

    public static BigInteger fibonacciSum(BigInteger n) {
        n = n.add(BigInteger.valueOf(1));
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger previous = BigInteger.valueOf(1);
        BigInteger now = BigInteger.valueOf(1);
        BigInteger temp;
        BigInteger i = BigInteger.valueOf(3);
        if (n.compareTo(BigInteger.valueOf(2)) > -1) {
            sum = sum.add(previous);
        }
        if (n.compareTo(BigInteger.valueOf(3)) > -1) {
            sum = sum.add(now);
        }
        while (i.compareTo(n) <= 0) {
            temp = now;
            now = now.add(previous);
            previous = temp;
            i = i.add(BigInteger.valueOf(1));
            sum = sum.add(now);
        }
        return sum;
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
