package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Assign14draganddrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		RemoteWebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\browserdrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		Actions act = new Actions(driver);
//		drag element
		WebElement drag5000 = driver.findElement(By.xpath("(//a[@class = 'button button-orange'])[2]"));
		
		WebElement drag50002 = driver.findElement(By.xpath("(//a[@class = 'button button-orange'])[4]"));
		
		WebElement dragbank = driver.findElement(By.xpath("(//a[@class = 'button button-orange'])[5]"));
		
		WebElement dragsales = driver.findElement(By.xpath("(//a[@class = 'button button-orange'])[6]"));
//		drop elemnets
		
		WebElement dropbank = driver.findElement(By.xpath("(//li[@class = 'placeholder'])[1]"));
		
		WebElement drop5000 = driver.findElement(By.xpath("(//li[@class = 'placeholder'])[2]"));
		
		WebElement dropsales = driver.findElement(By.xpath("(//li[@class = 'placeholder'])[3]"));
		
		WebElement drop50002 = driver.findElement(By.xpath("(//li[@class = 'placeholder'])[4]"));
		
		act.dragAndDrop(drag5000, drop5000).perform();
		
		act.dragAndDrop(drag50002, drop50002).perform();
		act.dragAndDrop(dragbank, dropbank).perform();
		act.dragAndDrop(dragsales, dropsales).perform();
		String abs  =   driver.findElement(By.xpath("//a[@class='button button-green']")).getText();
		System.out.println(abs);

	}

}
