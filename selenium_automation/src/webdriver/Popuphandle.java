package webdriver;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import net.bytebuddy.implementation.EqualsMethod;

public class Popuphandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		RemoteWebDriver driver;
		System.setProperty("webdriver.chrome.driver",".\\browserdrivers\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		 String  parentwindow =driver.getWindowHandle();
		System.out.println(parentwindow);
		Set<String> allwindowsids = driver.getWindowHandles();
//		for (Iterator iterator = allwindowsids.iterator(); iterator.hasNext();) {
//			String string = (String) iterator.next();
		System.out.println("********************************");
		for (String  string: allwindowsids) {
			System.out.println(string);
		}
//		cross check whether the page is main page or child page baased on the window id
	Iterator<String> abc = allwindowsids.iterator();
//	while loop if abc has next value if yes then go inside
//	and do switching
	while (abc.hasNext()) {
//	create one string-- child window
		String childwindow = (String) abc.next();
////		is parent and child is matching
////		CDwindow-08C4CA164CF0F612DD3D126EB830456D
//		********************************
//		CDwindow-08C4CA164CF0F612DD3D126EB830456D
//		CDwindow-034AB09366B2DDA6F2A6182A39D0F2C0
//		CDwindow-2B28BC3579BD649382986B37D62AD28D
//		CDwindow-3262A7504218A487D812F0AD6A8199CA
		
		if (!parentwindow.equals(childwindow)  ) {
//			if parent in not equal then if loop executed
		driver.switchTo().window(childwindow);
		driver.close();
		}
		
	}//while loop cclose
	driver.quit();
	}


	}
