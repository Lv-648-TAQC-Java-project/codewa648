package com.org.ita.kata.implementation.MakKeywa;

import java.math.BigInteger;

public class Five implements com.org.ita.kata.Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        long lastPrime = -1;
        long i = m + 1;
        for (; i < n; i++) {
            if (isPrime(i)) {
                lastPrime = i;
                break;
            }
        }
        if (lastPrime == -1) {
            return null;
        }
        for (i = lastPrime + 1; i < n; i++) {
            if (isPrime(i)) {
                if (i - lastPrime == g) {
                    return new long[]{lastPrime, i};
                }
                lastPrime = i;
            }
        }
        return null;
    }

    public static boolean isPrime(long n) {
        if (n < 0 || n == 0 || n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }
        for (long i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
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
