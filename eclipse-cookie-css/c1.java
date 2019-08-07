package MainPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class c1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver;
    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
      	driver = new ChromeDriver();
      	//first module
       //driver.get("http://localhost/nb/a1.asp");
       //modified module
    	driver.get("http://localhost/nb/a2.asp");
    	driver.manage().window().maximize();
    	//first module
       //driver.findElement(By.name("s")).sendKeys("mysore");
       //driver.findElement(By.name("d")).sendKeys("bangalore");
       //modified module
    	driver.findElement(By.name("s1")).sendKeys("mysore");
    	driver.findElement(By.name("d1")).sendKeys("bangalore");
    	Select dropdown = new Select(driver.findElement(By.id("se1")));
        dropdown.selectByValue("Super deluxe");
    	driver.findElement(By.xpath("//input[@value='Search']")).click();
       	Set<String> s=driver.getWindowHandles();
		for(String h:s)
		{
			driver.switchTo().window(h);
			String t=driver.getTitle();
			System.out.println(t);
			
			//WebElement ImageFile = driver.findElement(By.xpath("//img[contains(@id,'Test Image')]"));
			
            
		if(t.equalsIgnoreCase("Search results page"))
		{
			System.out.println("Yes found the window");
			driver.switchTo().window(h);
		  //Thread.sleep(10000);
		  //boolean b=driver.getPageSource().contains("Buses from mysore bangalore as follows");
			boolean b=driver.getPageSource().contains("Buses from mysore  to bangalore and Bus type Super deluxe are as follows");
			System.out.println(b);
			/**
			if(b)
			{
				System.out.println("The input entered on home page is present on the search result module-No Defect");
			}
			else
			{
				System.out.println("The input entered on home page is not present on the search result module-A Defect");
			}
			*/
			
			if(b)
			{
				System.out.println("The input entered on home page is present on the search result modified module-No Defect-Regression testing is passed/modified module is working as designed");
			}
			else
			{
				System.out.println("The input entered on home page is not present on the search result modified module-A Defect-Regression testing is failed/modified module is not working as designed");
			}
			 
    	}
		 

   }
	}
}
	

 




