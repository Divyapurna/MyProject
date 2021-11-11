package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Hyperjoption {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		RemoteWebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.justrechargeit.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("signup_name")).sendKeys("Divya ");
		driver.findElement(By.name("signup_mobileno")).sendKeys("8919133722");
		driver.findElement(By.name("signup_email")).sendKeys("divyapurna@gmail.com");
		driver.findElement(By.name("signup_password")).sendKeys("123456");
		driver.findElement(By.name("checkbox")).click();
		driver.findElement(By.id("imgbtnSubmit")).click();
		
		
		
		
	}

}
