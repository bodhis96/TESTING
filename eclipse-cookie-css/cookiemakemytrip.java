package MainPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookiemakemytrip
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
  		 driver=new ChromeDriver();
                 
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
       // driver.manage().timeouts().pageLoadTimeout(1,TimeUnit.MINUTES);       				
        // Input Email id and Password If you are already Register		
        driver.findElement(By.xpath("//a[@id='ch_login_icon']/child::span[2]")).click();	
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);       				

        driver.findElement(By.id("ch_login_email")).sendKeys("mirakbarhusain@gmail.com");							
        driver.findElement(By.id("ch_login_password")).sendKeys("indian69@");		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // Thread.sleep(10000);

        driver.findElement(By.id("ch_login_btn")).click();							
      //Thread.sleep(10000);
        // create file named Cookies to store Login Information		
        File file = new File("c:\\Cookiesmakemytrip.data");							
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
                System.out.println((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));
                System.out.println("welcome");
                Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));																									
                Bwrite.newLine();             
            }			
            Bwrite.close();			
            fileWrite.close();	
            
        }
        catch(Exception ex)					
        {		
            ex.printStackTrace();			
        }			}

}
