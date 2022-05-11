package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://paytm.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Sign In']")).click();
		Thread.sleep(3000);
		
		//method1
//		List<WebElement> frame = driver.findElements(By.xpath("//iframe"));
//		int size = frame.size();
//		System.out.println(size);
//		
//		for (int i=0; i<size; i++ )  {
//			driver.switchTo().frame(i);
//			driver.findElement(By.xpath("//span[contains(text(),' Watch Video')]")).click();
//		}
		
		//method2
//		int frame = driver.findElements(By.xpath("//iframe")).size();
//		System.out.println(frame);
//		
//		for (int i=0; i<frame; i++ )  {
//			driver.switchTo().frame(i);
//			driver.findElement(By.xpath("//span[contains(text(),' Watch Video')]")).click();
//		}
		
//		method3
//		driver.switchTo().frame(0);
//		driver.findElement(By.xpath("//span[contains(text(),' Watch Video')]")).click();
		
	}
}
