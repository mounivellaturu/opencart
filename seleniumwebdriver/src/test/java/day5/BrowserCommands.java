package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) throws InterruptedException {
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
       
        
       Thread.sleep(3000);
       
       driver.findElement(By.linkText("OrangeHRM, Inc"));
       // driver.close();//single browser window
       
       driver.quit();//all browser window
	}

}
