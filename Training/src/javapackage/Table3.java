package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    driver.get("https://money.rediff.com/gainers");
	    
	    List<WebElement> coloumn1 = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
          System.out.println(coloumn1.size());
          System.out.println(coloumn1.get(1).getText());
          
          List<WebElement> coloumn4 = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
          System.out.println(coloumn4.size());
          System.out.println(coloumn4.get(1).getText());
          
          for (int i =0; i<coloumn1.size(); i++) {
        	  String s = "samor reality";
        	  if(coloumn1.get(i).getText().equalsIgnoreCase(s)) {
        		  System.out.println(coloumn1.get(i).getText()+"===="+coloumn4.get(i).getText());
        		  coloumn1.get(i).click();
        	  }
          }
          
//	    int count=0;
//	    for(WebElement w:coloumn1)
//	    {
//	    	count++;
//	    }
//	    System.out.println("Total number of links are: " + count);
	}

}
