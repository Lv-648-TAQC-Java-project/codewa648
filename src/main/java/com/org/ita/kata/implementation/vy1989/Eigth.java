package com.org.ita.kata.implementation.vy1989;

import com.org.ita.kata.Eight;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Eigth implements Eight {

    //You get given the time in hours and you need to return the number of litres Nathan will drink, rounded to the smallest value.
    @Override
    public int liters(double time) {
        return time > 0 ? (int) ((int) time * 0.5) : 0;
    }

    //---------------------------------------------------------------------------------------------------------------------------------------------


    //Bob needs a fast way to calculate the volume of a cuboid with three values: 
    //length, width and the height of the cuboid. Write a function to help Bob with this calculation.
    @Override
    public double getVolumeOfCuboid(double length, double width, double height) {
        return length < 0 || width < 0 || height < 0 ? 0 : length * width * height;
    }

    //---------------------------------------------------------------------------------------------------------------------------------------------


    //Create an application that will display the number of kilometers per liter (output) based on the number of miles per imperial gallon (input).
    @Override
    public float mpgToKPM(float mpg) {
        return Float.parseFloat(String.format("%.2f", mpg * 1.609344f / 4.54609188f)); //kilometers divided into liters
    }

    //---------------------------------------------------------------------------------------------------------------------------------------------


    //Write a method, that will get an integer array as parameter and will process every number from this array.
    @Override
    public int[] squareOrSquareRoot(int[] array) throws NullPointerException {
        int arrayLength = 0;
        int[] copyArr = null;
        try {
            arrayLength = array.length;
            copyArr = new int[arrayLength];
            for (int i = 0; i < arrayLength; i++) {
                double take = Math.sqrt(array[i]);
                copyArr[i] = (int) (take % 1 == 0 ? take : Math.pow(array[i], 2));
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        return copyArr;
    }

    //---------------------------------------------------------------------------------------------------------------------------------------------


    //Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers.
    @Override
    public int[] countPositivesSumNegatives(int[] input) throws NullPointerException {
        int[] countOfPositivesAndSumOfNegatives = new int[0];
        try {
            if (input.length > 0) countOfPositivesAndSumOfNegatives = new int[2];

            for (int el : input) {
                if (el > 0)
                    countOfPositivesAndSumOfNegatives[0]++;
                else if (el < 0)
                    countOfPositivesAndSumOfNegatives[1] += el;
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }

        return countOfPositivesAndSumOfNegatives;
    }

    //---------------------------------------------------------------------------------------------------------------------------------------------


    //We need a function that can transform a string into a number
    @Override
    public int stringToNumber(String str) throws NumberFormatException {
        int numberFromString = 0;
        try {
            numberFromString = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        return numberFromString;
    }

    //---------------------------------------------------------------------------------------------------------------------------------------------


    //Your task is to create a function that returns true if the given number is a Wilson prime.
    @Override
    public boolean amIWilson(double n) {
        if (isPrime(n)) {
            BigDecimal one = new BigDecimal(1);
            BigDecimal nPowed = new BigDecimal(Math.pow(n, 2));
            return factorial(n - 1).add(one).remainder(nPowed) == BigDecimal.ZERO; // implements formula ((P-1)! + 1) / (P * P)
        }
        return false;
    }

    private boolean isPrime(double n) {
        if (n <= 1) return false;
        int dividersCount = 0;

        for (long i = 1; i <= n; i++) {
            if (n % i == 0)
                dividersCount++;
            if (dividersCount > 2)
                return false;
        }
        return true;
    }

    private BigDecimal factorial(double n) {
        BigDecimal factorial = new BigDecimal(1);

        for (int i = 1; i <= n; i++) {
            factorial = factorial.multiply(new BigDecimal(i));
        }
        return factorial;
    }

    //---------------------------------------------------------------------------------------------------------------------------------------------


    //Each number should be formatted that it is rounded to two decimal places
    @Override
    public double twoDecimalPlaces(double number) {
        return Double.parseDouble(String.format("%.2f", number).replace(',', '.'));
    }

    //---------------------------------------------------------------------------------------------------------------------------------------------


    //Complete the function which takes two arguments and returns all numbers which are divisible by the given divisor.
    @Override
    public int[] divisibleBy(int[] numbers, int divider) {
	if(numbers == null || numbers.length == 0 || divider == 0){return null;}
	List<Integer> list = new ArrayList<>();
	int[] dividedArr = null;
	int dividedArrSize = 0;

	for (int el : numbers) {
	    if (el % divider == 0) {
		list.add(el);
	    }
	}

	dividedArrSize = list.size();
	dividedArr = new int[dividedArrSize];

	for (int i = 0; i < dividedArrSize; i++) {
	    dividedArr[i] = list.get(i);
	}

	return dividedArr;
    }
}
