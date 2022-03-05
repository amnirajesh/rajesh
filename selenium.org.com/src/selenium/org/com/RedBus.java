package selenium.org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJESH J\\eclipse-workspace\\FullCourse\\selenium.org.com\\Driver\\chromedriver.exe");
		WebDriver redbus=new ChromeDriver();
		redbus.get("https://www.redbus.in/");
		WebElement txtFrom=redbus.findElement(By.id("src"));
		txtFrom.sendKeys("Chennai");
		WebElement txtTo = redbus.findElement(By.id("dest"));
		txtTo.sendKeys("Kanniyakumari");
		WebElement clickDate = redbus.findElement(By.xpath("//label[@for='onward_cal']"));
		clickDate.click();
		
		
		
		
		
			
	}

}
