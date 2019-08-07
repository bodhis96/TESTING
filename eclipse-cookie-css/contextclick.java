package MainPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class contextclick 
{

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
  		//WebDriver driver=new ChromeDriver();
		System.setProperty("webdriver.ie.driver","C:\\IEDriverServer.exe");
  		WebDriver driver=new InternetExplorerDriver();
  		
  		//driver.get("https://www.google.com");
		//System.setProperty("webdriver.gecko.driver","d:\\geckodriver.exe");
  		//WebDriver driver=new FirefoxDriver();
  		//for mozilla
		//driver.get("https:\\www.google.com");
        //for IE 
  		driver.get("https://www.google.com");
  		WebElement e1=driver.findElement(By.linkText("Gmail"));
  		
  		
  		
  		
  		
		driver.manage().window().maximize();
		
		Actions a=new Actions(driver);
		//open link in new tab context menu
        a.moveToElement(e1).contextClick(e1).sendKeys(Keys.chord(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER)).build().perform();
       // a.moveToElement(e1).contextClick(e1).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();

        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

       WebElement e2=driver.findElement(By.xpath("//*[contains(text(),'Open Link in New Tab')]"));

       // a.sendKeys(Keys.chord(Keys.ARROW_DOWN,Keys.ENTER));
       // System.Forms.SendKeys.SendWait("{UP}");
       
        //WebElement clickMeElement = driver.findElement(By.cssSelector("div.context-menu-one.box.menu-1"));
      //  WebElement editMenuItem = driver.findElement(By.cssSelector("li.context-menu-item.icon-edit"));

       // Actions builder = new Actions(driver);
       // builder.contextClick(clickMeElement)
       //  .moveToElement(editMenuItem)
        //  .click()
        //  .perform();

       // WebDriverWait wait = new WebDriverWait(driver, 10);

        //Alert alert =...

        

        
  		Set<String> s=driver.getWindowHandles();
		System.out.println(s.size());
		int c=1;
		int flag=0;
  		for(String h:s)
		{
			driver.switchTo().window(h);
			String t=driver.getTitle();
			System.out.println(t);
			driver.manage().window().maximize();

		}
			/**
			if(t.equalsIgnoreCase("Flipkart Customer Care & Help Center"))
			{
	  		 //System.out.println("Found");
				flag=1;
				c++;
			}
			//c++;
		}
  		/**
  		 if(flag==1 && c==2)
  		 {
  			 System.out.println("Link is opening in a new tab and position="+c+""+"No defect keyboard events are working fine with this web site");
  		 }
  		 else
  		 {
  			 System.out.println("Link is not opening in a new tab and rerspective position="+c+""+"A defect keyboard events are not working fine with this web site");

  		 }
  		 */
  	int size = driver.findElements(By.tagName("iframe")).size();
  	System.out.println(size);
  	System.out.println(driver.manage().window().getSize()); 


	}

}
