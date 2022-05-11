package javapackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());
//		driver.navigate().to("https://www.google.com/");
//		driver.navigate().back();
//		Thread.sleep(1000);
//		driver.switchTo();
//		Thread.sleep(1000);
//		driver.navigate().refresh();
//		Thread.sleep(1000);
//		driver.close();
//		Thread.sleep(1000);
//		driver.quit();
		
//		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ravikumarsg44@gmail.com");
//		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Ravi@1993");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@name='login']")).click();
		
		driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]")).click();
		Thread.sleep(2000);
//	    driver.findElement(By.xpath("//*[contains(text(),'Male')]")).click();
//	    Thread.sleep(2000);
	    
	    List<WebElement> radios = driver.findElements(By.xpath("//label[contains(@class,'_58mt')]"));
	    int size = radios.size();
	    System.out.println(size);
	    radios.get(1).click();
	    Thread.sleep(2000);
	    radios.get(2).click();
	    Thread.sleep(2000);
	    System.out.println(radios.get(0).isEnabled());
	    
	    List<WebElement> radios1 = driver.findElements(By.xpath("//label[contains(@class,'_58mt')]"));
	    String s = "female";
	    for (int i=0; i<size; i++) {
	    	if (radios1.get(i).getText().equalsIgnoreCase(s)) {
	    		radios1.get(i).click();
	    		break;
	    	}
	    }
	}

}
