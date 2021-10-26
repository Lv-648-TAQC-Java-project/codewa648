package com.org.ita.kata.implementation.Pidstavskiy;

public class Seven implements com.org.ita.kata.Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        double sum = 0.00;
        if (n == 0) {
            return String.valueOf(sum);
        } else {
            for (int i = 0; i < n; i++) {
                sum += 1.0 / (1 + i * 3);
            }
            return String.format("%.2f", sum);
        }
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return Math.min(p - bef, aft + 1);
    }
}
