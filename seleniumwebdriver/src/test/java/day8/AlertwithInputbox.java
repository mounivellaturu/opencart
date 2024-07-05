package day8;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertwithInputbox {

	public static void main(String[] args) {
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();

        
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Alert alertwindow=driver.switchTo().alert()	;
		System.out.println(alertwindow.getText());
		alertwindow.sendKeys("welcome");
		alertwindow.accept();
		//alertwindow.dismiss();
		
		//validation
		String act_text=driver.findElement(By.xpath("//h4[normalize-space()='Result:']")).getText();
		String exp_text="You entered: welcome";
		if(act_text.equals(exp_text))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
		
		}
			
	}		
		
		
		
		
		
		
		
	}


