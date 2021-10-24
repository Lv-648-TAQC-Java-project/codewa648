package com.org.ita.kata.implementation.nataskrypak;

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
        int i;
        for(i = 0; i <= p; i++) {
            if (i > bef && i >= aft) {
                return i;
            }
        }
        return i;
    }
}
