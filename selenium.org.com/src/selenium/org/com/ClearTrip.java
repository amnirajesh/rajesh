package selenium.org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearTrip {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJESH J\\eclipse-workspace\\FullCourse\\selenium.org.com\\Driver\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("https://www.cleartrip.com/trains");
		WebElement txtFrom = Driver.findElement(By.xpath("(//input[@type='text'])[1]"));
		txtFrom .sendKeys("Dhelhi");
	    WebElement txtTo = Driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	    txtTo.sendKeys("kayakumari");
	    WebElement clkSearch= Driver.findElement(By.id("trainFormButton"));
	    clkSearch.click();
}
}