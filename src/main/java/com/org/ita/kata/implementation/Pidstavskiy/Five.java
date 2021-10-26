package com.org.ita.kata.implementation.Pidstavskiy;

import java.math.BigInteger;

public class Five implements com.org.ita.kata.Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        long k = 0;
        for (long i = m; i <= n; i++) {
            if (isPrime(i)) {
                if (i - k == g) {
                    return new long[]{k, i};
                }
                k = i;
            }
        }
        return null;
    }

    public static boolean isPrime(long n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
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
        return null;
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
