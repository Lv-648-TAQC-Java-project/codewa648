package com.org.ita.kata.implementation.Nadya101;

import com.org.ita.kata.Eight;

import java.util.ArrayList;

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
        return false;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return 0;
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
