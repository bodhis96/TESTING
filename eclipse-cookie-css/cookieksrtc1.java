package MainPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookieksrtc1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
  		 driver=new ChromeDriver();
    	driver.get("http:\\www.ksrtc.in");
  		driver.findElement(By.linkText("Sign In")).click();
  		Thread.sleep(5000);
  		 driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("mah@yahoo.com");
   		 driver.findElement(By.xpath("//*[@id='password']")).sendKeys("mysore15");
   		driver.findElement(By.xpath("//*[@id='submitBtn']")).click();
  		 File file = new File("c:\\Cookiesksrtc.data");							
        try		
        {	  
            // Delete old file if exists
			file.delete();		
            file.createNewFile();			
            FileWriter fileWrite = new FileWriter(file);							
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);							
            // loop for getting the cookie information 		
            	
            // loop for getting the cookie information 		
            for(Cookie ck : driver.manage().getCookies())							
            {			
                Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
                Bwrite.newLine();             
            }			
            Bwrite.close();			
            fileWrite.close();	
            
        }
        catch(Exception ex)					
        {		
            ex.printStackTrace();			
        }		
	}

}
