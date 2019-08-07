package MainPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ibm3 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http:\\www.google.com");
		d.manage().window().maximize();
		//WebElement e21=d.findElement(By.name("q"));
		//WebElement e21=d.findElement(By.xpath("//*[@class='gLFyf gsfi' and @name='q']"));
		WebElement e21=d.findElement(By.cssSelector("input.gLFyf[name='q']"));

		e21.sendKeys("flights");

		
		//Actions a=new Actions(d);
		WebElement e1=d.findElement(By.linkText("Gmail"));
		//String t=d.getTitle();
		//System.out.println(t);
		e1.click();
		//Thread.sleep(10000);
		WebElement e2=d.findElement(By.partialLinkText("Sign"));
		e2.click();
		boolean b=d.getPageSource().contains("Sign in");
		

          
      
				//System.out.println(b);
				if(b)
				{
					 System.out.println("on clicking the partial link Sign the Login module appeared on screen-No Defect");
				}
					 else
					 {
						 System.out.println("on clicking the partial link Sign the Login module did not appeared on screen-A Defect");

					 }
      
	}

}
