package webdriver;


import java.util.Iterator;
import java.util.List;

import javax.swing.text.html.parser.TagElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class GetalltheHyperlinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		RemoteWebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vijay\\Desktop\\selenium_workspace\\workspace\\selenium_automation\\browserdrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://beta.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.getCurrentUrl();
		driver.getTitle();
		List<WebElement> allhyperlinks = driver.findElements(By.tagName("a"));
		System.out.println(allhyperlinks.size());
		for(WebElement abc:allhyperlinks) {
			System.out.println(abc.getText());
		}
		}

}

