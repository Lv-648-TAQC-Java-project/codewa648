package com.org.ita.kata.implementation.Mykhailo5;

import java.math.BigInteger;

public class Five implements com.org.ita.kata.Five {
    public static boolean isPrime(long num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int artificialRain(int[] v) {
        int k = 0;
        int low = 0;
        int size = 1;

        for (int i = 1; i < v.length; i++) {
            if (v[i] < v[i - 1]) {
                low = i;
            } else if (v[i] > v[i - 1]) {
                k = Math.max(k, size);
                size = i - low;
            }
            size++;
        }
        return Math.max(k, size);
    }

    @Override
    public long[] gap(int g, long m, long n) {
        long prime = 0;
        for (long i = m; i < n; i++) {
            if (isPrime(i)) {
                if (i - prime == g) {
                    return new long[]{prime, i};
                }
                prime = i;
            }
        }
        return null;
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
        if (n.compareTo(BigInteger.valueOf(1)) < 0) {
            return BigInteger.ZERO;
        }
        if (n.compareTo(BigInteger.valueOf(2)) < 0) {
            return BigInteger.valueOf(4);
        }
        BigInteger p0 = BigInteger.valueOf(0);
        BigInteger p1 = BigInteger.valueOf(1);
        BigInteger p2 = BigInteger.valueOf(1);
        BigInteger sum = BigInteger.valueOf(0);

        for (int i = 0; i <= n.intValue(); i++) {
            p0 = p1;
            p1 = p2;
            p2 = p0.add(p1);
            sum = sum.add(p0);
        }

        return sum.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solveSum(double m) {
        return ((2.0 * m + 1.0 - Math.sqrt(4.0 * m + 1.0)) / (2.0 * m));
    }

    @Override
    public long[] smallest(long n) {
        long[] arr = new long[3];
        long min = n;
        String str = n + "";
        for (int i = 0; i < str.length(); i++) {
            for (int x = 0; x < str.length(); x++) {
                StringBuilder stringBuilder = new StringBuilder(str);
                char ch = stringBuilder.charAt(i);
                stringBuilder.deleteCharAt(i);
                stringBuilder.insert(x, ch);
                long num = Long.parseLong(stringBuilder.toString());
                if (num < min) {
                    min = num;
                    arr[0] = min;
                    arr[1] = i;
                    arr[2] = x;
                }
            }
        }
        return arr;
    }
}
