package MainPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssselectortagidtagclassetc
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
  		WebDriver driver=new ChromeDriver();
  		
  		driver.get("https://www.onlinesbi.com/");
		driver.manage().window().maximize();
  		//Thread.sleep(2000);
		//tag and class
  		//driver.findElement(By.cssSelector(".corp_login")).click();
  		//Tag and attribute
  		driver.findElement(By.cssSelector("a[class='corp_login']")).click();

  		//Tag, Class And Attribute:
  		//driver.findElement(By.cssSelector("a.corp_login[@href='javascript:void(0);']")).click();
       //SUB-STRING MATCHES:starts-with;enmds-with;contains
  		//driver.findElement(By.cssSelector("a[class^='corp']")).click();
  		//driver.findElement(By.cssSelector("a[class$='login']")).click();
  		//driver.findElement(By.cssSelector("a[class*='corp']")).click();
  		driver.findElement(By.cssSelector("a:contains('corp')")).click();


	}

}
