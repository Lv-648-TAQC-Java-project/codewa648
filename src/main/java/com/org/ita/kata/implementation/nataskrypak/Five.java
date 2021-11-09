package com.org.ita.kata.implementation.nataskrypak;

import java.math.BigInteger;

public class Five implements com.org.ita.kata.Five {
    @Override
    public int artificialRain(int[] v) {
        int maxSection = 1;
        int lower = 0;
        int currentSection = 1;
        for (int i = 1; i < v.length; i++) {
            if (v[i] < v[i - 1]) {
                lower = i;
            } else if (v[i] > v[i - 1]) {
                maxSection = Math.max(maxSection, currentSection);
                currentSection = i - lower;
            }
            currentSection++;
        }
        return Math.max(maxSection, currentSection);
    }

    @Override
    public long[] gap(int g, long m, long n) {
        BigInteger first = new BigInteger("" + m);
        BigInteger last = first.nextProbablePrime();
        if (!first.isProbablePrime(1)) {
            first = last;
        }
        long i = 0, j = 0;
        while (j <= n) {
            j = last.longValue();
            i = first.longValue();
            if (j - i == g)
                return new long[]{i, j};
            first = last;
            last = first.nextProbablePrime();
        }
        return null;
    }

    @Override
    public int zeros(int n) {
        if (n < 0) {
            return -1;
        }
        int count = 0;
        for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;
        BigInteger third = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;

        for (int i = 0; i <= n.intValue(); i++) {
            first = second;
            second = third;
            third = first.add(second);
            sum = sum.add(first);
        }

        return sum.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solveSum(double m) {
        m *= 2;
        return (m + 1 - Math.sqrt(2 * m + 1)) / m;
    }

    @Override
    public long[] smallest(long n) {
        String stringedNumber = n + "";
        long smallestNumber = n;
        int numberLength = stringedNumber.length();
        long[] result = new long[3];

        for (int i = 0; i < numberLength; i++) {
            for (int j = 0; j < numberLength; j++) {
                StringBuilder numberSB = new StringBuilder(stringedNumber);
                char digit = numberSB.charAt(i);
                numberSB.deleteCharAt(i);
                numberSB.insert(j, digit);
                long currentNumber = Long.parseLong(numberSB.toString());
                if (currentNumber < smallestNumber) {
                    smallestNumber = currentNumber;
                    result[0] = smallestNumber;
                    result[1] = i;
                    result[2] = j;
                }
            }
        }
        return result;
    }
}
