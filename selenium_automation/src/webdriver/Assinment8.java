package webdriver;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Assinment8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		RemoteWebDriver driver;
	
		System.setProperty("webdriver.chrome.driver",".\\browserdrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://collegeweeklive.com/go-signup/");
		Thread.sleep(7000);
		driver.manage().window().maximize();
		//System will display error messages
		//Get the error messages and print it into console
		
		driver.findElement(By.id("submit")).click();
		
		//String fdfsdf = driver.findElement(By.id("firstNameError")).getText();
				//System.out.println(fdfsdf);
		String fdfsdf = driver.findElement(By.id("firstNameError")).getText();
		System.out.println(fdfsdf);

	}

}
