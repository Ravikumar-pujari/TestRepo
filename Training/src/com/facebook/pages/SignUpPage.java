package com.facebook.pages;

import com.facebook.genericPage.MasterPage;

public class SignUpPage extends MasterPage {

	public SignUpPage() throws Exception {
		super();	
	}
	
	 public void clickSignUp() {
		 click("SignUpKey");
	 }
	 
	public void fetchFromExcel() throws Exception {
		sendExcelData("LoginKey", "Sheet1", 0, 1);
	}

	
		
	}


