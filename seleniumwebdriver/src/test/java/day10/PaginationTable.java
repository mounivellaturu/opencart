package day10;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PaginationTable {

	public static void main(String[] args) throws InterruptedException {
		
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicit command
		
		driver.get("https://demo.opencart.com/admin/index.php");
		driver.manage().window().maximize();
		
		//Login
		WebElement username=driver.findElement(By.id("input-username"));
		username.clear();
		username.sendKeys("demo");//demo
		
		WebElement password=driver.findElement(By.id("input-password"));
		password.clear();
		password.sendKeys("demo");//demo
		
		driver.findElement(By.xpath("//button[text()='Login']"));
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed())
		{
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
			
		}	
	//customers------>customers
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click();
		driver.findElement(By.xpath("//ul[@class='collapse show']//a[contains(text(),'Customers')]")).click();
		
		String text=driver.findElement(By.xpath("//div[@class='col-sm-6  text-end']")).getText();
		
		text.substring(27,30);
		
		
		
		text.substring(text.indexOf("(")+1,text.indexOf("pages")-1);
		
		
		int total_pages=Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("pages")-1));
		
		System.out.println("Total number of pages:"+total_pages);
		
		for(int p=1;p<=5;p++)    //for(int p=1;p<=total;p++)
		{
			if(total_pages>1)
			{
				WebElement active_Page=driver.findElement(By.xpath("ul[@class='pagination']//li//*[text="+p+"]"));
				System.out.println("Active page:"+active_Page.getText());
				active_Page.click();
				Thread.sleep(2000);
			}
int  noOfrows=driver.findElements(By.xpath("//table[@class='table table-bordered table_hover']//tbody//tr")).size();
System.out.println("Total No of Rows in Active Page:"+noOfrows);		
			
for(int r=1;r<=noOfrows;r++)
{
String customerName=driver.findElement(By.xpath("//table[@class='table table-bordered table_hover']//tbody//tr["+r+"]//td[2]")).getText();	
String customerEmail=driver.findElement(By.xpath("//table[@class='table table-bordered table_hover']//tbody//tr["+r+"]//td[3]")).getText();	
		String status=driver.findElement(By.xpath("//table[@class='table table-bordered table_hover']//tbody//tr["+r+"]//td[5]")).getText();	
		
				System.out.println(customerName+"   "+customerEmail+"   "+status);
	
}
	
	}
		
		driver.quit();
	}
				
				
}	
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
