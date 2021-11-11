package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Validationcommandsample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

			
				RemoteWebDriver driver;
				System.setProperty("webdriver.chrome.driver",".\\browserdrivers\\chromedriver.exe");
				driver = new ChromeDriver();
				driver.get("https://demoqa.com/dynamic-properties");
				
				driver.manage().window().maximize();
				
				if (driver.findElement(By.id("enableAfter")).isDisplayed()) {
					System.out.println("Webelemnt is displayed");
					if (driver.findElement(By.id("enableAfter")).isEnabled()) {
						System.out.println("Webelemnt is denabled");
					}else {
						System.out.println("Webelemnt isnot  enabled");
					}
				} else {
					System.out.println("Webelemnt is not displayed");
				}
				
				driver.navigate().to("https://demoqa.com/checkbox");
				WebElement ele = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[1]/div/ol/li/span/label/span[1]"));
				ele.click();
				Thread.sleep(5000);
				if (ele.isSelected()) {
					System.out.println("checkbox is selected");
				} else {
					System.out.println("checkbox is not selected");
				}
				
				
				
////				to handle the exception if there is any we use try catch block
//				try {
//					if(driver.findElement(By.id("visibleAfter")).isDisplayed()){
//						System.out.println("element is displayed on screen by default");
//					}else {
//						System.out.println("element is not  displayed on screen by default");
//					}
//				} catch (Exception NoSuchElementException) {
//					if(driver.findElements(By.id("visibleAfter")).size()>0){
//					System.out.println("element is displayed on screen by default");
//				}else {
//					System.out.println("element is not  displayed on screen by default");
//				}
//				
//				
				
			}

		

	}

