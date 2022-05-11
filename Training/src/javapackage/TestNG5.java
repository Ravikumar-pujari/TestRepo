package javapackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestNG5 {
	WebDriver driver;
	@BeforeClass
	public void setEnv() {
            System.out.println("before class");
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	
	
	public String getDateAndTime() {
		DateTimeFormatter currentDateAndTime = DateTimeFormatter .ofPattern("yyyy/mm/dd  HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		return currentDateAndTime.format(now);	
	}
	
	
	@DataProvider
	public Object[][] dataSet() throws Exception {
		System.out.println("dataprovider");
		File fil = new File("D:\\software\\eclipse\\programs\\Training\\Reposotory\\object.Repo.properties");
		FileInputStream fis =new FileInputStream(fil);
		Properties pro = new Properties();
		pro.load(fis);
		
		Object arr[][] = new Object [3][2]	;  //3 rows ,  2 coloums. u1 p1
		                                                           // u2 p2
		                                                           // u3 p3
		TestNG5 t5 = new TestNG5();
		
		arr[0][0] = pro.getProperty("EmailTestData")+" "+t5.getDateAndTime(); // after email, date & time will be passed
		arr[0][1] = pro.getProperty("PasswordTestData");
		
		arr[1][0] = "Email_2";
		arr[1][1] = "Password_2";
		
		arr[2][0] = "Email3";
		arr[2][1] = "Password_3";
		
		return arr;
	}
	
	
       @Test(dataProvider = "dataSet")
       public void enterData(String userName, String password) throws Exception {
    	   System.out.println("test");
    	   Thread.sleep(3000);
    	   driver.findElement(By.id("email")).clear();
    	   Thread.sleep(3000);
    	   driver.findElement(By.id("pass")).clear();
    	   Thread.sleep(3000);
    	   driver.findElement(By.id("email")).sendKeys(userName);
    	   Thread.sleep(3000);
    	   driver.findElement(By.id("pass")).sendKeys(password);
    	   Thread.sleep(3000);
    	   driver.findElement(By.name("login")).click();
    	   Thread.sleep(3000);
    	   driver.navigate().back();
       }
       
}
