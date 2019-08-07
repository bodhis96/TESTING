package MainPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class andor 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.spicejet.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List<WebElement> e11=driver.findElements(By.xpath("//*[@value='OneWay' ]/following::label"));
		//List<WebElement> e11=driver.findElements(By.xpath("//*[@value='RoundTrip' or @value='TripPlanner']//following-sibling::label"));
		//List<WebElement> e11=driver.findElements(By.xpath("//*[@value='OneWay' or @value='RoundTrip' or @value='TripPlanner']/following::label"));

		//int s1=e11.size()-2;   
		int s1=e11.size();      

		//Xpath=//*[@type='submit' OR @name='btnReset']
		System.out.println(s1);                        //Xpath=//input[@type='submit' and @name='btnLogin']

		int flag1=0; 
		int flag2=0;
		int c=1;
     
		//element = findElement(By.xpath("//input[@class='t-TextBox' and @type='email' and @test-id='test-username']");
		
		
		//Xpath=//*[@type='submit' OR @name='btnReset']

		
		for(int i=0;i<s1;i++)
		{    
			
			String s=e11.get(i).getText();

			System.out.println(s);
		}



	}

}





		