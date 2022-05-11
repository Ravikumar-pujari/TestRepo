package javapackage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Radiobutton {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://www.facebook.com/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@data-testid=\"open-registration-form-button\"]")).click();
        Thread.sleep(2000);
        
        //gender radio button
       List<WebElement> gender = driver.findElements(By.xpath("//label[@class='_58mt']"));
       int s = gender.size();
       System.out.println(s);
       String sex = "male";
       for(int i = 0; i<s ;i++) {
    	   if (gender.get(i).getText().equalsIgnoreCase(sex)) {
    	          gender.get(i).click();
    	          break;    } 
                              }
       Thread.sleep(2000);
       gender.get(0).click();  //female
       Thread.sleep(2000);
       

       // month dropdown
       List<WebElement> month = driver.findElements(By.xpath("//select[@id='month']/option"));
       int size1 = month.size();
       System.out.println(size1);
       month.get(11).click(); //dec by index
       
       Thread.sleep(2000); 
      WebElement birthmonth = driver.findElement(By.xpath("//select[@id='month']"));
      Select bm = new Select(birthmonth);
      bm.selectByVisibleText("Jan");
      Thread.sleep(2000);
      bm.selectByIndex(5); //jun by select index
      Thread.sleep(2000);
      bm.selectByValue("1"); //jan
      Thread.sleep(2000);
      System.out.println(bm.getFirstSelectedOption().getText());
      
      System.out.println(bm.isMultiple());
//      bm.deselectByIndex(1);   //ismultiple should be true
      
      birthmonth.sendKeys("Dec");  //method by send keys
      Thread.sleep(2000);
      
      driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Feb");    // using xpath
      
}
}
