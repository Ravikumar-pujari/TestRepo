package javapackage;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4Test {

	public static void main(String[] args) {
		Logger log = Logger.getLogger("Log4J");

		PropertyConfigurator.configure("D:\\software\\eclipse\\programs\\Training\\log4j.properties");

		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		log.info("MAXIMISED WINDOW");
		driver.get("https://www.facebook.com/");
		log.info("URL IS OPENED");
	}

}
