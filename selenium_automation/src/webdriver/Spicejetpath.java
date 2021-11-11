package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Spicejetpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		RemoteWebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vijay\\Desktop\\selenium_workspace\\workspace\\selenium_automation\\browserdrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://beta.spicejet.com/#sourceautocomplete");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		
		
		driver.findElement(By.xpath("(//input[@spellcheck='false'])[1]")).sendKeys("Agartala");
		driver.findElement(By.xpath("(//input[@spellcheck='false'])[2]")).sendKeys("Amritsar");
		driver.findElement(By.xpath("//class[@contains[text()='Departure Date']")).click();
		driver.findElement(By.xpath("//class[@contains[text()='Return Date']")).click();
	}

}
