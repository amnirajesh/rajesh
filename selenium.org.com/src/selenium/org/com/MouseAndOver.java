package selenium.org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAndOver {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJESH J\\eclipse-workspace\\FullCourse\\selenium.org.com\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sprint.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		WebElement close = driver.findElement(By.id("tntButtonToClose"));
		close.click();
		WebElement close1 = driver.findElement(By.xpath("//button[@type='reset']"));
		close1.click();
		WebElement curserMove = driver.findElement(By.id("digital-header-nav-link-head-1"));
		Actions actions=new Actions(driver);
		actions.moveToElement(curserMove).perform();
		WebElement g = driver.findElement(By.xpath("//span[contains(text(),'5G p')]"));
		g.click();
		Thread.sleep(10000);
		WebElement personel = driver.findElement(By.xpath("(//a[contains(text(),'Information')])[2]"));
		 String name = personel.getText();
		System.out.println(name);
		}
	}
