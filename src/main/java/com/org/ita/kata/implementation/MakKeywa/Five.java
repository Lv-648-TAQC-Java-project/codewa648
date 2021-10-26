package com.org.ita.kata.implementation.MakKeywa;

import java.math.BigInteger;
import java.util.Arrays;

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
        return 0;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        return BigInteger.valueOf(4).multiply(fibonacciSum(n));
    }

    public static BigInteger fibonacciSum(BigInteger n) {
        n = n.add(BigInteger.valueOf(1));
        BigInteger sum = BigInteger.valueOf(0);
        BigInteger previous = BigInteger.valueOf(1);
        BigInteger now = BigInteger.valueOf(1);
        BigInteger temp;
        BigInteger i = BigInteger.valueOf(3);
        if (n.compareTo(BigInteger.valueOf(2)) > -1) {
            sum = sum.add(previous);
        }
        if (n.compareTo(BigInteger.valueOf(3)) > -1) {
            sum = sum.add(now);
        }
        while (i.compareTo(n) <= 0) {
            temp = now;
            now = now.add(previous);
            previous = temp;
            i = i.add(BigInteger.valueOf(1));
            sum = sum.add(now);
        }
        return sum;
    }

    @Override
    public double solveSum(double m) {
        return ((2.0 * m + 1.0 - Math.sqrt(4.0 * m + 1.0)) / (2.0 * m));
    }

    @Override
    public long[] smallest(long n) {
        int[] digits = new int[("" + n).length()];
        long[] res = new long[]{n, -1, -1};
        for (int i = digits.length - 1; i > -1; i--) {
            digits[i] = (int) (n % 10);
            n /= 10;
        }
        for (int i = 0; i < digits.length; i++) {
            for (int j = 0; j < digits.length; j++) {
                if (i != j || digits[i] != digits[j]) {
                    long attempt = arrToLong(swapIToStart(digits, i, j));
                    if (res[0] > attempt) {
                        res[0] = attempt;
                        res[1] = i;
                        res[2] = j;
                    }
                }
            }
        }
        return res;
    }

    public static long arrToLong(int[] digit) {
        String number = "";
        for (int i = 0; i < digit.length; i++) {
            number += "" + digit[i];
        }
        return Long.parseLong(number);
    }

    public static int[] swapIToStart(int[] digit, int i, int j) {
        int[] copy = new int[digit.length];
        Arrays.fill(copy, -1);
        copy[j] = digit[i];
        int m = 0;
        for (int k = 0; k < copy.length; k++) {
            if (copy[k] == -1) {
                if (m != i){
                    copy[k] = digit[m++];
                }else{
                    copy[k] = digit[++m];
                    m++;
                }

            }
        }
        return copy;
    }
}
