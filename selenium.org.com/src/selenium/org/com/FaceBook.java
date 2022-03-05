package selenium.org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJESH J\\eclipse-workspace\\FullCourse\\selenium.org.com\\Driver\\chromedriver.exe");
	WebDriver face=new ChromeDriver();
	face.get("https://www.facebook.com/");
	WebElement txtUserName=face.findElement(By.id("email"));
	txtUserName.sendKeys("9080672764");
	WebElement txtPassword = face.findElement(By.id("pass"));
	txtPassword.sendKeys("asdfghjkl1234567890");
	WebElement btnLogin=face.findElement(By.name("login"));
	btnLogin.click();
	
}
}
