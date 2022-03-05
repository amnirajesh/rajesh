package mavenpoject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PomClass {
	public static WebDriver driver;
	public void getDriver(String browserName) {
		switch(browserName) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case "ff":
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		break;
		case "ie":
			WebDriverManager.iedriver().setup();
			driver =new InternetExplorerDriver();
			break;
			default:
				System.out.println("Invalid Browser");
				break;
		}
		driver.manage().window().maximize();}
	
		public void LaunchUrl(String Url) {
			driver.get(Url);}
		000
			
			
			
		
		
		
			
			
		}
	}
	
	

}
