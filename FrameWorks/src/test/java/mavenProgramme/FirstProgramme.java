package mavenProgramme;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgramme {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJESH J\\eclipse-workspace\\FullCourse\\selenium.org.com\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.close();
		
		
	}

}
