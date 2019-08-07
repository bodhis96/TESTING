package MainPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alert14
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
  		driver.get("http://www.naukri.com");
		driver.manage().window().maximize();
	 Set<String> s=driver.getWindowHandles();
		for(String h:driver.getWindowHandles())
		{
 			System.out.println(h);

			driver.switchTo().window(h);
			String t=driver.getTitle();
			System.out.println(t);
			Boolean flagn=false;
			// WebElement i;
 			if(t.equalsIgnoreCase("Amazon"))
	    	{
			System.out.println("Yes found the window");
			driver.switchTo().window(h);
			driver.manage().window().maximize();
		/**	
           Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		            .withTimeout(Duration.ofSeconds(25))
		    	    .pollingEvery(Duration.ofSeconds(6))
        		    .ignoring(NoSuchElementException.class);
        	 i = wait.until(new Function<WebDriver, WebElement>() 
        	 {
        	     public WebElement apply(WebDriver driver) 
        	     {
        	        return driver.findElement(By.xpath("//img[@src='http://w28.naukri.com/advertiser/bms_logimpressions.php?banlist=7301380']"));
        	     }
        	 });
			
			*/
			WebDriverWait wait = new WebDriverWait(driver,25);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='http://w28.naukri.com/advertiser/bms_logimpressions.php?banlist=7301380']")));
      WebElement i=driver.findElement(By.xpath("//img[@src='http://w28.naukri.com/advertiser/bms_logimpressions.php?banlist=7301380']"));
            i.click();
            break;
			}
		else
		{
			flagn=true;
			System.out.println("No such window");
		}
 			
 			
		}
		
		
	}

}
