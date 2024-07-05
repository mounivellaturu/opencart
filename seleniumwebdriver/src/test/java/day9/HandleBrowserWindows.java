package day9;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicit command
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("OrangeHRM, Inc")).click();
		//capture id's for browser windows
		Set<String>windowIDs=driver.getWindowHandles();
		List<String>windowidsList=new ArrayList(windowIDs);//converted set----->list
		
		String parentWindowID=windowidsList.get(0);
		String childWindowID=windowidsList.get(1);
		
		//switch to child window
		driver.switchTo().window(childWindowID);
		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
		
		//switch to parent window
		driver.switchTo().window(parentWindowID);
		driver.findElement(By.xpath("//input[@placeholder='usename']")).sendKeys("admin");
		
	/*	//approach2
		for(String winid:windowIDs)
		{
			String title=driver.switchTo().window(winid).getTitle();
			if(title.equals("Human Resources Management Software | OrangeHRM"))
			{
		driver.findElement(By.xpath("//div[@class='d-flex web-menu-btn']//li[1]//a[1]")).click();
					
			}
		}*/
		//closing specific browser windows based on choice
		//1-x 2-y 3-z 4-a 5-b........
		
		/*for(String winid:windowIDs)
		{
			String title=driver.switchTo().window(winid).getTitle();
			if(title.equals("x")||title.equals("y")||title.equals("z"))
	        driver.close();				
			}*/
		
		
/*	for(String winid:windowIDs)
	{
		String title=driver.switchTo().window(winid).getTitle();
		if(title.equals("Human Resources Management Software | OrangeHRM"))
        driver.close();				
		}*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
