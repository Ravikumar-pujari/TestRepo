package javapackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakeScreenshotOnFailure2 {
	
	TakeScreenshotOnFailure1 t1 = new TakeScreenshotOnFailure1();
	
	@Test(priority =1)
	
	public void doLogin() {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver\\chromedriver.exe");
		t1.driver = new ChromeDriver();
		t1.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		t1.driver.manage().window().maximize();
		t1.driver.get("https://www.facebook.com/");
		t1.driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		t1.driver.findElement(By.id("pass")).sendKeys("12345");
		t1.driver.findElement(By.id("login_button_Wrong_Id")).click();
		
	}
	 @AfterMethod
	 public void takeScreenshotOnFailure(ITestResult photo) throws Exception {
		t1.captureScreenshot(photo);
	 }	

	}


