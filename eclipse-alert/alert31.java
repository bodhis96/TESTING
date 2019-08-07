package MainPackage;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
public class alert31 
{
	public static void main(String[] args) 
	{
		 
		System.setProperty("webdriver.ie.driver","C:\\IEDriverServer.exe");
  		WebDriver driver=new InternetExplorerDriver();
  		driver.get("https://www.google.com");
  		WebElement e1=driver.findElement(By.linkText("Gmail"));
        driver.manage().window().maximize();
		Actions a=new Actions(driver);
		//open link in new tab context menu
       //a.moveToElement(e1).contextClick(e1).sendKeys(Keys.chord(Keys.ARROW_DOWN,Keys.ENTER)).build().perform();
      a.moveToElement(e1).contextClick(e1).sendKeys(Keys.chord(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER)).build().perform();
       // a.moveToElement(e1).contextClick(e1).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
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
}

}
