package selenium.org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumProject4 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJESH J\\eclipse-workspace\\FullCourse\\selenium.org.com\\Driver\\chromedriver.exe");
		WebDriver aa=new ChromeDriver();
		aa.get("https://www.google.com/");
		WebElement txtUserName=aa.findElement(By.className("gLFyf gsfi"));
		txtUserName.sendKeys("Green tech");
		
		
				
		
	}

}