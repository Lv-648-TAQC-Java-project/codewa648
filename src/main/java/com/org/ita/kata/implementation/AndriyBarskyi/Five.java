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

    public static boolean isPrimeNumber(long i) {
        for (long j = 2; j < i / 2; j++) {
            if (i % j == 0) {
                return false;
            }
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
        while ((n / divider) > 0) {
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
            fibo[i] = fibo[i - 1].add(fibo[i - 2]);
            sum = sum.add(fibo[i]);
        }
        return sum.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solveSum(double m) {
        return (2 * m + 1 - Math.sqrt(4 * m + 1)) / (2 * m);
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
