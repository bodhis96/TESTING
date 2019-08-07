package MainPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert10 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akbar\\Desktop\\chromedriver.exe");
	 	WebDriver driver=new ChromeDriver();
 		driver.manage().window().maximize();
	 	driver.get("C:\\Users\\Admin/Desktop\\sa2.html");
	 	//Thread.sleep(60000);
	 	//driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
//WebElement e2=driver.findElement(By.xpath("//input[@name='btnK']"));
	 	WebElement e2=driver.findElement(By.xpath("//input[@value='Hello Akbar']"));
	 //	WebElement e2=driver.findElement(By.xpath("//input[@value='Google Search' and @name='btnK']"));

	//Thread.sleep(30000);
     //WebDriverWait w1=new WebDriverWait(driver,50);
	//WebElement e22=w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Google Search']")));
	//System.out.println(e2.getAttribute("name"));

e2.click();
try
{
	Alert alert=driver.switchTo().alert();
	System.out.println(alert.getText());
	//Thread.sleep(10000);
 	alert.accept();
}
catch(Exception e)
{
	System.out.println("No prompt found");
}
	}
}
