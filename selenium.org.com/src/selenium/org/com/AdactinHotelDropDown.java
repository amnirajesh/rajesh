package selenium.org.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdactinHotelDropDown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\RAJESH J\\\\eclipse-workspace\\\\FullCourse\\\\selenium.org.com\\\\Driver\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com//");
	driver.manage().window().maximize();
	WebElement userName = driver.findElement(By.id("username"));
	userName.sendKeys("naveen53");
	WebElement passWord = driver.findElement(By.id("password"));
	passWord.sendKeys("C1IZAU");
	WebElement logIn = driver.findElement(By.id("login"));
	logIn.click();
	WebElement location = driver.findElement(By.id("location"));
	Select select=new Select(location);
	select.selectByIndex(3);
	WebElement hotels = driver.findElement(By.id("hotels"));
	Select select2=new Select(hotels);
	select2.selectByIndex(2);
	WebElement roomType = driver.findElement(By.id("room_type"));
	Select select3=new Select(roomType);
	select3.selectByIndex(3);
	WebElement noOfRooms = driver.findElement(By.id("room_nos"));
	Select select4=new Select(noOfRooms);
	select4.selectByIndex(4);
	WebElement inDate = driver.findElement(By.id("datepick_in"));
	inDate.sendKeys("08/03/2022");
	WebElement outDate = driver.findElement(By.id("datepick_out"));
	outDate.sendKeys("12/03/2022");
	WebElement adultRoom = driver.findElement(By.id("adult_room"));
    Select select5=new Select(adultRoom);
	select5.selectByIndex(2);	
	WebElement childRoom = driver.findElement(By.id("adult_room"));
    Select select6=new Select(childRoom);
	select6.selectByIndex(3);	
	WebElement search = driver.findElement(By.id("Submit"));
	search.click();
	WebElement radioBtn = driver.findElement(By.id("radiobutton_0"));
	radioBtn.click();
	WebElement cont = driver.findElement(By.id("continue"));
	cont.click();
	WebElement firstName = driver.findElement(By.id("first_name"));
	firstName.sendKeys("Rajesh");
	WebElement lastName = driver.findElement(By.id("last_name"));
	lastName.sendKeys("Jayabal");
	WebElement add = driver.findElement(By.id("address"));
	add.sendKeys("SN Chavadi ,cuddalore-607002");
	WebElement cc = driver.findElement(By.id("cc_num"));
	cc.sendKeys("9658765482236549");
	WebElement ccType = driver.findElement(By.id("cc_type"));
    Select select7=new Select(ccType);
	select7.selectByIndex(2);
	WebElement ccExMonth = driver.findElement(By.id("cc_exp_month"));
    Select select8=new Select(ccExMonth);
	select8.selectByIndex(5);
	WebElement ccExYr = driver.findElement(By.id("cc_exp_year"));
    Select select9=new Select(ccExYr);
	select9.selectByIndex(10);
	WebElement cvv = driver.findElement(By.id("cc_cvv"));
	cvv.sendKeys("9658");
	WebElement bookNow = driver.findElement(By.id("book_now"));
	bookNow.click();
	Thread.sleep(8000);
	WebElement orderNum = driver.findElement(By.id("order_no"));
	String text = orderNum.getAttribute("value");
	System.out.println(text);
	
	/////Task by Rajesh ////
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
