package MainPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class alert33 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
	 	driver.get("https://www.bankofindia.co.in");

 		driver.manage().window().maximize();
	 	
	 	 Thread.sleep(10000);
	 	WebElement e2=driver.findElement(By.xpath("//ul[@class='mobile-sub wsmenu-list']/li[@class='menu-arrow-1']/a"));
Actions a=new Actions(driver);
a.moveToElement(e2).clickAndHold().build().perform();


	WebElement e21=driver.findElement(By.xpath("//ul[@class='menu-sec-le']/li[2]/a"));
//e21.click();
 
Actions a1=new Actions(driver);
a1.moveToElement(e21).clickAndHold().build().perform();
	 	
WebElement e214=driver.findElement(By.xpath("//ul[@class='menu-third-l menu-third-single']/li/a[1]"));
Actions a12=new Actions(driver);
a12.moveToElement(e214).click().build().perform();
	 	

  
	}
}
