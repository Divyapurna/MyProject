package webdriver;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Takescreenshotsample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",".\\browserdrivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		Thread.sleep(5000);
		//to show the path to store screenshots
		driver.manage().window().maximize();
		String screenshotpath ="C:\\Users\\Vijay\\Desktop\\selenium_workspace\\workspace\\selenium_automation\\screenshots";
		
		//take a screenshot and its temporary stored in RAM location
		File abc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//move the folder into screenshot folder
		FileHandler.copy(abc, new File(screenshotpath+"TestResult.PNG"));
				
		
		

	}

}
