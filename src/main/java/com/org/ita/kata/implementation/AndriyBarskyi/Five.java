package com.org.ita.kata.implementation.AndriyBarskyi;

import java.math.BigInteger;

public class Five implements com.org.ita.kata.Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    public static boolean isPrimeNumber(long i) {
        for (long j = 2; j < i / 2; j++) {
            if (i % j == 0) return false;
        }
        return true;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        long h = 0;
        for (long i = m; i <= n; i++) {
            if (isPrimeNumber(i)) {
                if (i - h == g) {
                    return new long[]{h, i};
                }
                h = i;
            }
        }
        return null;
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
