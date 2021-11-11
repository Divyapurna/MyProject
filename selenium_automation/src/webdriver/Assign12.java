package webdriver;

import javax.swing.JOptionPane;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign12 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		RemoteWebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\browserdrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[3]/td[3]/input")).sendKeys("divya purna");
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[7]/td[3]/input[1]")).sendKeys("div123ya");
		driver.findElement(By.xpath("//input[@value='Check availability']")).click();
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[9]/td[3]/input")).sendKeys("@Divya123");
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[11]/td[3]/input")).sendKeys("@Divya123");
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[14]/td/div/table/tbody/tr[1]/td[3]/input")).sendKeys("divyapurna@gmail.com");
		driver.findElement(By.id("mobno")).sendKeys("1234567890");
		Select day= new Select(driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[1]")));
		day.selectByVisibleText("09");
		Select month= new Select(driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[2]")));
		month.selectByVisibleText("AUG");	
		Select year= new Select(driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[22]/td[3]/select[3]")));
		year.selectByVisibleText("1995");
		
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[24]/td[3]/input[2]")).click();
	
		Select city= new Select(driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[28]/td/div/table/tbody/tr[1]/td[3]/select")));
		city.selectByVisibleText("Agartala");
		
		String abd = JOptionPane.showInputDialog("Enter the Captcha");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[32]/td[3]/input")).sendKeys(abd);
		
		driver.findElement(By.xpath("/html/body/center/form/div/table[2]/tbody/tr[34]/td[2]/input[6]")).click();
		
		
	}

}
