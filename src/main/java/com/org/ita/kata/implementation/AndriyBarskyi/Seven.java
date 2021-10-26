package com.org.ita.kata.implementation.AndriyBarskyi;

public class Seven implements com.org.ita.kata.Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        if (n == 0) return "0.00";
        double sum = 0;
        double denominator = 1;
        for (int i = n; i > 0; i--) {
            sum += 1 / denominator;
            denominator += 3;
        }
        return String.format("%.2f", sum);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        if (p - bef <= aft)
            return p - bef;
        else {
            return aft + 1;
        }
    }
}
