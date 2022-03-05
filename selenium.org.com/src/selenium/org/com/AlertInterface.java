package selenium.org.com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertInterface {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\RAJESH J\\\\eclipse-workspace\\\\FullCourse\\\\selenium.org.com\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		WebElement alertClick = driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
		alertClick.click();
		WebElement alertClick2 = driver.findElement(By.xpath("//button[text()='click the button to demonstrate the prompt box ']"));
		alertClick2.click();
		Alert al = driver.switchTo().alert();
		al.sendKeys("RajeshJayapal");
		al.accept();
		WebElement text = driver.findElement(By.id("demo1"));
		String string = text.getText();
		System.out.println(string);
		
		
		
	}

}
