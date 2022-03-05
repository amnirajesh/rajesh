package selenium.org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AdactinhotelApp {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJESH J\\eclipse-workspace\\FullCourse\\selenium.org.com\\Driver\\chromedriver.exe");
	WebDriver Driver=new ChromeDriver();
	Driver.get("http://adactinhotelapp.com/");
	WebElement txtUserName = Driver.findElement(By.id("username"));
	txtUserName.sendKeys("rajeshKanna");
	WebElement txtPassWord = Driver.findElement(By.id("password"));
	txtPassWord.sendKeys("amnirajesh2526325");
	
}
}
