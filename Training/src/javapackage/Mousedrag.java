package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousedrag {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable");
		 
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		int size = frames.size();
		System.out.println(size);
//		
		//1st method
//		for (int i=0; i<size; i++) { 
//			driver.switchTo().frame(i);
//			if (driver.findElement(By.id("draggable")).isDisplayed() && driver.findElement(By.id("droppable")).isDisplayed()))
//			{	Thread.sleep(3000);
//			Actions  act =new Actions(driver);
//			act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();	
//			}
//		}
    
		//2nd method
		driver.switchTo().frame(0);
		Actions act = new Actions(driver);
		act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
		
		//3rd method
		
//		Actions act =new Actions(driver);
//		WebElement drag = driver.findElement(By.id("draggable"));
//		Thread.sleep(3000);
//		act.dragAndDropBy(drag, 30, 30).build().perform();
		
//		act.clickAndHold(drag).dragAndDropBy(drag, 30, 30).build().perform();
		
	}

}
