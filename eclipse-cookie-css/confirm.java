package MainPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirm 
{
	public static void main(String[] args) throws InterruptedException
	{
		//System.setProperty("webdriver.ie.driver","c:\\IEDriverServer.exe");
  		//WebDriver driver=new InternetExplorerDriver();
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
  		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
  		//Thread.sleep(10000);

  		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
          

  		//Thread.sleep(10000);
  		//child and subchild
    // Set<String> l1=driver.getWindowHandles();
    // System.out.println(l1.size());
        //Alert alert = driver.switchTo().alert();		
        //alert.accept();
     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        try
        {
    		Alert alert=driver.switchTo().alert();
    		System.out.println(alert.getText());
    		//Thread.sleep(10000);
    		alert.sendKeys("akbar");
        	//driver.switchTo().alert().sendKeys("Akbar");
    		alert.accept();
        }
        catch(Exception e)
        {
        	System.out.println("No prompt found");
        }
  		//driver.findElement(By.cssSelector(".checkboxFive]>input")).click();
	}

}
