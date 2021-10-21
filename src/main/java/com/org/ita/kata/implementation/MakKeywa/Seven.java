package com.org.ita.kata.implementation.MakKeywa;

public class Seven implements com.org.ita.kata.Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        int n = arr.length;
        double sum = 0;
        double exp;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        exp = Math.ceil(navg * (n + 1) - sum);
        if (exp <= 0) {
            throw new IllegalArgumentException("too low avg");
        }
        return (long) exp;
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
