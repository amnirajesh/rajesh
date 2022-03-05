package selenium.org.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogin {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJESH J\\eclipse-workspace\\FullCourse\\selenium.org.com\\Driver\\chromedriver.exe");
    WebDriver Driver=new ChromeDriver();
    Driver.get("//www.instagram.com/");
////Driver.findElement(By.)
	
}
}
