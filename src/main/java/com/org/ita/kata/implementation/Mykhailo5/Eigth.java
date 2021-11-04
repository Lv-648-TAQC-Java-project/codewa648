package com.org.ita.kata.implementation.Mykhailo5;

import com.org.ita.kata.Eight;

import java.util.Arrays;

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
        float gallon = 4.54609188f;
        float mile = 1.609344f;
        float out = (mpg*mile)/gallon;
        return (float) Math.round(out*100)/100;
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
        int[] newArray = new int[numbers.length];
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%divider==0){
                newArray[result]=numbers[i];
                result++;
            }
        }
        return Arrays.copyOf(newArray, result);
    }
}
