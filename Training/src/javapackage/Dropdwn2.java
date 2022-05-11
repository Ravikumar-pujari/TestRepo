package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdwn2 {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			
			driver.findElement(By.xpath("//input[@name='q']")).sendKeys("how the stuff works");
			
//			List<WebElement> all = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
//			System.out.println(all.size());
//			all.get(1).click();
			
//			for (int i = 0; i<all.size(); i++) {
//				String s = "how the stuff works engine";
//				if (all.get(i).getText().equalsIgnoreCase(s)) {
//					System.out.println(all.get(i).getText());
//					all.get(i).click();		
//				}
//			}
            
			
	}

}
