package MainPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class alert12
{

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.spicejet.com");
		driver.manage().window().maximize();
		//Thread.sleep(10000);
		WebElement e1=driver.findElement(By.cssSelector("#ctl00_HyperLinkLogin"));
		Actions a=new Actions(driver);
		a.moveToElement(e1).clickAndHold(e1).build().perform();
		//a.build().perform();
	 	WebElement e2=driver.findElement(By.xpath("//li[@class='hide-mobile']/a[text()='SpiceClub Members']"));

//WebElement e2;
//e2=driver.findElement(By.cssSelector("li.hide-mobile:nth-child a"));
a.moveToElement(e2).clickAndHold(e2).build().perform();


WebElement e3=driver.findElement(By.xpath("//li[@class='hide-mobile']/ul/li/a[text()='Member Login']"));

//e3=driver.findElement(By.cssSelector("li.hide-mobile ul:nth-of-type(1) li:nth-child(2) > a"));
a.moveToElement(e3).click(e3).build().perform();		
	}

}


