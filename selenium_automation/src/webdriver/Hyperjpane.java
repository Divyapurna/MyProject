package webdriver;

import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Hyperjpane {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
			RemoteWebDriver driver;
			System.setProperty("webdriver.chrome.driver", ".\\browserdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.justrechargeit.com/");
			Thread.sleep(3000);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			
			driver.findElement(By.linkText("Sign in")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("txtUserName")).sendKeys("divyapurna@gmail.com");
			
			driver.findElement(By.id("txtPasswd")).sendKeys("123456");
			Thread.sleep(3000);
			String abc = JOptionPane.showInputDialog("Enter the captcha");
			Thread.sleep(3000);
			driver.findElement(By.id("txtCaptcha")).sendKeys(abc);
			driver.findElement(By.id("imgbtnSignin")).click();
			
		    
	
	}
	

}
