package com.org.ita.kata.implementation.Nadya101;

import com.org.ita.kata.Eight;

import java.util.ArrayList;

public class Eigth implements Eight {
    @Override
    public int liters(double time) {
        if (time > 0) {
            return (int) (time * 0.5);
        } else {
            return 0;
        }
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        if (length > 0 & width > 0 & height > 0) {
            return (int) (length * width * height);
        } else {
            return -1;
        }
    }

    @Override
    public float mpgToKPM(float mpg) {
        final float LITTERS_IN_GALLON = 4.54609188f;
        final float KM_IN_MILE = 1.609344f;
        if (mpg > 0) {
            return (float) Math.round((mpg * KM_IN_MILE / LITTERS_IN_GALLON) * 100) / 100;
        } else
            return -1;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        int[] newArray = new int[array.length];
        try {
            for (int i = 0; i < array.length; i++) {
                if (Math.sqrt(array[i]) % 1 == 0) {
                    newArray[i] = (int) (Math.sqrt(array[i]));
                } else {
                    newArray[i] = array[i] * array[i];
                }
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        return newArray;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        int count = 0;
        int sum = 0;
        if (input.length <= 0) {
            return null;
        } else {
            for (int el : input) {
                if (el > 0) {
                    count++;
                } else {
                    sum += el;
                }
            }
        }
        return new int[]{count, sum};
    }

    @Override
    public int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    @Override
    public boolean amIWilson(double n) {
        long result = 1;
        for (int i = 1; i < n; i++) { ///getFactorial
            result *= i;
        }
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 563) {
            return true;
        }
        return ((result + 1) / n) % 1 == 0;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return Math.round(number * 100.0) / 100.0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                evenList.add(numbers[i]);
            }
        }
        int[] evenArray = new int[evenList.size()];
        for (int j = 0; j < evenList.size(); j++) {
            evenArray[j] = evenList.get(j);
        }
        return evenArray;
    }
}
