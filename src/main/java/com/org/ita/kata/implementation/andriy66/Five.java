package com.org.ita.kata.implementation.andriy66;

import java.math.BigInteger;

public class Five implements com.org.ita.kata.Five {
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

    public static boolean canFlowLeft(int[] numbers, int i) {
        if (i == 0) {
            return false;
        }
        return numbers[i - 1] <= numbers[i];
    }

    public static boolean canFlowRight(int[] numbers, int i) {
        if (numbers.length - 1 == i) {
            return false;
        }
        return numbers[i + 1] <= numbers[i];
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
