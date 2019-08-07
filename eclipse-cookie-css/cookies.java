package MainPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookies 
{
	// WebDriver driver;


	@SuppressWarnings("null")
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		 //WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
  		WebDriver driver=new ChromeDriver();
  		
  		driver.get("http:\\www.ksrtc.in");
  		driver.manage().window().maximize();
  		Thread.sleep(5000);
  		
  		/**
  	    driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
  		//driver.findElement(By.xpath("//*[@id='login']/a[1]")).click();
  		//driver.findElement(By.xpath("//*[@class='col-md-7.col-xs-12.ml-auto.fl-right.phone-no-display']/descendant::li a")).click();
  		//driver.findElement(By.cssSelector("[.'col-md-7.col-xs-12.ml-auto.fl-right.phone-no-display'] li>a")).click();
  		driver.findElement(By.linkText("Sign In")).click();

  		Thread.sleep(2000);
  		 e1=driver.findElement(By.xpath("//*[@id='userName']"));
  		e1.sendKeys("mah@yahoo.com");
  		 e2=driver.findElement(By.xpath("//*[@id='password']"));
  		e2.sendKeys("mysore15");
  		driver.findElement(By.xpath("//*[@id='submitBtn']")).click();
        		
        // create file named Cookies to store Login Information		
        File file = new File("c:\\Cookie.data");							
       	  
            // Delete old file if exists
        	String ss1="mah@yahoo.com";
    		String ss2="mysore15";
			file.delete();		
            file.createNewFile();			
            FileWriter fileWrite = new FileWriter(file);							
            BufferedWriter Bwrite = new BufferedWriter(fileWrite);		
            Cookie c1=new Cookie("name","s1");
            Cookie c2=new Cookie("password","s2");
            driver.manage().addCookie(c1);
            driver.manage().addCookie(c2);
            // loop for getting the cookie information 		
            	
            // loop for getting the cookie information 		
            for(Cookie ck : cookie)							
            {			
            	System.out.println(ck.getName()+"\n"+ck.getValue());
            	//Bwrite.write((ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure()));                Bwrite.newLine();             
            }			
            Bwrite.close();			
            fileWrite.close();	
            */
  		
  		//String name="mah@yahoo.com";
		//String ss2="mysore15";
		
        Cookie name=new Cookie("name","mah@yahoo.com");
        Cookie password=new Cookie("password","mysore15");
        driver.manage().addCookie(name);
        driver.manage().addCookie(password);
        
        //Cookie name1 = new Cookie("mycookie", "123456789123");
		//driver.manage().addCookie(name);
        
        //Cookie cookie = driver.manage().getCookieNamed("name");
       // System.out.println("cookie: " + cookie +"\n");
        //System.out.println("cookie value: " + cookie.getValue().toString() + "\n");
        
        Cookie cookie = driver.manage().getCookieNamed("name");
        System.out.println("cookie: " + cookie);
        System.out.println("cookie value: " + cookie.getValue().toString());
        String n=cookie.getValue();

        
        Cookie cookie1 = driver.manage().getCookieNamed("password");
        System.out.println("cookie: " + cookie1);
        System.out.println("cookie value: " + cookie.getValue().toString());
        String p=cookie1.getValue();
        
  		
  		driver.get("http:\\www.ksrtc.in");
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
  		//driver.findElement(By.xpath("//*[@id='login']/a[1]")).click();
  		//driver.findElement(By.xpath("//*[@class='col-md-7.col-xs-12.ml-auto.fl-right.phone-no-display']/descendant::li a")).click();
  		//driver.findElement(By.cssSelector("[.'col-md-7.col-xs-12.ml-auto.fl-right.phone-no-display'] li>a")).click();
  		driver.findElement(By.linkText("Sign In")).click();

  		Thread.sleep(2000);
  		 WebElement e1=driver.findElement(By.xpath("//*[@id='userName']"));
  		e1.sendKeys(n);
  		 WebElement e2=driver.findElement(By.xpath("//*[@id='password']"));
  		e2.sendKeys(p);
  		driver.findElement(By.xpath("//*[@id='submitBtn']")).click();
  		File file = new File("c:\\Cookie.data");							
     	  
        // Delete old file if exists
		file.delete();		
        file.createNewFile();			
        FileWriter fileWrite = new FileWriter(file);							
        BufferedWriter Bwrite = new BufferedWriter(fileWrite);		
       
        // loop for getting the cookie information 		
        	
        // loop for getting the cookie information 		
       // for(Cookie ck : cookie)							
       // {			
        //	System.out.println(ck.getName()+"\n"+ck.getValue());
        	Bwrite.write((cookie+";"+n+";"+cookie1+";"+p));
        	Bwrite.newLine();             
        //}			
        Bwrite.close();			
        fileWrite.close();	

       // Cookie cookie1 = driver.manage().getCookieNamed("password");
        //System.out.println("cookie: " + cookie1 +"\n");
      //  System.out.println("cookie value: " + cookie1.getValue().toString() + "\n");
        //Set<Cookie> cookie=driver.manage().getCookies();
  		//System.out.println(cookie.size());
        // loop for getting the cookie information 		
        	
        // loop for getting the cookie information 	
        /**
        for(Cookie ck : cookie)							
       {			
        	System.out.println(ck.getName()+"\n"+ck.getValue());
        	String co1=driver.manage().getCookieNamed(c1);
        	System.out.println(driver.manage().getCookieNamed(co1));
        	//Cookie ck = new Cookie("name", "value");
        	//driver.manage().addCookie(ck);
        	
            //return driver.manage().getCookieNamed(name);

        	Cookie cookie = driver.manage().getCookieNamed("cookie");
            System.out.println("cookie: " + cookie +"\n");
            System.out.println("cookie value: " + cookie.getValue().toString() + "\n");

       }			
        */
	}

}
