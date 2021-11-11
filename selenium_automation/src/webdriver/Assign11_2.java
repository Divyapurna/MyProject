package webdriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Assign11_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		RemoteWebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\browserdrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
	}

}
