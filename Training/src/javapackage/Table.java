package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://money.rediff.com/gainers");
//	    driver.get("//money.rediff.com/companies/sps-finquest/14094047");  // link
	    
	    
	    List<WebElement> companies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
	    int totalcompany = companies.size();
        System.out.println(totalcompany);
        
        List<WebElement> price = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
        int pricerows = price.size();
        System.out.println(pricerows);
        
        String name = "SPS Finquest";
        
        for (int i=0; i<totalcompany ; i++) {
        	if (companies.get(i).getText().equalsIgnoreCase(name)) {
        		
        		System.out.println(companies.get(i).getText() +" current price is "+ price.get(i).getText());
        		companies.get(i).click();
        		break;
        	}
        }
	}

}
