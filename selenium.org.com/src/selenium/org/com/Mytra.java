package selenium.org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mytra {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJESH J\\eclipse-workspace\\FullCourse\\selenium.org.com\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
		WebElement txtPhone = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		txtPhone.sendKeys("9952108899");
		WebElement enter = driver.findElement(By.xpath("//div[@class='submitBottomOption']"));
		enter.click();
		
		
		
	}

}
