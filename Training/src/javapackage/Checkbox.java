package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement acc = driver.findElement(By.xpath("//a[contains(text(),'Create N')]"));
		acc.click();
//		
//		WebElement gender = driver.findElement(By.xpath("//label[contains(text(),'Male')]"));
//		gender.click();
//         
//        Thread.sleep(2000);
//         
//        driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
        
     List<WebElement> genders = driver.findElements(By.xpath("//label[@class='_58mt']"));
         int siz = genders.size();
         
//         System.out.println(siz);
//         System.out.println(genders.get(1).getText());
//         genders.get(0).click();
         
//         for (int i=0; i<siz; i++) {
//        	 String s = "Custom";
//        	 if (genders.get(i).getText().equalsIgnoreCase(s)) {
//        		 genders.get(i).click();
//        		 break;
//        	 }
//         }
         
            for (WebElement w : genders) {
            	 String s = "Female";
            	 if (w.getText().equalsIgnoreCase(s)) {
            		 w.click();
            		 break;    }
            	
            }
	}

}
