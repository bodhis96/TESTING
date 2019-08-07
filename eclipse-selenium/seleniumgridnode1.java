package MainPackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class seleniumgridnode1 
{
   public static int flag1;

 @Test
 // @Parameters("browser")
  public void f() throws MalformedURLException, InterruptedException
  {
  	   

	 //System.setProperty("webdriver.gecko.driver","d:\\geckodriver.exe");
	RemoteWebDriver driver=null;
	   //System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	   	  String nodeUrl = "http://192.168.1.101:4444/wd/hub";

	  
       DesiredCapabilities capability=new DesiredCapabilities();
       capability.setBrowserName("chrome");
       capability.setPlatform(Platform.WINDOWS);
       ChromeOptions o=new ChromeOptions();
	   o.merge(capability);
       driver = new RemoteWebDriver(new URL(nodeUrl),o);

       driver.manage().window().maximize();
       //driver.navigate().to("http:\\www.jetairways.com");
       driver.get("https:\\www.google.com");
      	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

       //driver.get("https://www.watchokart.com");
	//if(driver.getPageSource().contains("Shopping Cart"))
      	
 if(driver.getPageSource().contains("Google offered in"))
       {
          // System.out.println("the text This website uses cookies and similar technologies is present and compatible in chrome browser-No Defect ");
 	      flag1=1;
       }
 else
 {
	 flag1=0;
    // System.out.println("the text This website uses cookies and similar technologies is not present and not compatible in chrome browser-A Defect ");
 }
	 
       //System.out.println(flag2);
       
       
       
   
	  
	  
   } 
}


 