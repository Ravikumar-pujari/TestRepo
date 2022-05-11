package javapackage;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiwindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		Thread.sleep(2000);
		
		String parent =driver.getWindowHandle();
		System.out.println(parent);
		
		driver.findElement(By.id("newWindowsBtn")).click();
		
		Set<String> all =driver.getWindowHandles();
		System.out.println(all);
		
		Iterator<String> child=all.iterator();
		String window1=child.next();
		String window2=child.next();
		String window3=child.next();
		driver.switchTo().window(window3);//child1
		System.out.println(window3);
		System.out.println(driver.getTitle());
		driver.switchTo().window(window2);//child2
		System.out.println(window2);
		System.out.println(driver.getTitle());
		driver.switchTo().window(window1);//parent
		System.out.println(window1);
		System.out.println(driver.getTitle());
		
			
		

	}

}
