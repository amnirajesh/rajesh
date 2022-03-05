package selenium.org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJESH J\\eclipse-workspace\\FullCourse\\selenium.org.com\\Driver\\chromedriver.exe");
		WebDriver google=new ChromeDriver();
		google.get("https://www.google.com/");
		WebElement txtSearch = google.findElement(By.name("q"));
		txtSearch.sendKeys("Green technology");	
		Thread.sleep(4000);
		WebElement searchClick = google.findElement(By.name("btnK"));
		searchClick.click();
	}

}
