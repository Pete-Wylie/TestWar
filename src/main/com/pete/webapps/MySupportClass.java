package main.com.pete.webapps;

public class MySupportClass {
	
	public String myTest() {
		WebUtilities myWebUtilities = new WebUtilities();
		String myString = myWebUtilities.getMyName();
		return myString;
	}
	
	public int myNumberTest(){
		WebUtilities myWebUtilities = new WebUtilities();
		return myWebUtilities.addTwoNumbers();
	}
}
