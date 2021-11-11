package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Assign8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		RemoteWebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\browserdrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(8000);
		List <WebElement> allerrormessages = driver.findElements(By.xpath("//span[contains(@class,'ValidationMessage')]"));
		Thread.sleep(5000);
		System.out.println(allerrormessages.size());
		for(WebElement abd: allerrormessages) {
			System.out.println(abd.getText());
				}
	
	}

}
