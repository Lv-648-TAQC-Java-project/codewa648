package com.org.ita.kata.implementation.MakKeywa;

public class Seven implements com.org.ita.kata.Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        if (n == 0) {
            return "0";
        }
        double res = 1.0;
        for (double i = 2.0; i <= n; i++) {
            res += 1.0 / (i * 3.0 - 2.0);
        }
        String result = "" + Math.round(res * 100.0) / 100.0;
        return String.format("%.2f", result);
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        int res = 0;
        for (int a = 0; a <= aft; a++) {
            for (int b = bef; b <= p - 1; b++) {
                if (a + b == p - 1) {
                    res++;
                }
            }
        }
        return res;
    }
}
