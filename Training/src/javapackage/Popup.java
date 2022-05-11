package javapackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(2000);
		String parentwindow =driver.getWindowHandle();
		System.out.println(parentwindow);
		
		driver.findElement(By.xpath("//button[contains(text(),'Open New Window')]")).click();
		Set<String> allwindows = driver.getWindowHandles();
		System.out.println(allwindows);
		
		for (String handle : allwindows) {
			if (!handle.equalsIgnoreCase(parentwindow)) {
				
		driver.switchTo().window(handle);
		driver.findElement(By.id("firstName")).sendKeys("Ravikumar");  }    }
		
		Thread.sleep(2000);
		driver.switchTo().window(parentwindow);
//		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("Ravi");
		Thread.sleep(2000);
//		driver.findElement(By.id("name")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("name")).sendKeys("Riyaarth");
//		driver.close();
	}

}
