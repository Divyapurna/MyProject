package testNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;

public class crossbrowsing {
	RemoteWebDriver driver;
	
  
	 @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vijay\\Desktop\\selenium_workspace\\workspace\\selenium_automation\\browserdrivers\\geckodriver.exe");
		driver = new FirefoxDriver();
//			
//			 System.setProperty("webdriver.edge.driver", "C:\\Users\\Vijay\\Desktop\\selenium_workspace\\workspace\\selenium_automation\\browserdrivers\\msedgedriver.exe");
//				driver = new EdgeDriver();
//				
//				
////				 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay\\Desktop\\selenium_workspace\\workspace\\selenium_automation\\browserdrivers\\chromedriver.exe");
////					driver = new ChromeDriver();
//			
				// get to open a url
			driver.get("https://www.facebook.com/");		
			
				//Type usename and password
			driver.manage().window().maximize();
	  }
	  
  
  @Test
  public void tc_002_Fbloginapplication() {
//	  driver.findElement(By.id("email")).sendKeys("divyapurna@gmail.com");
//		driver.findElement(By.name("pass")).sendKeys("Varalakshmi");
//		driver.findElement(By.name("login")).click();
		
		
		 if (driver.findElement(By.name("login")).isDisplayed()){
			  System.out.println("logn screen is displayed on the screen");
			
			  
		} else {
			System.out.println("logn screen is not displayed on the screen");

		}
  }
	  

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
