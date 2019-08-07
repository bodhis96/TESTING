package MainPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ibm10
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akbar\\Desktop\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com");
		d.manage().window().maximize();
		Boolean flag=false;
		Boolean flagp=false;

		List <WebElement> l = d.findElements(By.tagName("a"));
		 System.out.println("Total Number of links present on the google home page are "+l.size());
		 for(int i = 0; i < l.size(); i++)
		 {
		    System.out.println(l.get(i).getText());
		    if(l.get(i).getText().equalsIgnoreCase("Gmail"))
		    {
		    	flag=true;
		    }
   	     }
		 
		 if(flag)
		    {
			    System.out.println("Gmail link is present on Google home page-No Defect");
		    }
		 else
		 {
			    System.out.println("Gmail link is not present on Google home page-A Defect");
		    }
		 
			WebElement  l1 = d.findElement(By.name("q"));
			l1.sendKeys("cars");
			WebDriverWait wait = new WebDriverWait(d, 15);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnK")));
		  String ariallabel=d.findElement(By.name("btnK")).getAttribute("aria-label");
		  if(ariallabel.matches("Google Search"))
		    {
				 System.out.println("arai label is correct-No Defect");
		    }
		    else
		    {
				 System.out.println("arai label is not correct-A Defect");
		    }	 
			
			 String st1="New Cars in India 2019 | New Car Information | Best New Cars ...";

			d.findElement(By.name("btnK")).click();
		    List <WebElement> l2 = d.findElements(By.cssSelector("h3.LC20lb"));
			 System.out.println("Total Number of links present on the google search result page after google search for cars are"+l.size());
			 for(int i = 0; i < l2.size(); i++)
			 {
 
			    //System.out.println(l2.get(i).getText());
			    if(l2.get(i).getText().equalsIgnoreCase(st1))
			    {
                   flagp=true;	
                   break;
                 }
			    else
			    {
	                   flagp=false;	

			    }
			     
		     }	    
			 if(flagp)
			    {
 					 System.out.println("Google search engine is working fine it contains the first link with cars-No Defect");
			    }
			    else
			    {
					 System.out.println("Google search engine is not working fine it dosnt contains the first link with cars-A Defect");
			    }

		 
			  
		 
     }
}
