package MainPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class alert29
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("http:\\www.google.com");
        d.manage().window().maximize();
		Actions a=new Actions(d);
		WebElement w=d.findElement(By.linkText("Gmail"));
		a.moveToElement(w).clickAndHold().build().perform();
		
		Thread.sleep(5000);
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
 		
 		WebElement w1=d.findElement(By.xpath("//div[@class='gb_Rf gb_f']/descendant::a[text()='Sign in']"));
 		if(w1.isDisplayed())
		{
		  System.out.println("Button labelled Sign-in is present on the Google Homepage No-Defect");
		}
		else
 		{
		  System.out.println("Button labelled Sign-in is not present on the Google Homepage a Defect");
		}
 		 d.findElement(By.name("q")).sendKeys("bangalore");
 		//w3.sendKeys("bangalore");

 		
 		
	}

}
