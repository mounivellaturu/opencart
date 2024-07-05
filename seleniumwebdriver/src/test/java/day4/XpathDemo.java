package day4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.github.bonigacia.wdm.WebDriverManager;


public class XpathDemo {

	public static void main(String[] args) {
		
		
		
		WebDriverManager.chromedriver().setup();
		
		// ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//xpath with single attribute
		
	String productname=driver.findElement(By.xpath("//[atext()='Mac Book']")).getText();
		
	}

}
