package MainPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Date;
import java.util.StringTokenizer;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookie4 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		Cookie ck = null;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akbar\\Desktop\\chromedriver.exe");
  		WebDriver driver=new ChromeDriver();
  	     
  		try
  		{
  		File file1 = new File("C:\\Users\\Akbar\\Desktop\\Cookie1.data");							
        FileReader fileReader = new FileReader(file1);							
        BufferedReader Buffreader = new BufferedReader(fileReader);							
        String strline;			
        while((strline=Buffreader.readLine())!=null)
        {									
        StringTokenizer token = new StringTokenizer(strline,";");									
        while(token.hasMoreTokens())
        {					
        String name1 = token.nextToken();					
        String value = token.nextToken();					
        String domain = token.nextToken();					
        String path = token.nextToken();					
        Date expiry = null;	
        
        String val;			
        if(!(val=token.nextToken()).equals("null"))
		{		
        	expiry = new Date();					
        }		
        
        Boolean isSecure = new Boolean(token.nextToken()).	
        booleanValue();	
        	
        ck = new Cookie(name1,value,domain,path,expiry,isSecure);	
      //driver.get("");
      //driver.manage().addCookie(ck);

        System.out.println(ck);
        
        }
        
  		
  		 					
        }		
  		}
  		catch(Exception ex)
        {					
            ex.printStackTrace();			
         }	
   	   
       driver.get("http:\\www.ksrtc.in");
   	   driver.manage().window().maximize();
    	driver.findElement(By.linkText("Sign In")).click();
        driver.manage().addCookie(ck);
   		Thread.sleep(2000);
   	   driver.navigate().refresh();
        
        
	}


	}

