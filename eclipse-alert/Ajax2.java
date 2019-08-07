package MainPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ajax2 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
  		WebDriver driver=new ChromeDriver();
  		
  		driver.get("https://www.google.com");
		driver.manage().window().maximize();
  		driver.findElement(By.linkText("Gmail")).click();
	   	driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
  		driver.findElement(By.cssSelector("input[id='identifierId']")).sendKeys("mirakbarhusain");
  		//driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
  		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
  		
  	WebElement e11=	driver.findElement(By.xpath("//div[@class='Xb9hP']/descendant::input[@name='password']"));

  		
  		try
  		{
  			
  			///html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[1]/div/div[1]/div/div[1]/input
  			//Webdriwerwait-Implicit
  			//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
  			//Webdriverwait-Explicit
  			//WebDriverWait w=new WebDriverWait(driver,10);
  			//WebElement e11=w.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='Xb9hP']/descendant::input[@name='password']")));
  			//driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);

  			
  			//WebElement e11=driver.findElement(By.xpath("//div[@class='Xb9hP']/descendant::input[@name='password']"));
  			
  			//WebElement e1=driver.findElement(By.xpath("//div[@class='Xb9hP']/descendant::input[@name='password']"));
  	  		System.out.println("Element found");
  	  		e11.sendKeys("usahusain");
  	  		
  	  		
  	  	WebDriverWait w1=new WebDriverWait(driver,10);
			WebElement e22=w1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='passwordNext']/content/span")));
			e22.click();

  	  		//System.out.println(e11.getAttribute("name"));
  		}
  		catch(Exception e)
  		{
  	  		System.out.println("Element not found");

  		}
			
  		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
  		//driver.findElement(By.cssSelector("div[class='z0']>div")).click();
  		
  		
  		//driver.findElement(By.xpath("//div[@position='position: relative; min-height: 100%;']/div[2]/div/div[2]/descendant::div[@class='Ls77Lb aZ6']/div[2]/descendant::div[@class='T-I or J-J5-Ji or T-I-KE or L3']")).click();
  	//String r=driver.findElement(By.xpath("//*[@class='T-I or J-J5-Ji or T-I-KE or L3' and @gh='cm']")).getAttribute("role");
  	//System.out.println(r);
  		//try
  		//{
  			//WebDriverWait w1=new WebDriverWait(driver,20);
  			//WebElement e11=w1.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".T-I-KE1")));
        	//String r1=driver.findElement(By.cssSelector("div[class='T-I-KE']")).getAttribute("role");
        	//System.out.println("Element found");
  		//driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
  		//WebDriverWait w1=new WebDriverWait(driver,180);
		//WebElement e22=w1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id=':kc']/div/div")));
  		//e22.click();
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);

   WebElement  r2=driver.findElement(By.xpath("//div[@id=':kc']/div/div"));
  //r2.click();
  //Runtime.getRuntime().exec("C:\\Users\\Admin\\Desktop\\a1.exe");
driver.manage().timeouts().setScriptTimeout(2, TimeUnit.MINUTES);
		JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeAsyncScript("arguments[0].click;",r2);


	

  
 	//System.out.println(r2.getAttribute("class"));

  		//}
  		//catch(Exception e)
  		//{
  			//System.out.println("Element not found");
  		//}
	//css=.T-I-KE 	
	//driver.findElement(By.cssSelector("input[id='identifierId']")).sendKeys("mirakbarhusain");

          	//.T-I-KE
  	//#\3a k2 > div > div
		//	WebElement e11=w.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='Xb9hP']/descendant::input[@name='password']")));
  	//*[@id=":kc"]/div/div
  		
  		
  		
  		

  		
  		
  		

  		//driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();

	}

}
