package javapackage;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileTest {

	public static void main(String[] args) throws Throwable  {
		File src = new File("D:\\software\\eclipse\\programs\\Training\\Reposotory\\object.Repo.properties");
		
		FileInputStream fis =new FileInputStream(src);
		
		Properties pro = new Properties();
		pro.load(fis);
		
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(pro.getProperty("URL"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("Email"))).sendKeys(pro.getProperty("EmailTestData"));
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("Password"))).sendKeys(pro.getProperty("PasswordTestData"));
		Thread.sleep(3000);
		driver.close();
	}

}
