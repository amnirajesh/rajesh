package selenium.org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBank {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJESH J\\eclipse-workspace\\FullCourse\\selenium.org.com\\Driver\\chromedriver.exe");
		WebDriver swiggy=new ChromeDriver();
		swiggy.get("https://www.swiggy.com/");
		WebElement txtLocation = swiggy.findElement(By.id("location"));
		txtLocation.sendKeys("Dhuraipakkam,chennai");
		WebElement findClick = swiggy.findElement(By.className("_3iFC5"));
		findClick.click();
		
		
	}

}
