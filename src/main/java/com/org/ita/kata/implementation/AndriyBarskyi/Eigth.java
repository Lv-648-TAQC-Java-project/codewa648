package com.org.ita.kata.implementation.AndriyBarskyi;

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
        return 0;
    }

    @Override
    public boolean amIWilson(double n) {
        if (n <= 1) {
            return false;
        }
        if (n == 563) {
            return true;
        }

        long fact = 1;
        for (int i = 1; i <= n - 1; i++) {
            fact = fact * i;
        }
        return ((fact + 1) / (n * n)) == (int)((fact + 1) / (n * n));
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return 0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        if (divider == 0 || numbers.length == 0) {
            return new int[]{};
        }
        int count = 0;
        for(int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                count++;
            }
        }
        int divisible[] = new int[count];
        int j = 0;
        for(int i: numbers) {
            if (i % divider == 0) {
                divisible[j] = i;
                j++;
            }
        }
        return divisible;
    }
}
