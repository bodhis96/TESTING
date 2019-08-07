
package MainPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ibm1 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akbar\\Desktop\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http:\\www.google.com");
		d.manage().window().maximize();
		//Actions a=new Actions(d);
		WebElement e1=d.findElement(By.linkText("Gmail"));
		//String t=d.getTitle();
		//System.out.println(t);
		e1.click();
		Thread.sleep(10000);
		//WebElement e2=d.findElement(By.linkText("Sign In"));
		String t=d.getTitle();
				System.out.println(t);
				if(t.equalsIgnoreCase("Gmail - Free Storage and Email from Google"))
				{
					 System.out.println("on clicking the link Gmail the module with title Gmail free storage appeared on screen-No Defect");
				}
					 else
					 {
						 System.out.println("on clicking the link Gmail the module with title Gmail free storage did not appeared on screen-A Defect");

					 }
      
		
	}

}
