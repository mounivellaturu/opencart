package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedPopup {

	public static void main(String[] args) {
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		
	//	http://the-internet.herokuapp.com/basic_auth
    //		http://admin:admin@the-internet.herokuapp.com/basic_auth

        
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
		
	String text=driver.findElement(By.xpath("//p[contains(text(),'congratulations!')]")).getText();

	if(text.contains("congratulations"))
	{
		System.out.println("successful login");
	}
	else
	{
		System.out.println("login failed");
		
	}
	}

}
