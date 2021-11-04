package com.org.ita.kata.implementation.Pidstavskiy;

import java.math.BigInteger;

public class Five implements com.org.ita.kata.Five {
    @Override
    public int artificialRain(int[] v) {
        int[] flowRight = computeRightFlow(v);
        int[] flowLeft = computeLeftFlow(v);

        int maxWateredPlains = 0;

        for (int i = 0; i < flowLeft.length; i++) {
            maxWateredPlains = Math.max(flowLeft[i] + flowRight[i] + 1, maxWateredPlains);
        }
        return maxWateredPlains;
    }

    public static boolean canFlowLeft(int[] numbers, int i) {
        if (i == 0)
            return false;
        return numbers[i - 1] <= numbers[i];
    }

    public static boolean canFlowRight(int[] numbers, int i) {
        if (numbers.length - 1 == i)
            return false;
        return numbers[i + 1] <= numbers[i];
    }


    public static int[] computeLeftFlow(int[] numbers) {
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

    public static int[] computeRightFlow(int[] numbers) {
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
        String str = "" + n;
        long[] smallest = new long[]{Long.MAX_VALUE, 0, 0};
        for (int i = str.length() - 1; i >= 0; i--) {
            final String s1 = str.substring(0, i) + str.substring(i + 1);
            for (int j = str.length() - 1; j >= 0; j--) {
                long tmp = Long.parseLong(s1.substring(0, j) + str.charAt(i) + s1.substring(j));
                if (tmp <= smallest[0]) smallest = new long[]{tmp, i, j};
            }
        }
        return smallest;
    }
}
