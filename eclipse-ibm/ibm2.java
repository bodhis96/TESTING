package MainPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ibm2
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akbar\\Desktop\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		//System.setProperty("webdriver.ie.driver","C:\\IEDriverServer.exe");
		//WebDriver d=new InternetExplorerDriver();
		//System.setProperty("webdriver.gecko.driver","d:\\geckodriver.exe");
		//WebDriver d=new FirefoxDriver();
		d.get("https://www.google.com");
        d.manage().window().maximize();
		Actions a=new Actions(d);
		Actions a1=new Actions(d);

		WebElement w=d.findElement(By.linkText("Gmail"));
		a.moveToElement(w).clickAndHold().build().perform();
		//Thread.sleep(5000);
		String st=w.getCssValue("color");
 System.out.println(st);
 System.out.println(w.getCssValue("text-decoration"));

 		if(w.getCssValue("text-decoration").contains("underline"))
		{
		  System.out.println("on moving the cursor over link gmail it got underlined-No Defect");
		}
		else
 		{
		  System.out.println("on moving the cursor over link gmail it did not got underlined-A Defect");
		}
 		w.click();
 	//----------------------------------------------
 		/**
 		 String[] hexValue = st.replace("rgba(", "").replace(")", "").split(",");                           

 	     hexValue[0] = hexValue[0].trim();

 	     int hexValue1 = Integer.parseInt(hexValue[0]);                   

 	     hexValue[1] = hexValue[1].trim();

 	     int hexValue2 = Integer.parseInt(hexValue[1]);                   

 	     hexValue[2] = hexValue[2].trim();

 	     int hexValue3 = Integer.parseInt(hexValue[2]);                   

 	     String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
 	     System.out.println("After hoveirng text colour"+actualColor);
 		
 */		
 	//----------------------------------------------
		Thread.sleep(10000);
	
     WebElement e2=	d.findElement(By.xpath("//a[@class='h-c-button h-c-button--primary hero-carousel__cta hero-carousel__cta--reg']"));
     	 System.out.println(e2.isDisplayed());
     	String st0=e2.getCssValue("background-color");
     	 System.out.println(st0);
     	a.moveToElement(e2).clickAndHold(e2).build().perform();
		//Thread.sleep(5000);
		String st1=e2.getCssValue("background-color");
 System.out.println(st1);
 //e2.click();
	a.moveToElement(e2).contextClick();
/**
 String[] hexValue = st1.replace("rgba(", "").replace(")", "").split(",");                           

  hexValue[0] = hexValue[0].trim();

  int hexValue1 = Integer.parseInt(hexValue[0]);                   

  hexValue[1] = hexValue[1].trim();

  int hexValue2 = Integer.parseInt(hexValue[1]);                   

  hexValue[2] = hexValue[2].trim();

  int hexValue3 = Integer.parseInt(hexValue[2]);                   

  String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
  System.out.println("After hoveirng text colour"+actualColor);
	               

	if(actualColor.equals("#174ea6"))
	{
	  System.out.println("on moving the cursor over create accout the background colour changed to blue-No Defect");
	}
	else
	{
		  System.out.println("on moving the cursor over create accout the background colour did not change to blue-A Defect");
	}
	*/
   // d.navigate().back();
	WebElement w1=d.findElement(By.linkText("For Work"));
    //WebElement w1=	d.findElement(By.xpath("/html/body/div[2]/div[1]/div[5]/ul[1]/li[1]/a"));

	  System.out.println(w1.isDisplayed());
	  
	 //a1.contextClick(w1).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		a1.moveToElement(w1).contextClick().build().perform(); 
		WebElement w18=d.findElement(By.linkText("Open link in new window"));
        w18.click();
	 // a1.sendKeys(Keys.ARROW_DOWN);
	 // a1.sendKeys(Keys.ARROW_DOWN);
	  //a1.sendKeys(Keys.ARROW_DOWN);
	  //a1.sendKeys(Keys.ARROW_DOWN);
	 // a1.sendKeys(Keys.ARROW_DOWN).build().perform();
	  a1.sendKeys(Keys.ENTER).build().perform();

	//a1.moveToElement(w1).contextClick().build().perform(); 
	


	
    
  
  
	}

}
