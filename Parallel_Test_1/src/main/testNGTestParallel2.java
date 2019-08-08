package main;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNGTestParallel2
{
	  WebDriver driver;
	  @BeforeTest(alwaysRun=true)
	  @Parameters("browser")
	  public void choose(String browser)
	  {
		  if(browser.equalsIgnoreCase("chrome"))
		  {
			  System.setProperty("webdriver.chrome.driver","D:\\BODHI_2\\Java2\\LIBRARIES\\webdrivers\\chromedriver.exe");
			  driver=new ChromeDriver();

			  System.out.println("starting chrome");

		  }
		  else if(browser.equalsIgnoreCase("firefox"))
		  {
			  System.setProperty("webdriver.gecko.driver","D:\\BODHI_2\\Java2\\LIBRARIES\\webdrivers\\geckodriver.exe");
			  driver=new FirefoxDriver();

			  System.out.println("starting firefox");
		  }
		  else if(browser.equalsIgnoreCase("internet explorer"))
		  {
			  System.setProperty("webdriver.ie.driver","D:\\BODHI_2\\Java2\\LIBRARIES\\webdrivers\\IEDriverServer.exe");
			  driver=new InternetExplorerDriver();

			  System.out.println("starting internet explorer");
		  }
	  }
	
	
	
	  @Test
	  public void login() throws IOException  
	  {
		  //----------------------------------
		  driver.get("https://www.google.com");
		  driver.manage().window().maximize();
		  driver.findElement(By.linkText("Gmail")).click();
		  driver.manage().timeouts().implicitlyWait(150,TimeUnit.SECONDS);
		  driver.findElement(By.xpath("/html/body/nav/div/a[2]")).click();
		  driver.findElement(By.cssSelector("input[id='identifierId']")).sendKeys("mirakbarhusain");
		  driver.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		  try
		  {


			  WebDriverWait w=new WebDriverWait(driver,10);
			  WebElement e11=w.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='Xb9hP']/descendant::input[@name='password']")));

			  System.out.println("Element found");
			  e11.sendKeys("usahusain");


			  WebDriverWait w1=new WebDriverWait(driver,10);
			  WebElement e22=w1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='passwordNext']/content/span")));
			  e22.click();

		  }
		  catch(Exception e)
		  {
			  System.out.println("Element not found");

		  }
		  driver.manage().timeouts().implicitlyWait(150,TimeUnit.SECONDS);
		  WebElement  r2=driver.findElement(By.xpath("//div[@id=':kc']/div/div"));
		  r2.click();
		  Runtime.getRuntime().exec("D:\\BODHI_2\\Java2\\LIBRARIES\\Documents\\a1.exe");


		  //----------------------------------
	  }
	  
	  
  }

