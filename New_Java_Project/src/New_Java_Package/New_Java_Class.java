/*
To check if the gmail link is present or not
 */

package New_Java_Package;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class New_Java_Class
{
	public static void main(String args[]) throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\BODHI_2\\Java\\chromedriver.exe");
		WebDriver d = new ChromeDriver();	
		d.get("http:\\www.google.com");
		d.manage().window().maximize();
		
		WebElement e1 = d.findElement(By.linkText("Gmail"));
		
		if(e1.isDisplayed())
		{
			System.out.println("Link Gmail is present on the home page - No Defect");
		} 
		else 
		{
			System.out.println("Link Gmail is present on the home page - A Defect");
		}	 
	}
}
