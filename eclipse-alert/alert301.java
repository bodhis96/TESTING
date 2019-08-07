package MainPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 public class alert301
	{
		public static void main(String[] args)
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		 	WebDriver driver=new ChromeDriver();
	  		driver.get("https:\\www.google.com");
	 		driver.manage().window().maximize();
	 		WebElement li=driver.findElement(By.xpath("//img[@src='/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png']"));
	 		if(li.isDisplayed())
 	    	{
 		    	 System.out.println("image is present -No defect");
 	    	}
 		else
 		    {
 			
 			System.out.println("image is not present -A Defect");
 		    }
	 	//Actions a=new Actions(driver);
	 	//a.moveToElement(li).clickAndHold(li).build().perform();
 			System.out.println("title of google image is"+li.getAttribute("alt"));

	 	 if(li.getAttribute("alt").equalsIgnoreCase("Google"))
	 	    	{
	 		    	 
	 			System.out.println("title of google image is correct -No defect");
	 	    	}
	 		else
	 		    {
	 			System.out.println("title of google image is not correct -A defect");
	 		    }
	 	 
	 	 
	 		WebElement li5=driver.findElement(By.name("q"));
 	 		//Actions a1=new Actions(driver);
		 	//a1.moveToElement(li5).clickAndHold(li5).build().perform();
 			System.out.println("title of google text box is"+li5.getAttribute("title"));

		 	 if(li5.getAttribute("title").equalsIgnoreCase("Search"))
		 	    	{
		 		    	 
		 			System.out.println("title of google text box is correct -No defect");
		 	    	}
		 		else
		 		    {
		 			System.out.println("title of google text box is not correct -A defect");
		 		    }
		
		 		driver.findElement(By.linkText("Gmail")).sendKeys(Keys.CONTROL,Keys.RETURN);


 }
}
