package MainPackage;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
 
public class alert13 
{				
 	static WebDriver d ;
 	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
    	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
    	//  d=new ChromeDriver();
 		//System.setProperty("webdriver.gecko.driver","d:\\geckodriver.exe");
		 //d=new FirefoxDriver();
 	   System.setProperty("webdriver.ie.driver","C:\\IEDriverServer.exe");
		 d=new InternetExplorerDriver();

  
        d.get("http://www.ksrtc.in/oprs-web/");
        d.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor)d;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    	WebElement e31=d.findElement(By.xpath("//div[@class='col-md-4 footer-info']/ul/descendant::i[@class='fa fa-angle-right']"));
     	System.out.println(e31.isDisplayed());

     	 String css1=e31.getCssValue("line-height");
         Thread.sleep(5000);
      	System.out.println(css1);
        
    	//WebElement a=d.findElement(By.linkText(" About Us"));
        String css4=e31.getCssValue("color");
        System.out.println(css4);

        Actions a1=new Actions(d);

        a1.moveToElement(e31).clickAndHold(e31).build().perform();
        Thread.sleep(5000);

       String css=e31.getCssValue("color");
       String css2=e31.getCssValue("text-decoration");

     System.out.println("After hoveirng colour"+css);
     System.out.println("After hoveirng text text-decoration"+css2);

     String[] hexValue = css.replace("rgba(", "").replace(")", "").split(",");                           

     hexValue[0] = hexValue[0].trim();

     int hexValue1 = Integer.parseInt(hexValue[0]);                   

     hexValue[1] = hexValue[1].trim();

     int hexValue2 = Integer.parseInt(hexValue[1]);                   

     hexValue[2] = hexValue[2].trim();

     int hexValue3 = Integer.parseInt(hexValue[2]);                   

     String actualColor = String.format("#%02x%02x%02x", hexValue1, hexValue2, hexValue3);
     System.out.println("After hoveirng text colour"+actualColor);
    
     
     
     
     
     
     	//String hex = Color.fromString(css).asHex();
     	//System.out.println(hex);
     	/**
        if(css.equals("#fff"))
	 	{
	 		System.out.println("on moving the mouse over the login button the background colour changed to blue-No Defect");
	 	}
	 	else
	 	{
	 		System.out.println("on moving the mouse over the login button the background colour did not change to blue-A Defect");
	 	}
        //Thread.sleep(10000);
         
         */
      }		

   
}