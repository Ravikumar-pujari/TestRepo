package javapackage;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice9 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(2000);
		
		String parentWindow =driver.getWindowHandle();
		System.out.println(parentWindow+" "+driver.getTitle());
		driver.findElement(By.id("windowButton")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(2000);
		
		Set<String> allWindows =driver.getWindowHandles();
		System.out.println(allWindows);
		System.out.println(allWindows.size());
		Thread.sleep(2000);
		
		Iterator<String> ite = allWindows.iterator();
		String window1 = ite.next();
		String window2 = ite.next();
		String window3 = ite.next();
		Thread.sleep(2000);
		
		System.out.println(window1+" "+driver.getTitle());
		Thread.sleep(2000);
		
		driver.switchTo().window(window2);
		System.out.println(window2+" "+driver.getCurrentUrl());
		Thread.sleep(2000);
		
		driver.switchTo().window(window3);
		System.out.println(window3+" "+driver.getCurrentUrl());
		Thread.sleep(2000);
		
		driver.switchTo().window(window1);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);		
		driver.quit();

	}

}
