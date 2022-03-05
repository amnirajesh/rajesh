package selenium.org.com;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationTesting {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJESH J\\eclipse-workspace\\FullCourse\\selenium.org.com\\Driver\\chromedriver.exe");
		WebDriver Driver=new ChromeDriver();
		Driver.get("http://demo.automationtesting.in/Register.html");
		WebElement txtFirstName = Driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	    txtFirstName.sendKeys("Rajesh");
	    WebElement txtLastName = Driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	    txtLastName.sendKeys("Jayabal");
	    WebElement txtAddress = Driver.findElement(By.xpath("//textarea[@rows='3']"));
	    txtAddress.sendKeys("SN chavadi,cuddalore");
	    WebElement txtEmail = Driver.findElement(By.xpath("//input[@type='email']"));
	    txtEmail.sendKeys("amnirajesh@gmail.com");
	    WebElement txtPhone=Driver.findElement(By.xpath("//input[@type='tel']"));
	    txtPhone.sendKeys("9080672764");
	    WebElement txtGender = Driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
	    txtGender.click();
	    WebElement selectHobbies1 = Driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
	    selectHobbies1.click();
	    WebElement selectHobbies2 = Driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
	    selectHobbies2.click();
	    WebElement selectHobbies3 = Driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
	    Thread.sleep(10000);
	    selectHobbies3.click();
	    
	    
	   // WebElement txtLanguage = Driver.findElement(By.id("msdd"));
	   // txtLanguage.click();
	   // WebElement listSkill = Driver.findElement(By.xpath("(//select[@ type='text'])[1]"));
	    //listSkill.click();
//	    WebElement txtFirstPass = Driver.findElement(By.id("firstpassword"));
//	    txtFirstPass.sendKeys("9080672764");
//	    WebElement txtSecondPass = Driver.findElement(By.id("secondpassword"));
//	    txtSecondPass.sendKeys("9080672764");
//	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
	}

}
