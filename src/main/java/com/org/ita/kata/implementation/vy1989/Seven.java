package com.org.ita.kata.implementation.vy1989;

public class Seven implements com.org.ita.kata.Seven {
    @Override
    public long newAvg(double[] arr, double navg) {
        return 0;
    }

    @Override
    public String seriesSum(int n) {
    	double N = 1;
	    
		for(int i = 1, denom = 4; i < n; i++, denom+=3) 
	    	N+= (double) 1 / denom;
	    
	    String strDouble = String.format("%.2f", N).replace(',', '.'); 
	    return strDouble;
    }

    @Override
    public int whereIsHe(int p, int bef, int aft) {
        return 0;
    }
}
