package day7;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDownwithSelectTag {

	public static void main(String[] args) {
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
            driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
            		driver.manage().window().maximize();
            
           
         WebElement  drpCountryEle =driver.findElement(By.xpath ("//select[@id='country-list']"));
		 Select drpCountry=new Select (drpCountryEle);
         
         //1)selecting an option from teh dropdown
          //drpCountry.selectByVisibleText("France");
		 // drpCountry.selectByValue("4");//use this only if value atribute is present for opyion tag
		// drpCountry.selectByIndex(3);
		// 2)find total options in dropdown
		List<WebElement>options= drpCountry.getOptions();
		System.out.println("total number of options:"+options.size());
		
		//3)print options in console window
		
/*for(int i=0;i<options.size();i++)
{
	System.out.println(options.get(i).getText());
	
}*/
		//using enhanced loop
		
   for(WebElement op:options)
   {
	   System.out.println(op.getText());
   }
		 
		 
		 
		 
  }
	

}
