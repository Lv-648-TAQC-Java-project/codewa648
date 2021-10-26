package com.org.ita.kata.implementation.Nadya101;

public class Seven implements com.org.ita.kata.Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += (double) 1 / (1 + i * 3);
        }
        double roundSum = Math.round(sum * 100.0) / 100.0;
        if (roundSum == 0) {
            return "0.00";
        }
        return Double.toString(roundSum);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return p-Math.max(bef+1, p-aft)+1;
    }
}
