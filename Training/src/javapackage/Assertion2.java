package javapackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion2 {
	@Test
	public void testCase1() {

		String expexted = "Google";
		String actual = "Google";

		Assert.assertEquals(actual, expexted, "matching");
		System.out.println("pass");
		
		int a =2;
		int b=3;
		
		Assert.assertEquals(a==b, false);
		Assert.assertTrue(a<b,"true");
		Assert.assertFalse(a>b);
	}
	
	@Test
	public void testCase2() {
		System.out.println("selenium");
	}
}
