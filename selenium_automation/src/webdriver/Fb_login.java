package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Fb_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// create an object for web driver\ remote web  driver
		//WebDriver driver;
		RemoteWebDriver driver;
		
	
		//invoke the chrome browser
		//System.setProperty("key", "path location of the browser driver")
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vijay\\Desktop\\selenium_workspace\\workspace\\selenium_automation\\browserdrivers\\chromedriver.exe");
	driver = new ChromeDriver();
	
		// get to open a url
	driver.get("https://www.facebook.com/");		
		//Type usename and password
	driver.findElement(By.id("email")).sendKeys("divyapurna@gmail.com");
	driver.findElement(By.name("pass")).sendKeys("Varalakshmi");
	driver.findElement(By.name("login")).click();
	
	
	}

}
