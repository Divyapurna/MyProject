package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Assign10 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		RemoteWebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\browserdrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.justrechargeit.com/");
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.findElement(By.partialLinkText("Create New Account")).click();
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		if (driver.findElement(By.name("imgbtnSubmit")).isDisplayed()){
			System.out.println("craete account button is displayed");
			if (driver.findElement(By.name("imgbtnSubmit")).isEnabled()) {
				
				System.out.println("craete account button is enabled");	
				
			}else {
				System.out.println("craete account button is  not enabled");	
			}
		} else {
			System.out.println("craete account button is not displayed");
		}
	
		
		
	if (driver.findElement(By.id("checkbox1")).isSelected()){
		System.out.println("craete account button is selected");
	} else {
		System.out.println("craete account button is not selected");
	}
	
	driver.findElement(By.name("imgbtnSubmit")).click();
	List<WebElement> allerrormessages = driver.findElements(By.xpath("//span[@class='errormsg']"));
	System.out.println(allerrormessages.size());
	for(WebElement abd:allerrormessages) {
		System.out.println(abd.getText());
	}
	
	Thread.sleep(5000);
	driver.navigate().refresh();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	Thread.sleep(5000);
	driver.navigate().back();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());Thread.sleep(5000);
	driver.navigate().forward();
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	
	}
}
