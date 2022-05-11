package javapackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class URL {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    Thread thread = new Thread();
		thread.wait();
		driver.manage().window().maximize();
		Thread.sleep(2000);
	    driver.get("https://www.facebook.com/");
	    System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().forward();
		String currentURL = driver.getCurrentUrl();
		System.out.println(currentURL);
		String title = driver.getTitle();
		System.out.println("title is "+title);
	}

}
