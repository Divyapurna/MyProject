package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.By.ByPartialLinkText;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.dom.model.ShadowRootType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.w3c.dom.Text;

public class Weblocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		RemoteWebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\browserdrivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
			
		driver.get("https://m.facebook.com/");
		Thread.sleep(3000);
		String abc = driver.getCurrentUrl();
		System.out.println(abc);
		String bcd = driver.getTitle();
		System.out.println(bcd);
		
		driver.findElement(By.partialLinkText("Create New Account")).click();
		
		String def = driver.getCurrentUrl();
		System.out.println(def);
		String efg = driver.getTitle();
		System.out.println(efg);
		if (def.contains("reg")){
			System.out.println("login page opened");
		}else {
			System.out.println("login page not opened");
		}
		
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
