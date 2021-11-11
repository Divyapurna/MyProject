package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver.SystemProperty;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Rechargeaccountcreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteWebDriver driver;
		//invoke chrome
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vijay\\Desktop\\selenium_workspace\\workspace\\selenium_automation\\browserdrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.justrechargeit.com/signIn.aspx");
		driver.findElement(By.id("txtUserName")).sendKeys("divyapurna@gmail.com");
		driver.findElement(By.id("txtPasswd")).sendKeys("divya");
		
	}
}
