package selenium.org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJESH J\\eclipse-workspace\\FullCourse\\selenium.org.com\\Driver\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.amazon.in/");
		WebElement txtItem = Driver.findElement(By.id("twotabsearchtextbox"));
		txtItem.sendKeys("Iphone");
		WebElement enterSearchItem = Driver.findElement(By.id("nav-search-submit-button"));
		enterSearchItem.click();
		
	}

}
