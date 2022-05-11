package javapackage;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertion1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://login.yahoo.com/");
		Thread.sleep(3000);
		driver.findElement(By.id("login-signin")).click();
		Thread.sleep(3000);
		String expected = "Sorry, we don't recognize this email.";
		String actual = driver.findElement(By.xpath("//p[@role='alert']")).getText();
       
//		String s = actual.getText();
//		System.out.println(s);
		
		Assert.assertEquals(actual,expected);
		System.out.println("pass");
		Assert.assertFalse(driver.findElement(By.xpath("//p[@role='alert']")).isSelected());
		System.out.println("PASS");
	    Assert.assertTrue(driver.findElement(By.xpath("//p[@role='alert']")).isDisplayed()); 
		System.out.println("pass");
		driver.close();
	
}
}
