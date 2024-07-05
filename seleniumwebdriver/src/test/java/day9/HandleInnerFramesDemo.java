package day9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleInnerFramesDemo {

	public static void main(String[] args) {
		//ChromeDriver driver=new ChromeDriver();
				WebDriver driver=new ChromeDriver();
				
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicit command
				
				driver.get("https://ui.vision/demo/webtest/frames/");
				driver.manage().window().maximize();
				
				//frame1
				WebElement	frm1 =driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
				 driver.switchTo().frame(frm1);
				driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("11111");
				
            //frame3
				WebElement	frm3 =driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
				 driver.switchTo().frame(frm3);
				 driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("33333");	 
				 
			//innerframe
			driver.switchTo().frame(0);
			driver.findElement(By.cssSelector("div.AB7lab")).click();
			
			driver.switchTo().defaultContent();
				 
	}
}
