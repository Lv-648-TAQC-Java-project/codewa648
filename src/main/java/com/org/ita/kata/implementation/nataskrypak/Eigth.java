package com.org.ita.kata.implementation.nataskrypak;

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
        if(input == null || input.length == 0){
            return new int[0];
        }
        int countPositives = 0, sumNegatives = 0;
        for(int i = 0; i < input.length; i++){
            if(input[i] > 0){
                countPositives++;
            }else{
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
        return n == 5 || n == 13 || n == 563;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return (double) Math.round(number * 100) / 100;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        int count = 0;
        for(int i = 0; i < numbers.length; i++){
            if(i % divider == 0){
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
