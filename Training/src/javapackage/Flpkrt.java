package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Flpkrt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("9611700475");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9880882961");
	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Mobiles");
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    List<WebElement> option = driver.findElements(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[7]/div[2]/div/div"));
//	    WebElement option = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[7]/div[2]/div"));
//	    Select check = new Select(option);
//	    check.selectByIndex(5);
//	    Thread.sleep(1000);
//	    check.selectByIndex(10);
	    option.get(5).click();
	    Thread.sleep(2000);
	    option.get(14).click();
	    
	    
	    
	}	
}
