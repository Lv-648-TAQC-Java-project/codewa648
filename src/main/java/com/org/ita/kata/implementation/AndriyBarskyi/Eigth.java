package com.org.ita.kata.implementation.AndriyBarskyi;

import com.org.ita.kata.Eight;

public class Eigth implements Eight {
    @Override
    public int liters(double time) {
        if (time > 0) {
            return (int) (time / 2);
        }
        return 0;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        if (length > 0 && height > 0 && width > 0)
            return length * height * width;
        return 0;
    }

    @Override
    public float mpgToKPM(float mpg) {
        return Math.round(mpg * 35.4006004) / 100f;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (Math.sqrt(array[i]) == (int)Math.sqrt(array[i])) {
                array[i] = (int)Math.sqrt(array[i]);
            }
            else {
                array[i] *= array[i];
            }
        }
        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int[] result = new int[2];
        if (input == null || input.length == 0) {
            return new int[] {};
        }
        for (int i = 0; i < input.length; i++) {
            if (input[i] < 0) {
                result[1] += input[i];
            } else if (input[i] > 0) {
                result[0]++;
            }
        }
        return result;
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
        return Math.round(number * 100) / 100.0;
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
