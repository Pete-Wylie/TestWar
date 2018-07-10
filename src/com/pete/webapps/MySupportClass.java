package com.pete.webapps;

public class MySupportClass {
	
	public String myTest() {
		WebUtilities myWebUtilities = new WebUtilities();
		String myString = myWebUtilities.getMyName();
		return myString;
	}
}
