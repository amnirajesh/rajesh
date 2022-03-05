package selenium.org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreentechSeleniumContent {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJESH J\\eclipse-workspace\\FullCourse\\selenium.org.com\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://greenstech.in/selenium-course-content.html");
		Thread.sleep(5000);
		WebElement clickInterviewQust = driver.findElement(By.id("heading20"));
		clickInterviewQust.click();
	    Thread.sleep(2000);
		WebElement clickCTS = driver.findElement(By.xpath("//a[text()='CTS Interview Question ']"));
		clickCTS.click();
		
		
	}

}
