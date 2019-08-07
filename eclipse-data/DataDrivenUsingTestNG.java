package MainPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataDrivenUsingTestNG
{
  @Test(dataProvider="d")
  public void f(String name, String password) throws InterruptedException
  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akbar\\Desktop\\chromedriver.exe");
  		WebDriver driver=new ChromeDriver();
        driver.get("http://www.ksrtc.in/oprs-web/");
  		Thread.sleep(2000);
  	  //driver.findElement(By.xpath("//*[@id='login']/a[1]")).click();
  		driver.findElement(By.linkText("Sign In")).click();
  		Thread.sleep(2000);
  		driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(name);
  		driver.findElement(By.xpath("//*[@id='password']")).sendKeys(password);
  		driver.findElement(By.xpath("//*[@id='submitBtn']")).click();
  		driver.manage().window().maximize();
  		if(name.equalsIgnoreCase("mah@yahoo.com") && password.equalsIgnoreCase("mysore15"))
  		{
  			   Thread.sleep(15000);
  		    System.out.print("welcome to lasvegas akbar");
  		    System.out.print("\n");
  boolean a=driver.findElement(By.linkText("Logout")).isDisplayed();
  		    if(a) 
  		    {
  		        System.out.println("login success for valid name  and valid password No defect");

  		    }
  		    else
  		    {
  		        System.out.println("login not success for valid name  and valid password A defect");
  		    }
  		  driver.findElement(By.linkText("Logout")).click();
  		    driver.close();
  		}

  		if(name.equalsIgnoreCase("mah@yahoo.com") && password.equalsIgnoreCase("mysore16"))
  		{
  		  if(driver.getPageSource().contains("Login incorrect. Please try again"))
  		    {
  		        System.out.println("login not success for valid name  and in valid password No defect");

  		    }
  		    else
  		    {
  		        System.out.println("login  success for valid name  and in valid password A defect");
  		        
  		    }
  			 driver.close();
  		}
  		
  		
   }
@DataProvider(name="d")
public Object[][] getdata()
{
	return new Object[][]
			{{"mah@yahoo.com","mysore15"},{"mah@yahoo.com","mysore16"},};
}
}
