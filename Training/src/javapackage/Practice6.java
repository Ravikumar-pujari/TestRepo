package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
        Thread.sleep(2000); 
        driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        Thread.sleep(2000);
       
        WebElement fashion = driver.findElement(By.xpath("//div[contains(text(),'Fashion')]"));
        Actions act = new Actions(driver); 
        act.moveToElement(fashion).build().perform();
        Thread.sleep(2000);
        
        act.contextClick(fashion).build().perform();
        Thread.sleep(2000);
        act.release(fashion).build().perform();
        Thread.sleep(2000);
       driver.findElement(By.xpath("//a[contains(text(),\"Men's Bottom Wear\")]")).click();
       Thread.sleep(2000);
       
       JavascriptExecutor JSE = (JavascriptExecutor) driver;
       JSE.executeScript("window.scrollBy(0,10000)");
       Thread.sleep(2000);
        driver.close();
	}
	
}
