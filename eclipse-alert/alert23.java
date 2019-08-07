package MainPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert23 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
  		WebDriver driver=new ChromeDriver();
  		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//List<WebElement> e11=driver.findElements(By.xpath("//a[text()='Book a Bus']//ancestor::div"));
		 //List<WebElement> e11=driver.findElements(By.xpath("/html/body/div[5]/div[2]/div[1]/div[1]/ul/li[2]/a/ancestor::h2"));
		 WebElement e31=driver.findElement(By.name("q"));
		 
		 //WebElement e31=driver.findElement(By.xpath("//a[starts-with(text(),'Book')]"));
		//WebElement e31=driver.findElement(By.xpath("//a[ends-with(text(),' a Bus')]"));
		 e31.sendKeys("car");
		// WebElement e32=driver.findElement(By.xpath("//input[starts-with(@value,'Google')]"));
    //e32.click();
	//	 WebElement e32=driver.findElement(By.xpath("//input[ends-with(@value,' Search')]"));
		 
		//e32.click();
		WebElement e32=driver.findElement(By.xpath("//input[contains(@value,' Search')]"));
		//	WebElement e32=driver.findElement(By.xpath("//input[@value*,'Google')]"));
			// WebElement e32=driver.findElement(By.xpath("//input[@value^,' Search')]"));
			//WebElement e32=driver.findElement(By.xpath("//input[@value$,' Search')]"));

		    e32.click();
		 
		 
			//System.out.println(e31.getAttribute("href"));
/**
				int s1=e11.size();
				System.out.println(s1);
				int flag1=0; 
				int flag2=0;
				int c=1;
		      
			
				for(int i=0;i<s1;i++)
				{    
					
					String s=e11.get(i).getAttribute("class");

					System.out.println(s);
				}
		*/
		
	}

}
