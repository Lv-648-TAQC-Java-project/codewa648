package com.org.ita.kata.implementation.AndriyBarskyi;

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
        if (p - bef <= aft)
            return p - bef;
        else {
            return aft + 1;
        }
    }
}
