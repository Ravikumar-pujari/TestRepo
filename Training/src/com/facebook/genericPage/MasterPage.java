package com.facebook.genericPage;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MasterPage {
	
	public static WebDriver driver;
	public Properties prop;
	public Properties or;

	public MasterPage() throws Exception {
		
		FileInputStream ip = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\com\\facebook\\repository\\configuration.properties");
		prop = new Properties();
		prop.load(ip);

		FileInputStream fs = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\com\\facebook\\repository\\locators.properties");
		or = new Properties();
		or.load(fs);

		if (prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "com.facebook.drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ("user.dir" + "com.facebook.drivers\\chromedriver.exe"));
			driver = new FirefoxDriver();
		} else {
			System.out.println("IE Browser");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");

	}

	public void click(String xpathkey) {
		driver.findElement(By.xpath(or.getProperty(xpathkey))).click();
	}

	public void sendData(String xpathkey, String s) {

		driver.findElement(By.xpath(or.getProperty(xpathkey))).sendKeys(s);

	}

	public void sendExcelData(String xpathkey, String sheet,  int row, int cell) throws Exception {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir") + "\\src\\com\\facebook\\resources\\Book1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
		 String value = c.getStringCellValue();

		driver.findElement(By.xpath(or.getProperty(xpathkey))).sendKeys(value);
	}
}
