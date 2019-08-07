package MainPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkforimage2 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
  		driver.get("file:///C:/Users/Admin/Desktop/a1.html");
 		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
 		driver.manage().window().maximize();
 		//boolean e2=driver.getPageSource().contains("image not present"));
 	    WebElement e1 = driver.findElement(By.tagName("img"));
 	    String alt=e1.getAttribute("alt");
 		/**
 		if(alt.)
 		{
		    	System.out.println("image is not present -A Defect");

 		}
 		else
 		{
	    		System.out.println("image is present -No defect");

 		}
 		/**
        boolean flag=false;
 		for(int i=0;i<size;i++)
 		{
    		if(li.get(i).getAttribute("src").equalsIgnoreCase("https://api.discovery.com/v1/images/589b53d86b66d135760830cb?aspectRatio=original&width=105&height=&key=3020a40c2356a645b4b4"))
 	    	{
 		    	flag=true;
 		    	break;
 			//System.out.println("image is present -No defect");
 	    	}
 		else
 		    {
 			flag=false;
 			//System.out.println("image is not present -A Defect");
 		    }
 		}
 		   if(flag)
 	    	{
 	    		System.out.println("image is present -No defect");
 		    }
 		      else
		    {
 		    	System.out.println("image is not present -A Defect");
		    }
		    */
 		
	}

}
