package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionsample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\browserdrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(5000);
		
		driver.manage().window().maximize();
		//call action here
		
		Actions act = new Actions(driver);
		// right click on webelemnt
		WebElement rightclick = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		act.contextClick(rightclick).perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[contains(text(),'Edit')]")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		//do click on above element to make box invivsible
		rightclick.click();
		Thread.sleep(5000);
		
		
//		ElementClickInterceptedException
		//double click on the elemnet
	
		WebElement doubleclick = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me To See Alert')]"));
		act.doubleClick(doubleclick).perform();
		System.out.println(driver.switchTo().alert().getText());
		
		driver.switchTo().alert().accept();
		
//		switch to anaother url
		
//		driver.get("https://www.platformqedu.com/");
//		both are same
		driver.navigate().to("https://www.platformqedu.com/");
		Thread.sleep(3000);
//		move mouse pointer to products
		WebElement productmenu = driver.findElement(By.xpath("//div[contains(text(),'Products')]"));
		act.moveToElement(productmenu).perform();
//		Drag and drop
//		open another url
		driver.get("https://demoqa.com/droppable");
		Thread.sleep(3000);
		
//		assign the darg and drop xpath to webelemets
//		get the drop here text
//		this is relative xpath...
//		String dropheretext=driver.findElement(By.xpath("//p[contains(text(),'Drop here')]")).getText();
//		absolute xpath dont changing after performing the action
		String dropheretext=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).getText();
		System.out.println(dropheretext);
		
		WebElement dragele  = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dropele  = driver.findElement(By.xpath("//div[@id='simpleDropContainer']//div[@id='droppable']"));
		Thread.sleep(3000);
		act.dragAndDrop(dragele, dropele).perform();
//		get text after the action is performed
		String droppedafter=driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]")).getText();
		System.out.println(droppedafter);
		
	}

}
