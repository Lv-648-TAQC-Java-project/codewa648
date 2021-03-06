package com.org.ita.kata.implementation.Nadya101;

import java.math.BigInteger;

public class Five implements com.org.ita.kata.Five {
    static boolean canFlowLeft(int[] numbers, int i) {
        if (i == 0)
            return false;
        return numbers[i - 1] <= numbers[i];
    }

    static boolean canFlowRight(int[] numbers, int i) {
        if (numbers.length - 1 == i)
            return false;
        return numbers[i + 1] <= numbers[i];
    }

    static int[] computeLeftFlow(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (canFlowLeft(numbers, i)) {
                result[i] = result[i - 1] + 1;
            } else {
                result[i] = 0;
            }
        }
        return result;
    }

    static int[] computeRightFlow(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (canFlowRight(numbers, i)) {
                result[i] = result[i + 1] + 1;
            } else {
                result[i] = 0;
            }
        }
        return result;
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
    public int artificialRain(int[] v) {
        int[] flowRight = Five.computeRightFlow(v);
        int[] flowLeft = Five.computeLeftFlow(v);
        int maxWateredPlains = 0;
        for (int i = 0; i < flowLeft.length; i++) {
            maxWateredPlains = Math.max(flowLeft[i] + flowRight[i] + 1, maxWateredPlains);
        }
        return maxWateredPlains;
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

    @Override
    public int zeros(int n) {
        return (n < 5) ? 0 : (n / 5) + zeros(n / 5);
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        if (n.compareTo(BigInteger.valueOf(1)) < 0) {
            return BigInteger.ZERO;
        }
        if (n.compareTo(BigInteger.valueOf(2)) < 0) {
            return BigInteger.valueOf(4);
        }
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
        String str = "" + n;
        long[] result = new long[]{Long.MAX_VALUE, 0, 0};
        for (int i = str.length() - 1; i >= 0; i--) {
            String str1 = str.substring(0, i) + str.substring(i + 1);
            for (int j = str.length() - 1; j >= 0; j--) {
                long tmp = Long.parseLong(str1.substring(0, j) + str.charAt(i) + str1.substring(j));
                if (tmp <= result[0]) result = new long[]{tmp, i, j};
            }
        }
        return result;
    }
}
