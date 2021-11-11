package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws InterruptedException {
	  
	  RemoteWebDriver driver;
	  
	  System.setProperty("webdriver.chrome.driver",".\\browserdrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("CONTINUE TO LOGIN")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("Button"
				+ "2")).click();
		String alert = driver.switchTo().alert().getText();
		System.out.println(alert);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("New User")).click();
		
		String confalert = driver.switchTo().alert().getText();
		System.out.println(confalert);
		
		driver.switchTo().alert().accept();
  }
}
