package selenium.org.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverAction {
	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJESH J\\eclipse-workspace\\FullCourse\\selenium.org.com\\Driver\\chromedriver.exe")	;
WebDriver driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/drag_drop.html");
driver.manage().window().maximize();
Thread.sleep(3000);
WebElement dragBank = driver.findElement(By.id("credit2"));
WebElement dropDebitAcct = driver.findElement(By.id("bank"));
Actions actions=new Actions(driver);
actions.dragAndDrop(dragBank, dropDebitAcct).perform();

WebElement dragAmnt = driver.findElement(By.id("fourth"));
WebElement dropDebitAmt = driver.findElement(By.id("amt7"));
Thread.sleep(3000);
actions.dragAndDrop(dragAmnt, dropDebitAmt).perform();

WebElement dragSales = driver.findElement(By.id("credit1"));
WebElement dropCreditAcct = driver.findElement(By.id("loan"));
actions.dragAndDrop(dragSales, dropCreditAcct).perform();

WebElement dropCreditAmt = driver.findElement(By.id("amt8"));
Thread.sleep(3000);
actions.dragAndDrop(dragAmnt, dropCreditAmt).perform();

WebElement perfect = driver.findElement(By.xpath("//*[@id=\"equal\"]/a"));
String name = perfect.getText();
System.out.println(name);





	}


}
