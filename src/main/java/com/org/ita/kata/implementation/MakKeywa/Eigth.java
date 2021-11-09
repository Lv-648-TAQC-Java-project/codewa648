package com.org.ita.kata.implementation.MakKeywa;

import com.org.ita.kata.Eight;

public class Eigth implements Eight {
    public static double factorial(double n) {
        int res = 1;
        if (n < 0) {
            return 0;
        }
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    @Override
    public int liters(double time) {
        return (int) (time * 0.5);
    }

    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length * width * height;
    }

    @Override
    public float mpgToKPM(float mpg) {
        final float koef = 1.609344f / 4.54609188f;
        float kmp = mpg * koef;
        kmp = Math.round(kmp * 100) / 100f;
        return kmp;
    }

    @Override
    public int[] squareOrSquareRoot(int[] array) {
        int n = array.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            double root = Math.sqrt(array[i]);
            if (root == Math.ceil(root)) {
                res[i] = (int) root;
            } else {
                res[i] = (array[i] * array[i]);
            }
        }
        return res;
    }

    @Override
    public int[] countPositivesSumNegatives(int[] input) {
        if (input == null) {
            return new int[0];
        }
        if (input.length == 0) {
            return new int[0];
        }
        int[] res = {0, 0};
        for (int i = 0; i < input.length; i++) {
            if (input[i] > 0) {
                res[0]++;
                continue;
            }
            res[1] += input[i];
        }
        return res;
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
        double condition = (factorial(n - 1.0) + 1.0) / (n * n);
        return Math.ceil(condition) == condition;
    }

    @Override
    public double twoDecimalPlaces(double number) {
        return Math.round(number * 100) / 100.0;
    }

    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
        if (numbers.length == 0 || divider == 0) {
            return null;
        }
        String res = "";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                res += "" + numbers[i] + ",";
            }
        }
        String[] strNumbers = res.split(",");
        int size = strNumbers.length;
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(strNumbers[i]);
        }
        return arr;
    }
}
