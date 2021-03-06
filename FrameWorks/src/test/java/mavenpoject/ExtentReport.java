package mavenpoject;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

import io.github.bonigarcia.wdm.WebDriverManager;
     
public class ExtentReport {
	public static WebDriver driver;
	
	@BeforeClass
	public static void beforeclass() {
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
	}
	@AfterClass
	public static void afterclass() {
	driver.quit();

	}
	@Before
	public void before() {
		long currentTimeMillis = System.currentTimeMillis();
		System.out.println(currentTimeMillis);
	}
	@After
	public void after() {
	  long time = System.currentTimeMillis();
	  System.out.println(time);
	}
	 @Test
	 public void test() {
		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("123");	
	}
	
               
}
