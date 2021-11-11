package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Navigationalcommandsample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		RemoteWebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Forgotten password?")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("email")).sendKeys("abhf");
		driver.navigate().refresh();
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().forward();
		Thread.sleep(5000);
		System.out.println("*****************"+driver.getCurrentUrl());
		
		
	}

}
