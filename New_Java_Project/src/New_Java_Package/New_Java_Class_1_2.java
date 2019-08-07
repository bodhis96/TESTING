/*
To check if the gmail link is being underlined or not.
 */

package New_Java_Package;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class New_Java_Class_1_2 {
	public static void main(String args[]) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\BODHI_2\\Java\\chromedriver.exe");
		WebDriver d = new ChromeDriver();	
		d.get("http:\\www.google.com");
		
		Thread.sleep(10000);
		
		d.manage().window().maximize();
		Actions a = new Actions(d);
		WebElement w = d.findElement(By.linkText("Gmail"));
		a.moveToElement(w).clickAndHold().build().perform();
		String st = w.getCssValue("font-size");
		String st1 = w.getCssValue("text-decoration");
		System.out.println(w.getCssValue("font-size = " + st + " font-style = " + st1));
		
		if(w.getCssValue("text-decoration").contains("underline"))
		{
			System.out.println("on moving the cursor over the link gmail got underlined - No issues");
		}
		else
		{
			System.out.println("on moving the cursor over the link gmail got underlined - Issues");
		}
	}
}
