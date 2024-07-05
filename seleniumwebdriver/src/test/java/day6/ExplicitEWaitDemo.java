package day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitEWaitDemo {

	public static void main(String[] args) {
		//ChromeDriver driver=new ChromeDriver();
				WebDriver driver=new ChromeDriver();
				
				
				WebDriverWait mywait=new WebDriverWait( driver, Duration.ofSeconds(10));
				
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			driver.manage().window().maximize();
			
	WebElement username=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
	username.sendKeys("Admin");		
			
	
	
	WebElement password=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
	password.sendKeys("admin123");		
	
			
				
				
				
				
	}

}
