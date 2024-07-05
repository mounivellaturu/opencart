package day10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTableDemo {

	public static void main(String[] args) {
		//ChromeDriver driver=new ChromeDriver();
				WebDriver driver=new ChromeDriver();
				
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// implicit command
				
				driver.get("https://testautomationpractice.blogspot.com/");
				driver.manage().window().maximize();
			//	1)find total number of rows
		//Approach1
				
		//int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		int rows=driver.findElements(By.tagName("tr")).size();//preferred
		System.out.println("Number of rows:"+rows);//preferred only if you have one single table		
				
	   //  2)find total number of columns
		
		int cols=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
	//	int cols=driver.findElements(By.tagName("th")).size();//preferred
		
		System.out.println("Number of columns:"+cols);
		
		//  3)Read specific row&column data
		
		
	// driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[1]")).getText();
		// System.out.println("value");
		
		//  4)Read data from all the rows&columns
		
	/*	System.out.println("Book Name"+"  "+"Author"+"     "+"Subject"+"     "+"Price");
				
		    for(int r=2;r<=rows;r++)
		    		
		    {
		    	for(int c=1;c<=cols;c++)
		    	{
String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText(); 
		System.out.println(value+"\t");    
		    }
		    	System.out.println();
		    }*/
		         
			//  5)print booknames whose author  is amit
		 /*
		    for(int r=2;r<=rows;r++)
		    {
		    	
String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
		  
		 
		
		    if(author.equals("Amit"))
		    {
	String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
	
	System.out.println(author+"   "+bookname);
		    }
	
	
		    }*/
		    
//  6)find sum of prices for all the books	
            int sum=0;
		    for(int r=2;r<=rows;r++)
		    {
		    	
String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
sum=sum+Integer.parseInt(price);	  
		    }
		  System.out.println("Total price of books:"+sum);  
		    
		    
	
		
		    }
		
		
		
	}


