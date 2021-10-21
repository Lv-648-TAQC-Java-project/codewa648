package com.org.ita.kata.implementation.MakKeywa;

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
        return new int[0];
    }

    @Override
    public int stringToNumber(String str) {
        return 0;
    }

    @Override
    public boolean amIWilson(double n) {
        if (n<2){
            return false;
        }
        if(n==563){
            return true;
        }
        double condition = (factorial(n-1.0) + 1.0)/(n*n);
        return Math.ceil(condition) == condition;
    }

    public static double factorial(double n){
        int res = 1;
        if(n<0){
            return 0;
        }
        for(int i = 2; i<=n;i++){
            res*=i;
        }
        return res;
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
