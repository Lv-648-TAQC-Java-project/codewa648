package com.org.ita.kata.implementation.Nadya101;

import java.math.BigInteger;

public class Five implements com.org.ita.kata.Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        long last = -1;
        for (long i = m; i < n; i++) {
            if (isPrime(i)) {
                if (i - last == g) {
                    return new long[]{last, i};
                }
                last = i;
            }
        }
        return null;
    }

    public static boolean isPrime(long i) {
        for (long j = 2; j * j <= i; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int zeros(int n) {
        return (n < 5) ? 0 : (n / 5) + zeros(n / 5);
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger a;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i <= n.intValue(); i++) {
            a = b;
            b = c;
            c = a.add(b);
            sum = sum.add(a);
        }
        return sum.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solveSum(double m) {
        return (1 - Math.sqrt(4 * m + 1)) / (2.0 * m) + 1;
    }

    @Override
    public long[] smallest(long n) {
        return new long[0];
    }
}
