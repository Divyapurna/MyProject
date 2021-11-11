package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign14xewebsiteattribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		RemoteWebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\browserdrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.xe.com/");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		driver.findElement(By.id("yie-close-button-2edd8bcd-a3ba-547f-abcd-de5ee7639923")).click();
		
		driver.findElement(By.id("amount")).clear();
		driver.findElement(By.id("amount")).sendKeys("536");
		Thread.sleep(3000);
		String valueentered = driver.findElement(By.id("amount")).getAttribute("value");
		
		System.out.println("the value entered is"  +valueentered);
		
		String craeteaccount = driver.findElement(By.xpath("//body/div[@id='__next']/div[2]/div[3]/section[1]/div[2]/div[1]/div[1]/div[1]/div[1]")).getText();
		System.out.println("first step to create account is-- " +craeteaccount);
		
//		Select fromcurrency = new Select(driver.findElement(By.id("midmarketFromCurrency")));
//		fromcurrency.selectByVisibleText("SGDSingapore Dollar");
		
		String enterdeatils = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/section[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]")).getText();
		System.out.println("Second step to create account is-- " +enterdeatils);
		
		String conformandsend = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[3]/section[1]/div[2]/div[1]/div[1]/div[1]/div[3]/div[1]")).getText();
		System.out.println("Third  step to create account is-- " +conformandsend);
		
//
		
		
		
		
		
	}
	}


