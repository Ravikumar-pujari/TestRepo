	package javapackage;

	import java.util.regex.Pattern;
	import java.util.concurrent.TimeUnit;
	import org.testng.annotations.*;
	import static org.testng.Assert.*;
	import org.openqa.selenium.*;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	import java.io.File;
	import org.apache.commons.io.FileUtils;

	public class UntitledTestCase {
	  private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();
	  private JavascriptExecutor js;

	  @BeforeClass(alwaysRun = true)
	  public void setUp() throws Exception {
	    System.setProperty("webdriver.chrome.driver", "");
	    driver = new ChromeDriver();
	    baseUrl = "https://www.google.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    js = (JavascriptExecutor) driver;
	  }

	  @Test
	  public void testUntitledTestCase() throws Exception {
	    driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
	    driver.get("https://www.flipkart.com/");
	    driver.findElement(By.xpath("//div[@id='container']/div/div[3]/div[3]/div[2]/div/div/div/div/div[3]/div")).click();
	    driver.findElement(By.xpath("//div[@id='container']/div/div[3]/div[3]/div[2]/div/div/div/div/div/div/div[6]/div/a/div/img")).click();
	    driver.findElement(By.xpath("//div[@id='container']/div/div[3]/div/div[2]/div[14]/div/div/div/a/div[2]/div/div")).click();
	    //ERROR: Caught exception [ERROR: Unsupported command [selectWindow | win_ser_1 | ]]
	    driver.findElement(By.xpath("//button[@type='button']")).click();
	    driver.findElement(By.xpath("//button[@type='button']")).click();
	    driver.get("https://www.facebook.com/");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys("ravikumarsg1993@gmail.com");
	    driver.findElement(By.id("passContainer")).click();
	    driver.findElement(By.id("pass")).click();
	    driver.findElement(By.id("pass")).clear();
	    driver.findElement(By.id("pass")).sendKeys("12345");
	    driver.findElement(By.id("u_0_d_zB")).click();
	    driver.findElement(By.linkText("Forgotten password?")).click();
	    driver.findElement(By.linkText("Cancel")).click();
	  }

	  @AfterClass(alwaysRun = true)
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }
	}


