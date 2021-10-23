package com.org.ita.kata.implementation.nataskrypak;

import java.util.stream.DoubleStream;

public class Seven implements com.org.ita.kata.Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double result = navg * (arr.length + 1) - DoubleStream.of(arr).sum();
        if (result <= 0) {
            throw new IllegalArgumentException();
        }
        return (long) (Math.ceil(result));
    }

    @Override
    public String seriesSum(int n) {
        return null;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
