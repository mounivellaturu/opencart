package day5;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



/*get(url)
 getTitle()
 getCurrentURL()
 getPageSource()
 getWindowHandle()
 getwindowHandles()
 */
 

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		
	//	WebDriverManager.chromedriver().setup();
		
		// ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	System.out.println(	"Title of the page="+driver.getTitle());
	System.out.println("current URL="+driver.getCurrentUrl());
	
	/*System.out.println("page source.........");
	System.out.println(driver.getPageSource());
	String ps=driver.getPageSource();
	System.out.println("ps");
	
	System.out.println(ps.contains("html"));*/
	
	// System.out.println(driver.getWindowHandle());
	
	Thread.sleep(3000);
	
	driver.findElement(By.linkText("OrangeHRM, Inc")).click();// opens new browser
	
	Set<String> windowids=driver.getWindowHandles();
	
	for(String winid:windowids)
			{
		System.out.println(winid);
			}
	}
	

}
