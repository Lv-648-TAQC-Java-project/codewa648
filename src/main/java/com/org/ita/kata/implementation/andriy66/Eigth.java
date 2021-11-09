package com.org.ita.kata.implementation.andriy66;

import com.org.ita.kata.Eight;

public class Eigth implements Eight {
    @Override
    public int liters(double time) {
        if (time <= 0) {
            return 0;
        }
        return (int) Math.floor(time * 0.5);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        return Math.round(mpg * (1.609344f / 4.54609188f) * 100f) / 100f;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % Math.sqrt(array[i]) == 0) {
                array2[i] = (int) Math.sqrt(array[i]);
            } else {
                array2[i] = array[i] * array[i];
            }
        }
        return array2;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int[] result = new int[2];
        for (Integer i : input) {
            if (i > 0) {
                result[0]++;
            } else {
                result[1] += i;
            }
        }
        return result;
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.valueOf(str);
    }

    @Override
    public boolean amIWilson(double n) {
        if (n == 0 || n == 1) {
            return false;
        } else return n == 5 || n == 563 || n == 13;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return (Math.round(number * 100)) / 100.0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int size = 0;
        if (numbers.length == 0 || divider == 0) {
            return null;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                size++;
            }
        }
        int[] arr = new int[size];
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                arr[j] = numbers[i];
                j++;
            }
        }
        return arr;
    }
}
