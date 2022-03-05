package selenium.org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookClick {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJESH J\\eclipse-workspace\\FullCourse\\selenium.org.com\\Driver\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.facebook.com/");
		WebElement txtUser = Driver.findElement(By.id("email"));
		txtUser.sendKeys("amnirajesh@gmail.com");
		WebElement txtPassword = Driver.findElement(By.id("pass"));
		txtPassword.sendKeys("asdfghjkl1234567890");
	      WebElement logIn = Driver.findElement(By.xpath("//button[@value='1']"));
	      logIn.click();
	      
	      
		
		
		
	}

}
