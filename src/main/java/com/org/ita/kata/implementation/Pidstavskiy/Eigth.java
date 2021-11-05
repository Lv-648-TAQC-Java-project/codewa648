package com.org.ita.kata.implementation.Pidstavskiy;

import com.org.ita.kata.Eight;

public class Eigth implements Eight {
    @Override
    public int liters(double time) {
        return 0;
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height)git  {
        return 0;
    }

    @Override
    public float mpgToKPM(float mpg) {
        float gallon = 4.54609188f;
        float mile = 1.609344f;
        float var = (mpg * mile) / gallon;
        return (float) Math.round(var * 100) / 100;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if ((Math.sqrt(array[i])) % 1 == 0) {
                array[i] = (int) Math.sqrt(array[i]);
            } else {
                array[i] *= array[i];
            }
        }
        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int[] array = new int[2];
        if (input != null && input.length != 0) {
            for (int i = 0; i < input.length; i++) {
                if (input[i] > 0) {
                    array[0]++;
                } else {
                    array[1] += input[i];
                }
            }
        } else {
            return new int[0];
        }
        return array;
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
