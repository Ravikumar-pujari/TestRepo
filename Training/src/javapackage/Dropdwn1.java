package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdwn1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement acc = driver.findElement(By.xpath("//a[contains(text(),'Create N')]"));
		acc.click();
		Thread.sleep(2000);
		
		List<WebElement> days = driver.findElements(By.xpath("//select[@id='day']/option"));
		System.out.println(days.size());
	    
//		
//		Thread.sleep(2000);	
//			
//		for(int i =0; i<days.size(); i++) {
//			String s = "10";
//			if (days.get(i).getText().equals(s)) {
//				days.get(i).click();
//				break;
//			}	
//		}
//		Thread.sleep(2000);
//		days.get(30).click();
//		
//		Thread.sleep(2000);
//		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
//		
//		Select sel = new Select(day);
//		
//		sel.selectByValue("20");
//		Thread.sleep(2000);
//		sel.selectByVisibleText("25");
//		Thread.sleep(2000);
//		sel.selectByIndex(10);
//		Thread.sleep(2000);
//		 
//		System.out.println(sel.isMultiple());
//		
//		day.sendKeys("19");
		}
	
	}


