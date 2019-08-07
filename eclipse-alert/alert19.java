package MainPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alert19
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
  		WebDriver driver=new ChromeDriver();
  	//*[@id="banking"]/div[2]/div/div/div/span/div/div/ul/li[2]/a
  		driver.get("https://www.onlinesbi.com/");
		driver.manage().window().maximize();
		
		
  		WebElement e21=driver.findElement(By.xpath("//button[@class='btn dropdown-toggle btn-default']"));
          e21.click();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebDriverWait w1=new WebDriverWait(driver,20);
		WebElement e1=w1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='dropdown-menu open']/ul/li[2]/a")));
  		//WebElement e1=driver.findElement(By.xpath("//*[@id=\"banking\"]/div[2]/div/div/div/span/div/div/ul/li[2]/a"));
        e1.click();
	  	//driver.findElement(By.cssSelector("a:contains('Corporate')")).click();

  		//Thread.sleep(2000);
		//tag and class
  		driver.findElement(By.cssSelector(".corp_login")).click();
		
		
		//dropdown-menu inner

  		//Tag and attribute
  		//driver.findElement(By.cssSelector("a[class='corp_login']")).click();
  		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
  		Thread.sleep(2000);

      try
      {
        driver.switchTo().alert().accept();
        System.out.println("found alert");
      }
      catch(Exception e)
      {
    	  
      }
  		//Tag, Class And Attribute:
  		//driver.findElement(By.cssSelector("a.corp_login[@href='javascript:void(0);']")).click();
       //SUB-STRING MATCHES:starts-with;enmds-with;contains
  		//driver.findElement(By.cssSelector("a[class^='corp']")).click();
  		//driver.findElement(By.cssSelector("a[class$='login']")).click();
  		//driver.findElement(By.cssSelector("a[class*='corp']")).click();
  		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
  	//	driver.findElement(By.cssSelector("a:contains('corp')")).click();


	}

}
