package day9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFramesDemo1 {

	public static void main(String[] args) {
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicit command
		
driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.manage().window().maximize();
		
		
		driver.switchTo().frame("class-summary");
	driver.findElement(By.linkText("org.openqa.selenium")).click();	//frame1
	
	driver.switchTo().defaultContent(); //switch back to page
	
	driver.switchTo().frame("PackageFrame");
	driver.findElement(By.linkText("WebDriver")).click(); //frame2
	
	driver.switchTo().defaultContent();
	
		
	driver.switchTo().frame("ClassFrame");
	driver.findElement(By.xpath("//div[@class='topNav']//a[normalize-space()='Overview']")).click(); //frame3
		
	}

}
