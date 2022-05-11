package javapackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
//import org.openqa.selenium.By.ById;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement login = driver.findElement(By.id("email"));
		login.sendKeys("ravi@gmail.com");
		
		Thread.sleep(2000);
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("12345");
		
		Thread.sleep(2000);
		WebElement log = driver.findElement(By.tagName("button"));
		log.click();
		
		Thread.sleep(2000);
		WebElement forgot = driver.findElement(By.className("_97w4"));
		forgot.click();

		Thread.sleep(2000);
		WebElement acc = driver.findElement(By.linkText("Forgotten account?"));
		acc.click();
		
		Thread.sleep(2000);
		WebElement message= driver.findElement(By.xpath("//div[contains(text(),'to')]"));
		System.out.println(message.getText());
		
	}

}
