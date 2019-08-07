package MainPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class autocomplete 
{
	public static void main(String[] args) throws InterruptedException
	{
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Akbar\\Desktop\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http:\\www.google.com");
	    driver.manage().window().maximize();
	    driver.findElement(By.name("q")).sendKeys("selenium");
	   // try
	  //  {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//ul[@role='listbox']//li")));
		java.util.List<WebElement> l = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		System.out.println("Number of items in autosuggest list are=" + l.size());	
	  //  }
	  //  catch(Exception e)
	  //  {
	//		System.out.println("No such ");	

	  //  }
		Thread.sleep(10000);
		for(int i = 0 ;i<l.size();i++)
		{
			System.out.println(l.get(i).getText());
			
			if(l.get(i).getText().equalsIgnoreCase("selenium interview questions"))
			{
		      //System.out.println("found");
				l.get(i).click();
				break;
			}
		}
		
		
	}

}
