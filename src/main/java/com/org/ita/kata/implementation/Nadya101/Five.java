package com.org.ita.kata.implementation.Nadya101;

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
        return null;
    }

    @Override
    public double solveSum(double m) {
        return 0;
    }

    @Override
    public long[] smallest(long n) {
        String str = ""+n;
        long[] result = new long[]{Long.MAX_VALUE,0,0};
        for (int i=str.length()-1; i>=0; i--) {
            String str1=str.substring(0,i)+str.substring(i+1);
            for (int j=str.length()-1; j>=0; j--) {
                long tmp = Long.parseLong(str1.substring(0,j)+str.charAt(i)+str1.substring(j));
                if (tmp <= result[0]) result = new long[]{tmp,i,j};
            }
        }
        return result;
    }
}
