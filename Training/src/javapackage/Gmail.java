package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com/");                      					 		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("ravikumarsg44@gmail.com");

	    driver.findElement(By.xpath("//button[@aria-expanded='false']")).click();
		List<WebElement> menu = driver.findElements(By.xpath("//*[@role='menu']/li"));
		int size = menu.size();
		System.out.println(size);
		String s = "For myself";
		
		for (int i=0; i<size; i++) {
			if(menu.get(i).getText().equalsIgnoreCase(s)) {
				menu.get(i).click();
				System.out.println(i);
				break;
			}
		}
		
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	}
}
