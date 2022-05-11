package javapackage;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetTitle;
import org.openqa.selenium.support.ui.Select;

public class A {
	
	public static void main(String[] args) throws Exception {
		Logger log = Logger.getLogger("Log4J");
		PropertyConfigurator.configure("D:\\software\\eclipse\\programs\\Training\\LOG4J\\log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		log.info("url opened");
		driver.findElement(By.id("tabButton")).click();
		
		Set<String> allwindows = driver.getWindowHandles();
		Iterator<String> abc = allwindows.iterator();
		String window1 =abc.next();
		String window2 =abc.next();
		
		driver.switchTo().window(window2);
		System.out.println(window2+"  "+driver.getCurrentUrl());
		Thread.sleep(2000);
		driver.quit();
		
//		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
//		WebElement bm = driver.findElement(By.id("month"));
//		Select sel = new Select(bm);
//		System.out.println(sel.isMultiple());
		
//		sel.selectByIndex(0);
//		
//		List<WebElement> month = sel.getOptions();
//		System.out.println(month.size());
		
//		JavascriptExecutor jse =(JavascriptExecutor) driver;
//		jse.executeScript("window.scrollBy(0,800)");
		
	}
}
