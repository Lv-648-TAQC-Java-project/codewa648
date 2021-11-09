package com.org.ita.kata.implementation.nataskrypak;

import com.org.ita.kata.Eight;

public class Eigth implements Eight {
    @Override
    public int liters(double time) {
        if (time <= 0) {
            return 0;
        }
        return (int) Math.floor(time / 2);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        return (float) Math.round(mpg * 1.609344 / 4.54609188 * 100) / 100;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {

        for (int i = 0; i < array.length; i++) {

            if (Math.sqrt(array[i]) % 1 == 0) {
                array[i] = (int) Math.sqrt(array[i]);
            } else {
                array[i] = array[i] * array[i];
            }
        }
        return array;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        }
        int countPositives = 0, sumNegatives = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                countPositives++;
            } else {
                sumNegatives += input[i];
            }
        }
        return new int[]{countPositives, sumNegatives};
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        if (n == 0 || n == 1) {
                return false;
        }
        return n == 5 || n == 13 || n == 563;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return (double) Math.round(number * 100) / 100;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        if (divider == 0 || numbers.length == 0) {
            return new int[]{};
        }
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                count++;
            }
        }
        int[] newArray = new int[count];
        int k = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                newArray[k] = numbers[i];
                k++;
            }
        }
        return newArray;
    }
}
