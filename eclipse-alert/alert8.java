package MainPackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert8 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.w3schools.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        WebElement e1=driver.findElement(By.xpath("//a[text()='TUTORIALS ']"));
		e1.click();
		//List<WebElement> e21=driver.findElements(By.xpath("//*[@class='w3-col l3 m6']/following::h3"));
		//Xpath=//*[@type='submit' OR @name='btnReset']
		//Xpath=//*[contains(text(),'here')]
        List<WebElement> e11=driver.findElements(By.xpath("//*[text()='Server Side']/following-sibling::a"));
//System.out.println(e11.getAttribute("class"));

//List<WebElement> e22=e11//following::a;

		///html/body/nav[2]/div/div[1]
		//JavaScript
		int s1=e11.size();
		System.out.println(s1);
		int flag1=0; 
		int flag2=0;
		int c=1;
      
		
		for(int i=0;i<s1;i++)
		{    
			
			String s=e11.get(i).getText();

			System.out.println(s);
		}
	}

}




