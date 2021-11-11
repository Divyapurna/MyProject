package webdriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Switchingtabs {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		RemoteWebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\browserdrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://stqatools.com/demo/Windows.php");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//button[@class='btn btn-info'])[1]")).click();
		
//		/String parentwindow = driver.getWindowHandle();
		
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");
//		set is stored in container format... in array list it ill store in index format
		
		ArrayList<String> Alltabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(Alltabs.get(1));
		// here get (0) means parent tab
//		here get(1) means child tab with next tab
		Thread.sleep(3000);
        //click on java menu
		 driver.findElement(By.xpath("(//span[@class='menu-text'])[2]")).click();
        //to close the child tab
		//driver.close();
	}
}


