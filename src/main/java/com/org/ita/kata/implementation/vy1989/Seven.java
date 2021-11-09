package com.org.ita.kata.implementation.vy1989;

public class Seven implements com.org.ita.kata.Seven {
    //The function new_avg(arr, navg) should return the expected donation (rounded up to the next integer)
    //that will permit to reach the average navg.
    @Override
    public long newAvg(double[] arr, double navg) {
        double sum = 0;
        for (double num : arr) {
            sum += num;
        }
        long res = (long) Math.ceil((((arr.length + 1) * navg) - sum));
        if (res <= 0) throw new IllegalArgumentException();
        return res;
    }

    //-----------------------------------------------------------------------------------------------------------------

    @Override
    public String seriesSum(int n) {
        double N = 1;

        for (int i = 1, denom = 4; i < n; i++, denom += 3)
            N += (double) 1 / denom;

        String strDouble = String.format("%.2f", N).replace(',', '.');
        return strDouble;
    }

    //------------------------------------------------------------------------------------------------------------------------
    /*Vasya stands in line with number of people p (including Vasya),
     * but he doesn't know exactly which position he occupies.
     * He can say that there are no less than b people standing in front of him and no more than a people standing behind him.
     * Find the number of different positions Vasya can occupy.*/
    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return Math.min(p - bef, aft + 1);
    }
}
