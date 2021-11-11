package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GettextvsGetattribute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\browserdrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		Thread.sleep(5000);
		driver.manage().window().maximize();
////		get google search button
//		String googlesearchbutton =  driver.findElement(By.name("btnK")).getText();
//		System.out.println("googlesearchbutton is" +googlesearchbutton);
////	not displayed because google search is label...we cant get it from getText()	
		String googlesearchbutton =  driver.findElement(By.name("btnK")).getAttribute("value");
		System.out.println("googlesearchbutton is" +googlesearchbutton);
		
		
		
	}

}
