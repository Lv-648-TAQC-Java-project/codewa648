package com.org.ita.kata;

import org.testng.annotations.DataProvider;

public class DataProviderUserImplementation {
   
    @DataProvider
    public Object[][] implementationsEightKataDataProvider() {
	
	
	return new Object[][] {
	    {new com.org.ita.kata.implementation.andriy66.Eigth()} ,
	    {new com.org.ita.kata.implementation.AndriyBarskyi.Eigth()}, 
	    {new com.org.ita.kata.implementation.MakKeywa.Eigth()},
	    {new com.org.ita.kata.implementation.Nadya101.Eigth()}, 
	    {new com.org.ita.kata.implementation.Mykhailo5.Eigth()}, 
	    {new com.org.ita.kata.implementation.nataskrypak.Eigth()}, 
	    {new com.org.ita.kata.implementation.Pidstavskiy.Eigth()}, 
	    {new com.org.ita.kata.implementation.vy1989.Eigth()}, 
	};
    }
    
    public static Object[][] combine(Object[][] impl,Object[][] data){
	return null;
	
    }
  
}