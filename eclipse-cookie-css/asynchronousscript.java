package MainPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class asynchronousscript 
{

	public static void main(String[] args) 
	{
		
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
  		   WebDriver driver=new ChromeDriver();
		   driver.get("http://www.google.com");
  		   driver.manage().window().maximize();
   		   WebElement e1= driver.findElement(By.linkText("Gmail"));
   		   e1.click();
 		  // driver.manage().timeouts().setScriptTimeout(-2,TimeUnit.SECONDS);
 		   
 		  
		   JavascriptExecutor js = (JavascriptExecutor) driver;
		  // js.executeAsyncScript("alert('hello world');");
		   //js.executeAsyncScript("c=alert('hello world');window.setTimeout(c, 25000);");
   		   System.out.println("welcome");

   		 ((JavascriptExecutor) driver).executeAsyncScript("window.setTimeout(arguments[arguments.length - 1], 500);");

		  // js.executeAsyncScript("var callback = alert('\"+selectBook+\"' book does not exist'); window.setTimeout(callback, 25000);");

		  // js.executeAsyncScript("var callback = arguments[0].click; window.setTimeout(callback, 25000);");

	     //js.executeAsyncScript("var callback = arguments[arguments.length - 1]; window.setTimeout(callback, 25000);");
	}
}


