package MainPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class cssattributes
{

	public static void main(String[] args)
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\chromedriver.exe");
WebDriver d=new ChromeDriver();
d.get("http:\\www.google.com");
Actions a=new Actions(d);
WebElement w=d.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a"));
a.moveToElement(w).clickAndHold().build().perform();
String s=w.getCssValue("text-decoration");
if(s.contains("underline"))
{
	 System.out.println("On moving the mouse cursor over the link Gmail it got underlined-No Defect");
}
	 else
	 {
		 System.out.println("On moving the mouse cursor over the link Gmail it did not got underlined-Defect");

	 }


	}

}
