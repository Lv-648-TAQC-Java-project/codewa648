package com.org.ita.kata.implementation.Pidstavskiy;

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
            count += n / i;
        }
        return count;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger prevFib = BigInteger.valueOf(0);
        BigInteger currentFib = BigInteger.valueOf(1);
        BigInteger sumFib = BigInteger.valueOf(1);

        for (BigInteger i = BigInteger.valueOf(1); i.compareTo(n) < 1; i = i.add(BigInteger.valueOf(1))) {
            currentFib = currentFib.add(prevFib);
            prevFib = currentFib.subtract(prevFib);
            sumFib = sumFib.add(currentFib);
        }
        return sumFib.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solveSum(double m) {
        return ((2 * m + 1 - Math.sqrt(4 * m + 1)) / (2 * m));
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
