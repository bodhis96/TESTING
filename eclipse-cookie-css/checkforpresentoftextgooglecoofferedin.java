package MainPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class checkforpresentoftextgooglecoofferedin 
{

	public static void main(String[] args) 
	{
		WebDriver driver=null;

		//System.setProperty("webdriver.gecko.driver","d:\\geckodriver.exe");
		/**
		WebDriver driver=null;
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
           driver=new ChromeDriver();
		  
 	       
		System.setProperty("webdriver.gecko.driver","d:\\geckodriver.exe");
		  driver=new FirefoxDriver();
	       driver.get("https:\\www.google.com");
	      	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 */
		 System.setProperty("webdriver.ie.driver","C:\\IEDriverServer.exe");
		  driver=new InternetExplorerDriver();
		  driver.get("https://www.google.com");
	      	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 if(driver.getPageSource().contains("Google offered in"))
	       {
	           System.out.println("the text This website uses cookies and similar technologies is present and compatible in chrome browser-No Defect ");
 	       }
	 else
	 {
	     System.out.println("the text This website uses cookies and similar technologies is not present and not compatible in chrome browser-A Defect ");
	 }
		 
	       //System.out.println(flag2);
	       
	       
	       
	   
	}

}
