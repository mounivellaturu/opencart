package day3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CSSLocators {

	public static void main(String[] args) {
		
	//	ChromeDriver driver=new ChromeDriver();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		
		driver.manage().window().maximize();
		
		//tag id    tag#id
		
		// driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-Shirts");
		
		// driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-Shirts");
		
		//tag class tag. classname
		
	//	driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-Shirts");
		
	// 	driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-Shirts");
		
		//tag attribute
		
	// 	driver.findElement(By.cssSelector("input [placeholder='Search Store']")).sendKeys("T-Shirts");
		
		driver.findElement(By.cssSelector(" [placeholder='Search Store']")).sendKeys("T-Shirts");
		
		//tag class attribute
	//	driver.findElement(By.cssSelector("input.search-box-text [name='q']")).sendKeys("T-Shirts");
		//driver.findElement(By.cssSelector(".search-box-text [name='q']")).sendKeys("T-Shirts");
		
		
		
	}
	
}
