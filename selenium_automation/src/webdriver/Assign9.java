package webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		RemoteWebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vijay\\Desktop\\selenium_workspace\\workspace\\selenium_automation\\browserdrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://blazedemo.com/");
		Thread.sleep(5000);
		driver.findElement(By.name("fromPort")).sendKeys("Boston");
		driver.findElement(By.name("toPort")).sendKeys("Cairo");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(5000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='btn btn-small']")).click();
		driver.findElement(By.id("inputName")).sendKeys("Divya");
		driver.findElement(By.id("address")).sendKeys("alibag,vidyanagar,mumbai");
		driver.findElement(By.id("city")).sendKeys("Alibag");
		driver.findElement(By.id("state")).sendKeys("Maharastra");
		driver.findElement(By.id("zipCode")).sendKeys("402201");
		
		Select cardtype = new Select(driver.findElement(By.id("cardType")));
		cardtype.selectByVisibleText("Visa");
		
		driver.findElement(By.id("creditCardNumber")).sendKeys("203523568945");
		
		driver.findElement(By.id("creditCardMonth")).sendKeys("10");
		driver.findElement(By.id("creditCardYear")).sendKeys("2020");
		driver.findElement(By.id("nameOnCard")).sendKeys("Divya");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(5000);
		String efg = driver.getTitle();
		System.out.println(efg);
		
		//h1[text()='Thank you for your purchase today!']
		//driver.findElement(By.xpath("h1[text()='Thank you for your purchase today!")).click();
		WebElement thanku = driver.findElement(By.xpath("//h1[text()='Thank you for your purchase today!']"));
		System.out.println(thanku.getSize());
		
			System.out.println(thanku.getText());
	
		
		List <WebElement> allthedata = driver.findElements(By.tagName("tr"));
		System.out.println(allthedata.size());
		for(WebElement abc: allthedata) {
			System.out.println(abc.getText());
		}
		

		}
	}





