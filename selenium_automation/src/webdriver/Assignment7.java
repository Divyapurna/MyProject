package webdriver;

import java.rmi.Remote;
import java.time.Month;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		RemoteWebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vijay\\Desktop\\selenium_workspace\\workspace\\selenium_automation\\browserdrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.partialLinkText("Create New Account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("divya");
		driver.findElement(By.name("lastname")).sendKeys("kommoju");
		driver.findElement(By.name("reg_email__")).sendKeys("divyapurna@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("divyapurna@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("123456");
		Select date= new Select(driver.findElement(By.name("birthday_day")));
		date.selectByVisibleText("11");
		Select month=new Select(driver.findElement(By.name("birthday_month")));
		month.selectByVisibleText("Sep");
		
		Select year = new Select(driver.findElement(By.name("birthday_year")));
		year.selectByVisibleText("1992");
		driver.findElement(By.xpath("//input[@name='sex'][1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("websubmit")).click();
		
	}  
	  
	}


