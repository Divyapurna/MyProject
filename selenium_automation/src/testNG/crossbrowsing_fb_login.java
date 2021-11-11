package testNG;

import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;

public class crossbrowsing_fb_login {
	RemoteWebDriver driver;
//	
//	String browsername = "edge";
////	String browsername = "opera";
//	my broswer name is edge
		@Parameters("browsername")
		 @BeforeClass
		  public void beforeClass(@Optional("Firefox") String browsername) {
//			 if condition checks browser name edge is equal to chrome ...then call chrome
//		checks untill if codition is true and then calls the browser
			 if (browsername.equalsIgnoreCase("Edge")) {
				 System.setProperty("webdriver.edge.driver", "C:\\Users\\Vijay\\Desktop\\selenium_workspace\\workspace\\selenium_automation\\browserdrivers\\msedgedriver.exe");
					driver = new EdgeDriver();
					
			} else if (browsername.equalsIgnoreCase("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay\\Desktop\\selenium_workspace\\workspace\\selenium_automation\\browserdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
				
			} else if (browsername.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\Vijay\\Desktop\\selenium_workspace\\workspace\\selenium_automation\\browserdrivers\\geckodriver.exe");
				driver = new FirefoxDriver();
				
			} else {
				System.out.println("Plesase give valid browsername%%%%%%%%%%%%5");
			}			
					// get to open a url
				driver.get("https://www.facebook.com/");		
				
					//Type usename and password
				driver.manage().window().maximize();
		  }
	  
  @Test
  
	  public void tc_002_Fbloginapplication() {
//		 
	  if (driver.findElement(By.name("login")).isDisplayed()) {
		System.out.println("Login button is displayed in login screen");
	} else {
		System.out.println("Login button is not displayed on screen");
	}
			
			 
	  }
  
  @Test
  public void tc_004_Fbloginapplication() {
	  driver.findElement(By.id("email")).sendKeys("divyapurna@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Varalakshmi");
		driver.findElement(By.name("login")).click();
  }

  @AfterClass
  public void afterClass() {
  driver.quit();
  }

}
