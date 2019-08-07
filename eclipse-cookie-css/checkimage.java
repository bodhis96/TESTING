package MainPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkimage
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
  		driver.get("https:\\www.discovery.com");
 		driver.manage().window().maximize();
 		List<WebElement> li=driver.findElements(By.tagName("img"));
 		int size=li.size();
 		System.out.println(size);
 		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
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
 		
	}

}
