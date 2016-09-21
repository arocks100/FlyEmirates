package com.narayana.flyemirates.utils;

import java.util.List;

import org.testng.Assert;

public class Assertions {
	
	public static void verifyequlas(Object obj1,Object obj2){
		
		Assert.assertEquals(obj1, obj2);
	}
	
	public static boolean isListEmpty(List<String> actual, List<String> expected){
		
		actual.removeAll(expected);
		int size=actual.size();
		if(size==0){
			return true;
			
		}
		
		return false;
	}

}
