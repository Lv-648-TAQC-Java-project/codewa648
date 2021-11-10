package com.org.ita.kata.implementation.nataskrypak;

import java.text.DecimalFormat;
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
        double sum = 0.00;
        for (int i = 0; i < n; i++) {
            sum += (1 / (1 + (double) i * 3));
        }
        if (sum == 0) {
            return new DecimalFormat("#.0#").format(0);
        } else {
            return String.format("%.2f", sum);
        }
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return p - Math.max(bef + 1, p - aft) + 1;
    }

}
