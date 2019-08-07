package MainPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookiecookiebut
{

	public static void main(String[] args) 
	{
		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
  		 driver=new ChromeDriver();
                 
		driver.get("https://manage.cookiebot.com/en/login");
		driver.manage().window().maximize();
       // driver.manage().timeouts().pageLoadTimeout(1,TimeUnit.MINUTES);       				
        // Input Email id and Password If you are already Register		
        driver.findElement(By.id("pageloginemail")).sendKeys("mirakbarhusain@ymail.com");	
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);       				

        driver.findElement(By.id("pageloginpassword")).sendKeys("mysore15");							
        
       // Thread.sleep(10000);

        driver.findElement(By.id("pagesubmitLoginButton")).click();							
      //Thread.sleep(10000);
        // create file named Cookies to store Login Information		
        File file = new File("c:\\Cookiescookiebut.data");							
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
        }
	}

}
