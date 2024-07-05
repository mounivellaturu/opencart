package day6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationalCommands {

	public static void main(String[] args) {
		WebDriverManager.ChromeDriver().setup();
		
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.in/");
	    System.out.println(driver.getCurrentUrl());
		;
		driver.navigate().to("https://www.flipkart.com/");
        System.out.println(driver.getCurrentUrl());
        
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());
        
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());
        
        driver.navigate().refresh();
        System.out.println(driver.getCurrentUrl());
        
        
        
        
	}

}
