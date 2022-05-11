package javapackage;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TakeScreenshotOnFailure1 {
	
	WebDriver driver;
	
	public void captureScreenshot(ITestResult result) throws Exception { 
		if(ITestResult.FAILURE == result.getStatus()) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			
		File source = ts.getScreenshotAs(OutputType.FILE);
			
		FileUtils.copyFile(source, new File("./Screenshots/"  +result.getName()+".png"));
		System.out.println(result.getName());;
	}
	}
}
