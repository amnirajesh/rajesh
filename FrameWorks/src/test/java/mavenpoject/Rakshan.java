package mavenpoject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Rakshan {
	public  static  void main(String[] args) {
WebDriverManager.chromedriver().setup();
//WebDriverManager.firefoxdriver().setup();
//WebDriverManager.iedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.swiggy.com");

	}
}



