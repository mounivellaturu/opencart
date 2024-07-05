import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConditionalCommands {

	public static void main(String[] args) {
		
	//	ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();

		driver.get("https://demo.nopcommerce.com/register");
        driver.manage().window().maximize();
         
        //is Displayed()  is Enabled() is Selected()
        
     //  WebElement logo= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
     // System.out.println( "display status of logo:"+logo.isDisplayed());
      
     //boolean status= driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
       // System.out.println(status);
       WebElement searchbox= driver.findElement(By.xpath("//input[@id='small-searchterms']"));
       
      // System.out.println("Display status:"+searchbox.isDisplayed());
       
     //  System.out.println("Enable status:"+searchbox.isEnabled());
       
       // is Selected()
     WebElement male_rd= driver.findElement(By.xpath("//input[@id='gender-male']"));
     
     WebElement female_rd= driver.findElement(By.xpath("//input[@id='gender-female']"));
       
     //Before selection
     
    System.out.println("Before Selection......");
     
     System.out.println(male_rd.isSelected());
     
     System.out.println(female_rd.isSelected());
     
     // After selection of radio button
     System.out.println("After selection of female radiop button......");
     female_rd.click();
     System.out.println(male_rd.isSelected());
     System.out.println(female_rd.isSelected());
     
     
     
     
     
     
     
       
       
       
     		
	}

}
