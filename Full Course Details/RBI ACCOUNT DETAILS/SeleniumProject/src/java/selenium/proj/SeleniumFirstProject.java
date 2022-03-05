package java.selenium.proj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirstProject {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJESH J\\eclipse-workspace\\FullCourse\\Full Course Details\\RBI ACCOUNT DETAILS\\SeleniumProject\\Driver\\chromedriver.exe");
	
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.get("https://www.facebook.com/");
	
}
	
	
}
