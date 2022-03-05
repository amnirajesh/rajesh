package selenium.org.com;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumProject3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJESH J\\eclipse-workspace\\FullCourse\\selenium.org.com\\Driver\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
	    Driver.get("https://www.flipkart.com/");
	    WebElement txtUserName = Driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
	    txtUserName.sendKeys("9080672764");
	    WebElement txtPass = Driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]"));
		txtPass.sendKeys("9080653525");
		Thread.sleep(5000);
		WebElement clickLogin = Driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
		clickLogin.click();
		Thread.sleep(5000);
		WebElement getOTP = Driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3NgS1a']"));
		getOTP.click();
	}

}
