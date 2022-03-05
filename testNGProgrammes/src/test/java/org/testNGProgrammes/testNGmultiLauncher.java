package org.testNGProgrammes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testNGmultiLauncher {
	@Test 
	private void openChrome() {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\RAJESH J\\\\eclipse-workspace\\\\FullCourse\\\\selenium.org.com\\\\Driver\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	}
	
	private void openFlipKart() {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\RAJESH J\\\\eclipse-workspace\\\\FullCourse\\\\selenium.org.com\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		}
	
	
}

