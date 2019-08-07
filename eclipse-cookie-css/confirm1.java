package MainPackage;

 

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirm1
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
  		driver.get("C:\\Users\\Admin\\Desktop\\capgecase.html");
 		 
  		//Thread.sleep(10000);

  		driver.findElement(By.id("t1")).click();
          

  		 
        try
        {
     		Alert alert=driver.switchTo().alert();
    		String text=alert.getText();
    		if(text.equalsIgnoreCase("sorry user you cannot update model"))
    		{
    			System.out.println("when user tried to update model he got message sorry-no defect");
    		}
    		else
    		{
    			System.out.println("when user tried to update model he did not got message sorry-a defect");
    		}
    		 alert.accept();
     		
     		
     		
       }
        catch(Exception e)
        {
        	System.out.println("No prompt found");
        }
        
       if(driver.getPageSource().contains("sorry user you cannot update model"))	
		{
			System.out.println("when user tried to update model he got message sorry-no defect");
		}
		else
		{
			System.out.println("when user tried to update model he did not got message sorry-a defect");
		}  
        
        
        //driver.findElement(By.cssSelector(".checkboxFive]>input")).click();
	}

}
