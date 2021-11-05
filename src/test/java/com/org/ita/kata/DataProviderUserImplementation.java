package com.org.ita.kata;

import java.util.ArrayList;
import java.util.List;

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
    
    public static Object[][] combine(Object[][] impl, Object[][] data){
	List<Object[]> listObjects = new ArrayList<>();
	for(Object[] obj_impl : impl) {
	    
	    for(Object[] obj_data : data) {
		int totalLength = obj_data.length + obj_impl.length;
		Object[] objArr = new Object[totalLength];
		System.arraycopy(obj_impl, 0, objArr, 0, obj_impl.length);
		System.arraycopy(obj_data, 0, objArr, obj_impl.length, totalLength-1);
		
		listObjects.add(objArr);
	    }
	}
	
	
	return listObjects.toArray(new Object[0][0]);
	
    }
  
}