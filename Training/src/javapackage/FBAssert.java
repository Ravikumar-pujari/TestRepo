package javapackage;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FBAssert {
	
	@Test
	public void checkAssert() {
		
	String act="HELLO";
	String exp = "HELLOO";
	
	try {
	Assert.assertEquals(act, exp);
	}catch(AssertionError a) {
		a.printStackTrace();
	}
	System.out.println("SUCCESS");
	}
	

}
