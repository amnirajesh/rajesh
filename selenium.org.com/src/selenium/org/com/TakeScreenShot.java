package selenium.org.com;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeScreenShot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJESH J\\eclipse-workspace\\FullCourse\\selenium.org.com\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com//");
		driver.manage().window().maximize();
		TakesScreenshot shot =(TakesScreenshot) driver;
		File ScreenShoot = shot.getScreenshotAs(OutputType. FILE);
		File destination=new File("C:\\Rajesh Shot\\rajju.png");
		FileHandler.copy(ScreenShoot, destination);
	}
	

}
