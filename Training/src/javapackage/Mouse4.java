package javapackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Mouse4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		String s ="https://www.flipkart.com/beauty-and-grooming/body-face-skin-care/pr?sid=g9b%2Cema&p%5B%5D=facets.fulfilled_by%255B%255D%3DFlipkart%2BAssured&otracker=clp_creative_card_1_4.creativeCard.CREATIVE_CARD_bgm-big-saving-days-sale2021-store_HCQDGR5BR1J0&fm=neo%2Fmerchandising&iid=M_ea204519-f573-4ff3-affa-1356c57f3f60_4.HCQDGR5BR1J0&ppt=clp&ppn=bgm-big-saving-days-sale2021-store&ssid=tda5pkfblc0000001647169348117";
	    driver.get(s);
	    Thread.sleep(2000);
		
       List<WebElement> check =  driver.findElements(By.xpath("//div[@class='_24_Dny']"));
		check.get(6).click();
		Thread.sleep(2000);
		check.get(5).click();
	}

}
