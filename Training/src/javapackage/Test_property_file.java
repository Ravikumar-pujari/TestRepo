package javapackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_property_file {

	public static void main(String[] args) throws Exception {
		File file = new File("D:\\software\\eclipse\\programs\\Training\\Reposotory\\object.Repo.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties pro = new Properties();
		pro.load(fis);
		
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("hi");
	   driver.get(pro.getProperty("URL"));
	    Thread.sleep(2000);
	    driver.close();

	}
}
