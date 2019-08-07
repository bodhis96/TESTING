package MainPackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class seleniumgridnode2
{
  public static int flag2;
  @Test
  public void f() throws MalformedURLException
  {
	  RemoteWebDriver driver=null;
	   //System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	   	  String nodeUrl = "http://192.168.1.101:4444/wd/hub";
      DesiredCapabilities capability = new DesiredCapabilities();
      capability.setBrowserName("firefox");
      capability.setPlatform(Platform.WINDOWS);
	   FirefoxOptions o = new FirefoxOptions();
 	   o.merge(capability);
       driver = new RemoteWebDriver(new URL(nodeUrl),o);
      driver.manage().window().maximize();
      driver.get("https:\\www.google.com");
	  	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

      //driver.get("https://www.watchokart.com");
      // if(driver.getPageSource().contains("Shopping Cart"))
	 
      if(driver.getPageSource().contains("Google offered in"))
      {
        //System.out.println("the text This website uses cookies and similar technologies is present and compatible in firefox browser-No Defect ");
	      flag2=1;
      }
else
{
	flag2=0;
    //System.out.println("the text This website uses cookies and similar technologies is not present and not compatible in firefox browser-A Defect ");
}
	//System.out.println(flag2);
      
     
  }
}
