package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("How stuff works");
		
        List<WebElement> suggest = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
        int size = suggest.size();
        System.out.println(size);
        
        for ( int i=0; i<size; i++) {
        	String s = "How stuff works youtube";
        	if (suggest.get(i).getText().equalsIgnoreCase(s)) {
        		suggest.get(i).click();
        		System.out.println(i);
        		break;
        	}
        }
	}

}
