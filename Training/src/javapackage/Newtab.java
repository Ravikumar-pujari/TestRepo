package javapackage;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newtab {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(2000);
		
		String parent =driver.getWindowHandle();
		System.out.println(parent);
		
		driver.findElement(By.id("newTabBtn")).click();
		
		Set<String> alltab =driver.getWindowHandles();
		System.out.println(alltab);
		
		for (String str : alltab) {
			if (!str.equalsIgnoreCase(parent)) {
			  System.out.println(str);
			  driver.switchTo().window(str);
			  
			  driver.findElement(By.id("alertBox")).click();
			    
			}
		}
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}

}
