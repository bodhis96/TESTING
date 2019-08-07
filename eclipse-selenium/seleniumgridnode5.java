package MainPackage;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class seleniumgridnode5 
{
 @Test
 // @Parameters("browser")
  public void f() throws MalformedURLException, InterruptedException
  {
  	   //System.setProperty("webdriver.gecko.driver","d:\\geckodriver.exe");
	RemoteWebDriver driver=null;
	   //System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	   	  String nodeUrl = "http://localhost:4444/wd/hub";

	  
       DesiredCapabilities capability = new DesiredCapabilities();
       capability.setBrowserName("chrome");
       capability.setPlatform(Platform.WINDOWS);
	   ChromeOptions o = new ChromeOptions();
	   o.merge(capability);
         
       driver = new RemoteWebDriver(new URL(nodeUrl),o);
       driver.manage().window().maximize();
       driver.navigate().to("http:\\www.jetairways.com");
       
       
       
   
	  
	  
   } 
}


 