package com.org.ita.kata.implementation.MakKeywa;

public class Seven implements com.org.ita.kata.Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        return null;
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
