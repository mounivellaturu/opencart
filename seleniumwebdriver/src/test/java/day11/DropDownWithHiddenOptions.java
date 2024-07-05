package day11;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DropDownWithHiddenOptions {

	public static void main(String[] args) {
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		
		WebDriverWait mywait=new WebDriverWait( driver, Duration.ofSeconds(10));
		
	driver.get("https://opensource-demo.orangehrmlive.com");
	driver.manage().window().maximize();
		
		
	driver.findElement(By.name("username")).sendKeys("Admin")	;
	driver.findElement(By.name("password")).sendKeys("admin123");
	driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	
	//Dropdown
	
	driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]"));
	List<WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
	
	for(WebElement option:options)
	{
		System.out.println(option.getText());
		if(option.getText().equals("Finance Manager"))
		{
			option.click();
		    break;
		    
	} 
	}
	}
	}


