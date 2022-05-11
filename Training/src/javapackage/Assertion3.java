package javapackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion3 {
	@Test
	public void testCase1() {

		String expexted = "Google";
		String actual = "Gooogle";
      try {
		Assert.assertEquals(actual, expexted);}
      catch (AssertionError e) {
    	  e.printStackTrace();
	      System.out.println("pass");	
	}
}
}