package com.org.ita.kata.implementation.AndriyBarskyi;

import java.math.BigInteger;

public class Five implements com.org.ita.kata.Five {
    @Override
    public int artificialRain(int[] v) {
        int height = 0;
        int size = 1;
        int low = 0;
        for (int i = 1; i < v.length; i++) {
            int k = v[i];
            if (k > v[i - 1]) {
                height = Math.max(height, size);
                size = i - low;
            }
            if (k < v[i - 1]) {
                low = i;
            }
            size++;
        }
        return Math.max(height, size);
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
        return null;
    }

    @Override
    public double solveSum(double m) {
        return 0;
    }

    private static long replace(long n, int i, int j) {
        StringBuilder value = new StringBuilder(String.valueOf(n));
        char c = value.charAt(i);
        value.deleteCharAt(i);
        value.insert(j, c);
        return Long.parseLong(value.toString());
    }

    @Override
    public long[] smallest(long n) {
        long minVal = n;
        long minI = 0;
        long minJ = 0;
        String val = String.valueOf(n);
        for (int i = 0; i < val.length(); i++) {
            for (int j = 0; j < val.length(); j++) {
                if (i == j) {
                    continue;
                }
                long replaced = replace(n, i, j);
                if (replaced < minVal) {
                    minVal = replaced;
                    minI = i;
                    minJ = j;
                }
            }
        }
        return new long[]{minVal, minI, minJ};
    }
}
