package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.its.ITSValidityPeriod.Unit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice3 {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
//		driver.navigate().to("https://www.youtube.com/");
//		Thread.sleep(2000);
//		driver.navigate().refresh();
//		Thread.sleep(2000);
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("abc@gmail.com");
//		driver.findElement(By.xpath("//input[@type='text'][@id='email']")).sendKeys("abc@gmail.com");
//		driver.findElement(By.xpath("//input[contains(@id,'email')]")).sendKeys("abc@gmail.com");
//		driver.findElement(By.xpath("//input[starts-with(@id,'email')]")).sendKeys("abc@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.id("email")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.id("email")).sendKeys("abcdef");
//		driver.findElement(By.xpath("//input[@id='pass']/preceding::input[@id='email']")).sendKeys("abc@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("12345");
//		Thread.sleep(2000);
//		driver.findElement(By.name("pass")).sendKeys("12345");
//		driver.findElement(By.xpath("//input[@id='email']/following::input[@id='pass']")).sendKeys("12345");
//		Thread.sleep(2000);
//		driver.findElement(By.name("login")).click();
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
//		List<WebElement> list = driver.findElements(By.xpath("//span[@data-type='radio']/span/input"));
		List<WebElement> list = driver.findElements(By.xpath("//input[@type='radio']"));
		int size = list.size();
		System.out.println(size);
		Thread.sleep(2000);
		list.get(0).click();
		Thread.sleep(2000);
		list.get(1).click();
		System.out.println(list.get(0).isSelected());
		System.out.println(list.get(1).isSelected());
		System.out.println(list.get(2).isSelected());
		System.out.println(list.get(0).isDisplayed());
		System.out.println(list.get(1).isDisplayed());
		System.out.println(list.get(2).isDisplayed());
		System.out.println(list.get(0).isEnabled());
		System.out.println(list.get(1).isEnabled());
		System.out.println(list.get(2).isEnabled());
		Thread.sleep(2000);
		
//		List<WebElement> lis = driver.findElements(By.xpath("//span[@data-type='radio']/span/label"));
		List<WebElement> lis = driver.findElements(By.xpath("//label[contains(@class,'_58mt')]"));
		int total = lis.size();
		System.out.println(total);
		String s = "Custom";
		for (int i=0; i<total; i++) {
			if (lis.get(i).getText().equalsIgnoreCase(s)) {
				lis.get(i).click();
				System.out.println("clicked");
				break;
			}
		}
		Thread.sleep(2000);
		driver.close();
		
	}

}
