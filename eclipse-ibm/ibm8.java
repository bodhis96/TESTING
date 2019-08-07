package MainPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ibm8 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akbar\\Desktop\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.coxandkings.com");
		d.manage().window().maximize();
	 	//*[@id="search_holidays_form"]/div/div/div/div/div/ul/li[3]/div/div/div/ul/li[1]/a/span
		String s=d.findElement(By.xpath("//*[@id=\"search_holidays_form\"]/div/div/div/div/div/ul/li[3]/div/div/div/ul/li[1]/a/span")).getText();
	 	System.out.println(s);
		 d.findElement(By.xpath("//*[@id=\"search_holidays_form\"]/div/div/div/div/div/ul/li[3]/div/div/div/ul/li[3]/a")).click();
		//*[@id="search_holidays_form"]/div/div/div/div/div/ul/li[3]/div/div/div/ul/li[6]/a
		//*[@id="search_holidays_form"]/div/div/div/div/div/ul/li[3]/div/div/div/ul	 
		//*[@id="search_holidays_form"]/div/div/div/div/div/ul/li[3]/div/div/div/ul/li[1]/a/span
	 //List<WebElement> li=d.findElements(By.xpath("//*[@class='dropdown-menu'][@role='menu']/li"));
	// List<WebElement> li=d.findElements(By.xpath("//*[@id=\"search_holidays_form\"]/div/div/div/div/div/ul/li[3]/div/div/div/ul/li[1]/a/span"));
	//	 List<WebElement> li=d.findElements(By.xpath("//*[@id=\"search_holidays_form\"]/div/div/div/div/div/ul/li[3]/div/div/div/ul/li/a/span"));
/**
	 	int s=li.size();
	 	System.out.println(s);
	 	for(int i=0;i<s;i++)
	 	{
		 	System.out.println(li.get(i).getText());
		 	//System.out.println(li.get(i).getAttribute("class"));
		 	//*[@id="search_holidays_form"]/div/div/div/div/div/ul/li[3]/div/div/div/ul/li[1]/a/span
		 	

	 	}
*/
	}

}
