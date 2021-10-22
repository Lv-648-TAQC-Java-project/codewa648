package com.org.ita.kata.implementation.Nadya101;

public class Seven implements com.org.ita.kata.Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (double donation : arr) {
            sum += donation;
        }
        long nextDonation = (long) Math.ceil((arr.length + 1) * navg - sum);
        if (nextDonation < 0) {
            throw new IllegalArgumentException("-1");
        }
        return nextDonation;
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
