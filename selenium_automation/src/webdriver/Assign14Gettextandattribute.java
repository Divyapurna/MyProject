package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Assign14Gettextandattribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		RemoteWebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\browserdrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		String emailandusername = driver.findElement(By.id("email")).getText();
		System.out.println("gettext emailid and username is printing---" +emailandusername );
		Thread.sleep(5000);
		String forgottenpassword = driver.findElement(By.xpath("//a[contains(text(),'Forgotten password?')]")).getText();
		System.out.println("gettext of forgottenpassword is printing-----" +forgottenpassword);
		
		String emailandusernameusingattribute = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println("getattribute is printing------" +emailandusernameusingattribute);

	}

}
