package com.org.ita.kata.implementation.vy1989;

public class Seven implements com.org.ita.kata.Seven {
	//The function new_avg(arr, navg) should return the expected donation (rounded up to the next integer) 
	//that will permit to reach the average navg.
    @Override
    public long newAvg(double[] arr, double navg) {
    	double sum = 0;
		for(double num : arr) {
			sum+=num;
		}
		long res = (long) Math.ceil((((arr.length + 1) * navg ) - sum));
        if(res <= 0) throw new IllegalArgumentException();
        return res;
    }

    //-----------------------------------------------------------------------------------------------------------------
    
    @Override
    public String seriesSum(int n) {
        return null;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
