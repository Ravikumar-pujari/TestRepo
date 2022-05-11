package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement fashion = driver.findElement(By.xpath("//div[text()='Fashion']"));
		Actions act = new Actions(driver);
		act.moveToElement(fashion).build().perform();
		Thread.sleep(3000);
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='_2IjXr8']/div/a"));
		int size = list.size();
		System.out.println(size);
		
		for(int i=0; i<size; i++) {
			String s = "Men's bottom wear";
			if (list.get(i).getText().equalsIgnoreCase(s)) {
				list.get(i).click();
				break;
			}
		}
		Thread.sleep(3000);
		WebElement grocery = driver.findElement(By.xpath("//a[contains(text(),'Grocery')]"));
		act.contextClick(grocery).build().perform();
	}
}
