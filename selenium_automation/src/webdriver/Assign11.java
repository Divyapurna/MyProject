package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Assign11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		RemoteWebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\browserdrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		if(driver.findElement(By.name("account.listOption")).isSelected()) {
			System.out.println("Enable MyList is selected");
		}else {
			System.out.println("Enable MyList is not selected");

		}
		
		
		
		if(driver.findElement(By.name("account.bannerOption")).isSelected()) {
			System.out.println("Enable MyBanner is selected");
		}else {
			System.out.println("Enable MyBanner is not selected");

		}
	}

}
