package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownxpathprac {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			RemoteWebDriver driver;
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Vijay\\Desktop\\selenium_workspace\\workspace\\selenium_automation\\browserdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			Thread.sleep(3000);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("firstname")).sendKeys("divya");
			driver.findElement(By.name("lastname")).sendKeys("kommoju");
			driver.findElement(By.name("reg_email__")).sendKeys("divyapurna@gmail.com");
			driver.findElement(By.name("reg_email_confirmation__")).sendKeys("divyapurna@gmail.com");
			driver.findElement(By.name("reg_passwd__")).sendKeys("divya");
			
			Select date = new Select(driver.findElement(By.id("day")));
			date.selectByVisibleText("11");
		
			Select month = new Select(driver.findElement(By.id("month")));
			month.selectByVisibleText("Sep");
			
			Select year = new Select(driver.findElement(By.id("year")));
			year.selectByVisibleText("1992");
			driver.findElement(By.name("sex")).click();
			driver.findElement(By.name("websubmit")).click();
			
	}

}
