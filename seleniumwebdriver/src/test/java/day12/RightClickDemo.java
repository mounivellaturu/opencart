package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) {
		//ChromeDriver driver=new ChromeDriver();
				WebDriver driver=new ChromeDriver();
				
				
				
				
			driver.get("https://swisnl.github.io/jQuery-contextMenu/3.x/demo.html");
			driver.manage().window().maximize();
			
			 WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
			
			Actions act=new Actions(driver);
			
			
			//right click
			
			
           	act.contextClick(button).perform();		
	}

}


