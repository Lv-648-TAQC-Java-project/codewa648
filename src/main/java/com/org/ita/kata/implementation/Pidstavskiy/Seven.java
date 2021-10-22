package com.org.ita.kata.implementation.Pidstavskiy;

public class Seven implements com.org.ita.kata.Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (double v : arr) {
            sum += v;
        }
        long result = (long) Math.ceil(navg * (arr.length + 1) - sum);
        if (result <= 0){
            throw new IllegalArgumentException();
        }
        else {
            return result;
        }
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
