package MainPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert5 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
  		WebDriver driver=new ChromeDriver();
  		driver.get("http://www.ksrtc.in/oprs-web/");
		driver.manage().window().maximize();
  		//Thread.sleep(50000);
  		//WebElement e1=driver.findElement(By.xpath("//*[@class='ui-helper-hidden-accessible']/input[@id='fromPlaceName']"));
  		//e1.sendKeys("bengaluru");
  		
  		//WebElement e1=driver.findElement(By.xpath("//*[@class='ui-autocomplete-input' and @type='text'][position()=1]"));
  		WebElement e1=driver.findElement(By.xpath("//*[@class='form-control inputText ui-autocomplete-input' and @name='fromPlaceName']"));

  		e1.sendKeys("bengaluru");
  		
  	//*[@id="fromPlaceName"]
  		
	}

}


