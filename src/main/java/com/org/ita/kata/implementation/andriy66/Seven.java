package com.org.ita.kata.implementation.andriy66;

public class Seven implements com.org.ita.kata.Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        long res = (long) (navg * (arr.length + 1) - sum);
        if (res <= 0) {
            throw new IllegalArgumentException();
        }
        return res;
    }

    @Override
    public String seriesSum(int n) {
        float sum = 0;
        float count = 1f;
        for (int i = 0; i < n; i++) {
            sum += (1f / count);
            count += 3f;
        }
        return String.format("%.2f", sum);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return p - bef;
    }
}
