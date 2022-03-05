package selenium.org.com;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SwiggySignUp {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJESH J\\eclipse-workspace\\FullCourse\\selenium.org.com\\Driver\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.swiggy.com/");
		WebElement clickSignUp = Driver.findElement(By.xpath("//a[@class='r2iyh']"));
		clickSignUp.click();		
		Thread.sleep(5000);
		TakesScreenshot screenshot=(TakesScreenshot ) Driver;
		File screenshotAs = screenshot.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Rajesh Shot\\Raj1.png");
	//	Fileutils.copyFile(screenshotAs,dest);  
		FileHandler.copy(screenshotAs, dest);
		WebElement txtMobile = Driver.findElement(By.id("mobile"));
		txtMobile.sendKeys("9080672764");
		WebElement txtName = Driver.findElement(By.id("name"));
		txtName.sendKeys("Rajesh Jayabal");
		WebElement txtEmail = Driver.findElement(By.id("email"));
		txtEmail.sendKeys("amanirajesh@gmail.com");
		WebElement txtPassWord = Driver.findElement(By.id("password"));
		txtPassWord.sendKeys("1234[]=-0849");
		WebElement enterContinue = Driver.findElement(By.xpath("//a[@class='a-ayg']"));
		enterContinue.click();
		Thread.sleep(6000);
		WebElement clickOTP = Driver.findElement(By.xpath("//a[@class='a-ayg']"));
		clickOTP.click();
		
		TakesScreenshot screenshot2=(TakesScreenshot ) Driver;
		File screenshotAs2 = screenshot2.getScreenshotAs(OutputType.FILE);
		File desti=new File("C:\\Rajesh Shot\\Raj.png");
		FileHandler.copy(screenshotAs2, desti);
		
		
		
		
		
		
		
		
	}

}
