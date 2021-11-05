package com.org.ita.kata.implementation.andriy66;

import java.math.BigInteger;

public class Five implements com.org.ita.kata.Five {
    @Override
    public int artificialRain(int[] v) {
        int[] flowRight = computeRightFlow(v);
        int[] flowLeft = computeLeftFlow(v);
        int maxWateredPlains = 0;
        for (int i = 0; i < v.length; i++) {
            maxWateredPlains = Math.max(flowLeft[i] + flowRight[i] + 1, maxWateredPlains);
        }
        return maxWateredPlains;
    }

    public static int[] computeLeftFlow(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (canFlowLeft(numbers, i)) {
                result[i] = result[i - 1] + 1;
            } else {
                result[i] = 0;
            }
        }
        return result;
    }

    public static int[] computeRightFlow(int[] numbers) {
        int[] result = new int[numbers.length];
        for (int i = numbers.length - 1; i >= 0; i--) {
            if (canFlowRight(numbers, i)) {
                result[i] = result[i + 1] + 1;
            } else {
                result[i] = 0;
            }
        }
        return result;
    }

    public static boolean canFlowLeft(int[] numbers, int i) {
        if (i == 0) {
            return false;
        }
        return numbers[i - 1] <= numbers[i];
    }

    public static boolean canFlowRight(int[] numbers, int i) {
        if (numbers.length - 1 == i) {
            return false;
        }
        return numbers[i + 1] <= numbers[i];
    }




    @Override
    public long[] gap(int g, long m, long n) {
        long a = 0, b = 0;
        for (long i = m; i <= n; i++) {
            if (b - a == g) {return new long[] {a, b};}
            if (isPrime(i)) {  a = b; b = i;  }
        }
        return null;
    }
    private static boolean isPrime(long n) {
        if (n % 2 == 0){ return false;}
        for (long i = 3; i * i <= n ; i += 2)
            if (n % i == 0){ return false;}
        return true;
    }


    @Override
    public int zeros(int n) {
        long fact=1;
        for(int i=1;i<n+1;i++){
            fact*=i;
        }
        int countOfNull=0;
        long number=0;
        while(number==0){
            number=fact%10;
            if(number==0){
                countOfNull++;
            }
            fact/=10;
        }
        return countOfNull;
    }

    @Override
    public BigInteger perimeter(BigInteger n) {
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        BigInteger c = BigInteger.ONE;
        BigInteger sum = BigInteger.ZERO;

        for(int i = 0; i <= n.intValue(); i++) {
            a = b;
            b = c;
            c = a.add(b);
            sum = sum.add(a);
        }

        return sum.multiply(BigInteger.valueOf(4));
    }

    @Override
    public double solveSum(double m) {
        double s =  Math.sqrt(4 * m + 1);
        return (1 - s) / (2 * m) + 1;
    }

    @Override
    public long[] smallest(long n) {
        final String s = ""+n;
        long[] result = new long[]{Long.MAX_VALUE,0,0};
        for (int i=s.length()-1; i>=0; i--) {
            final String s1=s.substring(0,i)+s.substring(i+1);
            for (int j=s.length()-1; j>=0; j--) {
                final long tmp = Long.valueOf(s1.substring(0,j)+s.charAt(i)+s1.substring(j));
                if (tmp <= result[0]) result = new long[]{tmp,i,j};
            }
        }
        return result;
    }
}
