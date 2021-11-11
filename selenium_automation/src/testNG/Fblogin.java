package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;

public class Fblogin {
	RemoteWebDriver driver;
	
  
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay\\Desktop\\selenium_workspace\\workspace\\selenium_automation\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
			// get to open a url
		driver.get("https://www.facebook.com/");		
			//Type usename and password
		driver.manage().window().maximize();
  }
  
  
  @Test
  public void tc_002_Fbloginapplication() {
	  driver.findElement(By.id("email")).sendKeys("divyapurna@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Varalakshmi");
		driver.findElement(By.name("login")).click();
		
		
		 
  }
	  

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
