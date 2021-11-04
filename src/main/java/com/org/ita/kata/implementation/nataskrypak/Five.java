package com.org.ita.kata.implementation.nataskrypak;

import java.math.BigInteger;

public class Five implements com.org.ita.kata.Five {
    @Override
    public int artificialRain(int[] v) {
        return 0;
    }

    @Override
    public long[] gap(int g, long m, long n) {
        return new long[0];
    }

    @Override
    public int zeros(int n) {
        return 0;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger first = BigInteger.ZERO;
        BigInteger second = BigInteger.ONE;
        BigInteger third = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;

        for(int i = 0; i <= n.intValue(); i++) {
            first = second;
            second = third;
            third = first.add(second);
            sum = sum.add(first);
        }

        return sum.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solveSum(double m) {
        m *= 2;
        return (m + 1 - Math.sqrt(2 * m + 1)) / m;
    }

    @Override
    public long[] smallest(long n) {
        String stringedNumber = n + "";
        long smallestNumber = n;
        int numberLength = stringedNumber.length();
        long[] result = new long[3];

        for (int i = 0; i < numberLength; i++){
            for (int j = 0; j < numberLength; j++){
                StringBuilder numberSB = new StringBuilder(stringedNumber);
                char digit = numberSB.charAt(i);
                numberSB.deleteCharAt(i);
                numberSB.insert(j, digit);
                long currentNumber = Long.parseLong(numberSB.toString());
                if(currentNumber < smallestNumber){
                    smallestNumber = currentNumber;
                    result[0] = smallestNumber;
                    result[1] = i;
                    result[2] = j;
                }
            }
        }
        return result;
    }
}
