package test.com.pete.webapps;

import static org.junit.Assert.*;

import org.junit.Test;

import main.com.pete.webapps.WebUtilities;

public class MySupportClassTest {
	
	WebUtilities myWebUtilities = new WebUtilities();

	@Test
	public void test() {
		
		assertEquals(myWebUtilities.addTwoNumbers(), 23);
	}

}
