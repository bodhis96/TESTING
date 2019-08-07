package MainPackage;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert7
{
 	public static void main(String[] args) throws IOException, InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
  		WebDriver driver=new ChromeDriver();
   		driver.get("https://www.google.com");
		driver.manage().window().maximize();
  		driver.findElement(By.linkText("Gmail")).click();
  		//Thread.sleep(5000);
  		//driver.findElement(By.cssSelector("li[class='h-c-header__cta-li g-mail-nav-links--mobile  link--last']>a")).click();
         //driver.findElement(By.cssSelector("ul[class='a-nostyle a-list-link'] li:nth-child(8)>a")).click();
  		driver.findElement(By.linkText("Sign in")).click();
   		Set<String> s=driver.getWindowHandles();
		for(String h:driver.getWindowHandles())
		{
 			System.out.println(h);

			driver.switchTo().window(h);
			String t=driver.getTitle();
			System.out.println(t);
			Boolean flagn=false;
 			if(t.equalsIgnoreCase("Gmail"))
	    	{
			System.out.println("Yes found the window");
			driver.switchTo().window(h);
			driver.manage().window().maximize();
   // driver.findElement(By.xpath("//div[@class='h-c-header__cta h-c-header__cta--tier-two']/ul/li[2]/a[@class='h-c-header__nav-li-link']")).click();
  		driver.findElement(By.cssSelector("input[name='identifier']")).sendKeys("mirakbarhusain");
  		//driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
  		driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
  		try
  		{
   			///html/body/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div/div[1]/div/form/content/section/div/content/div[1]/div/div[1]/div/div[1]/input
  			//Webdriwerwait-Implicit
  			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
  			//Webdriverwait-Explicit
  			//WebDriverWait w=new WebDriverWait(driver,10);
  			//WebElement e11=w.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='Xb9hP']/descendant::input[@name='password']")));
  			driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
WebElement e11=driver.findElement(By.xpath("//div[@class='Xb9hP']/child::input[@name='password']"));
   			//WebElement e1=driver.findElement(By.xpath("//input[@name='password']"));
  	  		System.out.println("Element found");
  	  		e11.sendKeys("usahusain");
  	//WebDriverWait w1=new WebDriverWait(driver,10);
			//WebElement e2=w1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='passwordNext']/content/span")));
				WebElement e10=driver.findElement(By.xpath("//div[@id='passwordNext']/content/span"));
			e10.click();
			driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
	  		Thread.sleep(10000);
		
	 		String t1=driver.getTitle();
	  	System.out.println("title="+t1);
    // break;
  	  		//System.out.println(e11.getAttribute("name"));
  		}
	 	
  		catch(Exception e)
  		{
  	  		System.out.println("Element not found");
   		}
 //driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
   		Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
     String p="Inbox [(][0-9]{1,}[)] - mirakbarhusain@gmail.com - Gmail";
		//String t1=js.executeScript("return document.title;").toString();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
 		String t1=driver.getTitle();
  	System.out.println("titile="+t1);
	 if(t1.matches(p))
	  	{
		  	System.out.println("title is correct -No Defect");
	  	}
	  	else
	  	{
		  	System.out.println("title is not correct -A Defect");
	  	}
 		//driver.manage().timeouts().implicitlyWait(1,TimeUnit.MINUTES);
  //  WebElement  r2=driver.findElement(By.xpath("//div[@id=':kc']/div/div"));
  //r2.click();
  //Runtime.getRuntime().exec("C:\\Users\\Admin\\Desktop\\a1.exe");
 }
		}
	}}
