package MainPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajax1
{

	public static void main(String[] args) 
	{
		WebDriver driver = null;
 		System.setProperty("webdriver.chrome.driver","C:\\Users\\\\Admin\\Downloads\\chromedriver.exe");
 		driver = new ChromeDriver();
  		driver.get("https:\\www.nyse.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Login")).click();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[@class='selectbox-typeahead']/input")).click();
		driver.findElement(By.xpath("//ul[@class='selectbox-options']/li[2]")).click();
		driver.findElement(By.partialLinkText("Register for NYSE")).click();


 		
	}

}
