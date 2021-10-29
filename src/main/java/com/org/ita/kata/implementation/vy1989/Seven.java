package com.org.ita.kata.implementation.vy1989;

public class Seven implements com.org.ita.kata.Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
        return null;
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
