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
        return 0;
    }

    @Override
    public boolean amIWilson(double n) {
        return false;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return 0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        return new int[0];
    }
}
