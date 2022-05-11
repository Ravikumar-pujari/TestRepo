package javapackage;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4j_Test1 {

	public static void main(String[] args) {
		Logger log =Logger.getLogger("Log4j");
		PropertyConfigurator.configure("D:\\software\\eclipse\\programs\\Training\\LOG4J\\log4j.properties");
		
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		log.info("opened");
		

	}

}
