package day14;

import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.apache.commons.io.FileUtils;
import java.io.File;


public class CaptureScreenshot  {

	
	public static void main(String[] args) throws IOException{
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();

		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

		//capture full page screenshot
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\Lenovo\\eclipse-workspace\\seleniumwebdriver\\screenshots\\fullpage.png");
		
		FileUtils.copyFile(src, trg);

	}

}
