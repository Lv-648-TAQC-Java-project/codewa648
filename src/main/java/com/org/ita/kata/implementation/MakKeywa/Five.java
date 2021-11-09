package com.org.ita.kata.implementation.MakKeywa;

import java.math.BigInteger;
import java.util.Arrays;

public class Five implements com.org.ita.kata.Five {
    private static int[] computeLeftFlow(int[] numbers) {
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

    private static int[] computeRightFlow(int[] numbers) {
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

    private static boolean canFlowLeft(int[] numbers, int i) {
        if (i == 0) {
            return false;
        }
        return numbers[i - 1] <= numbers[i];
    }

    private static boolean canFlowRight(int[] numbers, int i) {
        if (numbers.length - 1 == i) {
            return false;
        }
        return numbers[i + 1] <= numbers[i];
    }

    private static boolean isPrime(long n) {
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

    private static BigInteger fibonacciSum(BigInteger n) {
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

    private static long arrToLong(int[] digit) {
        String number = "";
        for (int i = 0; i < digit.length; i++) {
            number += "" + digit[i];
        }
        return Long.parseLong(number);
    }

    private static int[] swapIToStart(int[] digit, int i, int j) {
        int[] copy = new int[digit.length];
        Arrays.fill(copy, -1);
        copy[j] = digit[i];
        int m = 0;
        for (int k = 0; k < copy.length; k++) {
            if (copy[k] == -1) {
                if (m != i) {
                    copy[k] = digit[m++];
                } else {
                    copy[k] = digit[++m];
                    m++;
                }

            }
        }
        return copy;
    }

    @Override
    public int artificialRain(int[] v) {
        int[] flowRight = computeRightFlow(v);
        int[] flowLeft = computeLeftFlow(v);
        int maxWateredPlains = 0;
        for (int i = 0; i < v.length; i++) {
            maxWateredPlains = Math.max(flowLeft[i] + flowRight[i] + 1, maxWateredPlains);
        }
        return maxWateredPlains;
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
        if(n.compareTo(BigInteger.valueOf(1))<0){
            return BigInteger.ZERO;
        }
        return BigInteger.valueOf(4).multiply(fibonacciSum(n));
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
}
