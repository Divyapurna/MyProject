package webdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Assign13 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		RemoteWebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\browserdrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("alertButton")).click();
		String alert1 = driver.switchTo().alert().getText();
		System.out.println(alert1);
		driver.switchTo().alert().accept();
		
		//number 2 click me
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(8000);
		String alert2 = driver.switchTo().alert().getText();
		System.out.println(alert2);
		driver.switchTo().alert().accept();
		
		//number 3 click me
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		String alert3 = driver.switchTo().alert().getText();
		System.out.println(alert3);
		driver.switchTo().alert().dismiss();
		String alert3result = driver.findElement(By.id("confirmResult")).getText();
				
				
		//number 4 click me
		driver.findElement(By.id("promtButton")).click();
		Thread.sleep(3000);
		String alert4 =  driver.switchTo().alert().getText();
		driver.switchTo().alert().sendKeys("Divya");
		
		
	}

}
