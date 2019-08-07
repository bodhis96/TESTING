package MainPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alert
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
  		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
 		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
  		//Thread.sleep(10000);

  		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
          

  		 
     driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
     WebDriverWait w1=new WebDriverWait(driver,10);
	//w1.until(ExpectedConditions.alertIsPresent());
     String m = null; 
        try
        {
        	w1.until(ExpectedConditions.alertIsPresent());
    		Alert alert=driver.switchTo().alert();
    		 m=alert.getText();
    		System.out.println(alert.getText());
    		Thread.sleep(5000);
        	System.out.println("alert appeared after clicking button -No Defect");

     		alert.accept();
     		
     		
     		
        }
        catch(Exception e)
        {
        	System.out.println("alert did not mappeared after cliking button -A Defect");
        }
  	if(m.matches("I am an alert box!"))	
  	{
  		System.out.println("NO defect the developer has put an alert with that text");
  	}
  	else
  	{
  		System.out.println("A defect the developer has not put an alert with that text");
  	}
        
        
        //driver.findElement(By.cssSelector(".checkboxFive]>input")).click();
	}

}
