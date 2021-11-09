package com.org.ita.kata.implementation.Mykhailo5;

import com.org.ita.kata.Eight;

import java.util.Arrays;

public class Eigth implements Eight {
    @Override
    public int liters(double time) {
        if (time < 0) {
            return 0;
        }
        return (int) Math.floor(time * 0.5);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        if(length<0 || width<0 || height<0){
            return 0;
        }
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        float gallon = 4.54609188f;
        float mile = 1.609344f;
        float out = (mpg * mile) / gallon;
        return (float) Math.round(out * 100) / 100;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            double sqrt = Math.sqrt(array[i]);
            if (sqrt % 1 == 0) {
                result[i] = (int) sqrt;
            } else {
                result[i] = array[i] * array[i];
            }
        }
        return result;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[]{};
        int[] rez = new int[2];
        rez[0] = 0;
        rez[1] = 0;
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                rez[0]++;
            } else {
                rez[1] += input[i];
            }
        }
        return rez;
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        if (n == 0 || n == 1) {
            return false;
        } else return n == 13 || n == 5 || n == 563;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        double round = Math.round(number * 100.0) / 100.0;
        return round;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        if (numbers.length == 0 || divider == 0) {
            return null;
        }
        int[] newArray = new int[numbers.length];
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                newArray[result] = numbers[i];
                result++;
            }
        }
        return Arrays.copyOf(newArray, result);
    }
}
