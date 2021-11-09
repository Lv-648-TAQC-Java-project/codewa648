package com.org.ita.kata.implementation.Mykhailo5;

public class Seven implements com.org.ita.kata.Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        long result = (long) Math.ceil((arr.length + 1) * navg - sum);
        if (result <= 0) {
            throw new IllegalArgumentException();
        } else {
            return result;
        }
    }

    @Override
    public String seriesSum(int n) {
        if (n == 0) {
            return "0.00";
        }
        double sum = 1;
        double j = 4;
        for (int i = 1; i < n; i++) {
            sum += 1 / j;
            j += 3;
        }
        return String.format("%.2f", sum);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return Math.min(p - bef, aft + 1);
    }
}
