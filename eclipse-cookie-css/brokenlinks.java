package MainPackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlinks
{

	public static void main(String[] args)
	{
       String href = null;
       boolean flag=false;

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akbar\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https:\\www.whitehouse.gov");
		driver.manage().window().maximize();
	     List<WebElement> e1 = driver.findElements(By.tagName("a"));
	     int s=e1.size();
    	 System.out.println("Number of Links in the website whitehouse.com are"+s+""+"\n");

	     for(int i=0;i<s;i++)
	     {
	    	 href=e1.get(i).getAttribute("href");
	       //System.out.println(href+"\n");
	     
	     
	     
	     try {
			HttpURLConnection httpc = (HttpURLConnection)(new URL(href).openConnection());
             
             httpc.setRequestMethod("HEAD");
             
             httpc.connect();
             
             int responseCode = httpc.getResponseCode();
             
             if(responseCode == 200)
             {
            	 flag=true;
                 //System.out.println(href+" is  not a broken link");
             }
             else if(responseCode == 300)
             {
            	 flag=false;
                 //System.out.println(href+" input redirection");
             }
             else if(responseCode == 400)
             {
            	 flag=false;
                 //System.out.println(href+" browserr error");
             }
             else if(responseCode == 500)
             {
            	 flag=false;
            	 System.out.println(href+" server error");
             }
             //System.out.println(responseCode); 
             
         } 
	    
	     catch (MalformedURLException e)
	     {
             e.printStackTrace();
            System.out.println(e.getMessage()); 

         }
	     
	     catch (IOException e)
	     {
             System.out.println(e.getMessage()); 
             e.printStackTrace();
         }
	     }
	     if(flag)
	     {
             System.out.println("There are no broken link in the website www.whitehouse.com-No Defect"); 

	     }
	     else
	     {
             System.out.println("There are  broken links in the website www.whitehouse.com-A Defect"); 

	     }
	     
	     
	}

}
