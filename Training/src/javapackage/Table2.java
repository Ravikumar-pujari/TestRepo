package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",  "D:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://money.rediff.com/gainers");
		
		List<WebElement> company = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		int size = company.size();
		System.out.println(size);
		
		List<WebElement> price = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		int size1= price.size();
		System.out.println(size1);
		
		for(int i=0; i<size ; i++) {
			String s = "Oracle Credit";
			if (company.get(i).getText().equalsIgnoreCase(s)) {	
			System.out.println(company.get(i).getText()+ "   "+price.get(i).getText());	
			company.get(i).click();	
			}
		}
		
	}

}
