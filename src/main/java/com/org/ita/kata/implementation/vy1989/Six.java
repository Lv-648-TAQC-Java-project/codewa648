package com.org.ita.kata.implementation.vy1989;

public class Six implements com.org.ita.kata.Six {
    
	/*Your task is to construct a building which will be a pile of n cubes. 
	 * The cube at the bottom will have a volume of n^3, 
	 * the cube above will have volume of (n-1)^3 and so on until the top which will have a volume of 1^3.
	 */
	@Override
    public long findNb(long m) {
		long countOfCubes = 0;
		long sumOfVolumesOfCubes = 0;
		
		for(long i = m; i >= 1; i-= (long)Math.pow(countOfCubes, 3)) 
			countOfCubes++;
		
		for(long i = 1; i <= countOfCubes;i++) 
			sumOfVolumesOfCubes +=  (long)Math.pow(i, 3);
		
		return sumOfVolumesOfCubes == m ? countOfCubes : -1;
    }
	
	//------------------------------------------------------------------------------------------------------
    
	@Override
    public String balance(String book) {
        return null;
    }

    @Override
    public double f(double x) {
        return 0;
    }

    @Override
    public double mean(String town, String strng) {
        return 0;
    }

    @Override
    public double variance(String town, String strng) {
        return 0;
    }

    @Override
    public String nbaCup(String resultSheet, String toFind) {
        return null;
    }

    @Override
    public String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        return null;
    }
}
