package selenium.org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IciciBankAccess {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\RAJESH J\\\\eclipse-workspace\\\\FullCourse\\\\selenium.org.com\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
		
		
		driver.navigate().back();
		driver.navigate().to("https://infinity.icicibank.com/corp/Login.jsp");
		//driver.navigate().back();
		WebElement txtLogin = driver.findElement(By.id("DUMMY1"));
		txtLogin.click();
		Thread.sleep(3000);
		WebElement txtLoging = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
		Thread.sleep(3000);
		txtLoging.sendKeys("amnirajesh");
		WebElement txtPassWord = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
		txtPassWord.sendKeys("eteuirj");
		WebElement checkBox = driver.findElement(By.id("AuthenticationFG.REMEMBER_USERID_CHECKBOX"));
		checkBox.click();
		WebElement clickAccess = driver.findElement(By.id("VALIDATE_CREDENTIALS1"));
		clickAccess.click();
		
		
		
	}

}
