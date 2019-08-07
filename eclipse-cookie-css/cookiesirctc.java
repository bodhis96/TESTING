package MainPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

abstract class cookiesirctc
{

	public static void main(String[] args) 
	{
		WebDriver driver;	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
  		 driver=new ChromeDriver();
                 
		driver.get("http://www.irctc.co.in");
        driver.manage().window().maximize();

        driver.findElement(By.id("loginText")).click();							
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        /**
		String url = driver.findElement(By.id("captchaImg")).getAttribute("src");
	    driver.navigate().to(url);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        String text = driver.findElement(By.xpath("/html/body/img")).getAttribute("src");

 	    
	    
		System.out.println(text);

		int firstinteger= Integer.parseInt(text.substring(0, 2));
		int secondinteger= Integer.parseInt(text.substring(5, 6));
		int calc= firstinteger+secondinteger;
		String final_value= String.valueOf(calc);
		System.out.println(final_value);
     */  				
        // Input Email id and Password If you are already Register		
        driver.findElement(By.name("userId")).sendKeys("mirakbarhusain");							
        driver.findElement(By.name("pwd")).sendKeys("Indian69");					
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        /**
        WebElement e1 = driver.findElement(By.cssSelector(".search_btn"));	
        Point el = e1.getLocation();
         int x = e1.getLocation().getX();
         int y =e1.getLocation().getY();
        JavascriptExecutor js =(JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(308,40)");
        e1.click();
        
        */
        driver.findElement(By.xpath("//*[text()='SIGN IN']")).click();					
   

        
        // create file named Cookies to store Login Information		
        File file = new File("c:\\Cookiesirctc.data");							
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
