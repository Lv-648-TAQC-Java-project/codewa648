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
        int counter = 0;
        int temp;
        for (int i = 5; i <= n; i += 5) {
            temp = i;
            while (temp % 10 == 0) {
                temp /= 10;
                counter++;
            }
            while (temp % 5 == 0) {
                temp /= 5;
                counter++;
            }
        }
        return counter;
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
