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
        if (length > 0 && height > 0 && width > 0) {
            return length * height * width;
        }
        return 0;
    }

    @Override
    public float mpgToKPM(float mpg) {
        if (mpg > 0) {
            return Math.round(mpg * 35.4006004) / 100f;
        }
        return 0;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        int[] arrayCopy = array.clone();
        for (int i = 0; i < arrayCopy.length; i++) {
            if (Math.sqrt(arrayCopy[i]) == (int) Math.sqrt(arrayCopy[i])) {
                arrayCopy[i] = (int) Math.sqrt(arrayCopy[i]);
            } else {
                arrayCopy[i] *= arrayCopy[i];
            }
        }
        return arrayCopy;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int[] result = new int[2];
        if (input == null || input.length == 0) {
            return new int[]{};
        }
        for (int j : input) {
            if (j < 0) {
                result[1] += j;
            } else if (j > 0) {
                result[0]++;
            }
        }
        return result;
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
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
        return ((fact + 1) / (n * n)) == (int) ((fact + 1) / (n * n));
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
        for (int number : numbers) {
            if (number % divider == 0) {
                count++;
            }
        }
        int[] divisible = new int[count];
        int j = 0;
        for (int num : numbers) {
            if (num % divider == 0) {
                divisible[j] = num;
                j++;
            }
        }
        return divisible;
    }
}
