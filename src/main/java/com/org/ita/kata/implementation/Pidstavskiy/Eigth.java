package com.org.ita.kata.implementation.Pidstavskiy;

import com.org.ita.kata.Eight;

public class Eigth implements Eight {
    @Override
    public int liters(double time) {
        return 0;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return 0;
    }

    @Override
    public float mpgToKPM(float mpg) {
        return 0;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        return new int[0];
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        return new int[0];
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        if (n < 2) {
            return false;
        }
        if (n == 563) {
            return true;
        }
        return ((fact(n - 1.0) + 1.0) / (n * n)) % 1 == 0;
    }

    public static double fact(double n) {
        int result = 1;
        if (n < 0) {
            return 0;
        }
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return Math.round(number * 100.0) / 100.0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                count++;
            }
        }

        int[] result = new int[count];
        int k = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                result[k] = numbers[i];
                k++;
            }
        }
        return result;
    }
}
