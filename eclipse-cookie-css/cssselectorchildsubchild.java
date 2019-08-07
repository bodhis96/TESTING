package MainPackage;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselectorchildsubchild
{

	public static void main(String[] args) throws InterruptedException
	{
		//System.setProperty("webdriver.ie.driver","c:\\IEDriverServer.exe");
  		//WebDriver driver=new InternetExplorerDriver();
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
  		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
  		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
          

  		Thread.sleep(7000);
  		//child and subchild
     Set<String> l1=driver.getWindowHandles();
     System.out.println(l1.size());
        //Alert alert = driver.switchTo().alert();		
        //alert.accept();
     
        try
        {
        	Alert a=driver.switchTo().alert();
        	System.out.println(a.getText());
        	a.accept();
        }
        catch(Exception e)
        {
        	System.out.println("No alert found");
        }
  		//driver.findElement(By.cssSelector(".checkboxFive]>input")).click();
  		
	}

}
