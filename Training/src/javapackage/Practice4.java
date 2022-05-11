package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("hi");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(2000);
		
		List<WebElement> days = driver.findElements(By.xpath("//select[@id='day']/option"));
		System.out.println(days.size());
		Thread.sleep(2000);
		days.get(30).click();
		Thread.sleep(2000);
		
		for (int i=0; i<days.size(); i++) {
			String s ="25";
			if(days.get(i).getText().equals(s)) {
				days.get(i).click();
				System.out.println("clicked");
				break;
			}
		}
		
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select sel = new Select(month);
		System.out.println(sel.isMultiple());
		sel.selectByIndex(11);
		Thread.sleep(2000);
		sel.selectByVisibleText("Apr");
		Thread.sleep(2000);
		sel.selectByValue("12");
		Thread.sleep(2000);
		
		List<WebElement> select = sel.getOptions();
		System.out.println(select.size());
		select.get(0).click();
		Thread.sleep(2000);
		for (int i=0; i<select.size(); i++) {
			String jun =select.get(i).getText();
			if(jun.equalsIgnoreCase("jun")) {
				select.get(i).click();
				System.out.println("JUNE");
				break;
			}
		}
		
		Thread.sleep(2000);
		WebElement years = driver.findElement(By.xpath("//select[@id='year']"));
		Select year = new Select(years);
		year.selectByIndex(20);
		Thread.sleep(2000);
		
		List<WebElement> varsh = driver.findElements(By.xpath("//select[@id='year']/option"));
		System.out.println(varsh.size());
		Thread.sleep(2000);
		
		for (int i =0; i<varsh.size(); i++) {
			String var = varsh.get(i).getText();
			if (var.equals("1993")) {
				varsh.get(i).click();
				break;
			}
		}
		Thread.sleep(2000);
		driver.close();
	}

}
