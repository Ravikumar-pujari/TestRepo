package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Mouse3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
		
		WebElement electronics = driver.findElement(By.xpath("//span[text()='Electronics']"));
		
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(electronics).build().perform();
		
		List<WebElement> all = driver.findElements(By.xpath("//div[@class='_1QrT3s']/div/a"));
		System.out.println(all.size());
		
		for (WebElement b : all) {
			String s = "iPhone SE";
			if (b.getText().equalsIgnoreCase(s)) {
				b.click();
				break;
			}
		}
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='_2d0we9']/div"));
		System.out.println(list.size());
		list.get(2).click();
		Thread.sleep(2000);
		list.get(3).click();
		Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");
		
		Thread.sleep(2000);
		WebElement mob = driver.findElement(By.xpath("//div[text()='APPLE iPhone SE (Black, 64 GB)']"));
		
		act.contextClick(mob).build().perform();
	}

}
