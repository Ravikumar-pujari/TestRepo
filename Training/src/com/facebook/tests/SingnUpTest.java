package com.facebook.tests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import com.facebook.genericPage.MasterPage;
import com.facebook.pages.SignUpPage;

public class SingnUpTest {
	@Test
	public void SignUpTest() throws Exception {
		SignUpPage sp = new SignUpPage();
//		sp.clickSignUp();
       sp.fetchFromExcel();
	
	}
	@AfterClass
	public void closeSignUpPage() throws Exception {
		Thread.sleep(5000);
		MasterPage.driver.close();
	}

}
