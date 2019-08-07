package MainPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ibm6
{

	public static void main(String[] args)
	{
		Boolean flag1=false;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.spicejet.com");
		d.manage().window().maximize();
 		Select s = new Select(d.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
	    s.selectByVisibleText("USD");
	    List<WebElement> l = s.getOptions();
	    int si=l.size();
	    System.out.println("Total  number of options in drop down labelled currency are "+si);
	    for(int i = 0; i < l.size(); i++)
	    {
	    	String t=l.get(i).getText();
	    	 System.out.println(l.get(i).getText());
	    	 
	    	 if(t.matches("(?i)INR||AED||USD"))
	           {
	                 flag1=true;
			   } 
	    	 else
	    	 {
                 flag1=false;

	    	 }
			    	 
	    }
	    if(flag1)
        {
	    	 System.out.println("all the items in drop down as specified by client the developer has put-No Defect");
		   } 
	    else
	    {
	    	 System.out.println("some of all the items in drop down as specified by client the developer has not put-A Defect");
		   } 
		  // WebElement r1= d.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']"));
	    WebElement r1= d.findElement(By.cssSelector("#ctl00_mainContent_view_date2"));
				  System.out.println(r1.isEnabled());  

			  		  
			  
	    d.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

	    
	    
	    WebElement r15= d.findElement(By.cssSelector("#ctl00_mainContent_view_date2"));
		  System.out.println(r15.isEnabled());  
		  
	  if(r15.isEnabled())
 	        {
		    	 System.out.println("return date got enabled after selecting round trip-No Defect");
			   } 
		    else
		    {
		    	 System.out.println("return date did  not enable after selecting round trip-A Defect");
			   } 
	    
	    
     }
 }
