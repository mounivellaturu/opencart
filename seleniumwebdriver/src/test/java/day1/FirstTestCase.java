package day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
/*
 TestCase
 -------
  1)Launch Browser (chrome)
  2)Open URL https://demo.opencart.com/
  3)Validate title should be "Your Store"
  4)Close Browser
  
  
 
 */

public class FirstTestCase {

	public static void main(String[] args) {
		
	//	1)Launch Browser (chrome)
		
	//	ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
	//	2)Open URL https://demo.opencart.com/
		
		driver.get("https://demo.opencart.com/");
		
	//	3)Validate title should be "Your Store"
		
		String act_Title=driver.getTitle();
		
		if(act_Title.equals("Your Store"))
		{
			System.out.println("Test Passed");
		}
		
		else
			{
				System.out.println("Test Failed");
			}
	//  4)Close Browser
		// driver.close();
		   driver.quit();
		  
		
					
	}

}
