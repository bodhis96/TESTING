package MainPackage;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookie5
{
	static WebDriver driver;


	public static void main(String[] args) throws InterruptedException 
	{
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
  		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.ksrtc.in");
	    driver.findElement(By.linkText("Sign In")).click();
  		 driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("mah@yahoo.com");
   		 driver.findElement(By.xpath("//*[@id='password']")).sendKeys("mysore15");
   		driver.findElement(By.xpath("//*[@id='submitBtn']")).click();
		//Thread.sleep(20000);
		// create file named Cookie to store username Information
		
		File file = new File("c:\\Cookieksrtc.data");
		
		try { // Delete if any old file exists
		
		file.delete();
		
		file.createNewFile();
		
		FileWriter fileWriter = new FileWriter(file);
		
		BufferedWriter bufferwrite = new BufferedWriter(fileWriter);
		
		for(Cookie cook : driver.manage().getCookies())
		{
		
		String writeup = cook.getName()+";"+cook.getValue()+";"+cook.getDomain()+";"+cook.getPath()+""
		
		+ ";"+cook.getExpiry()+";"+cook.isSecure();
		
		bufferwrite.write(writeup);
		
		//System.out.println(writeup);
		
		bufferwrite.newLine();             
        }			
        bufferwrite.close();			
        fileWriter.close();
		
		}
		catch(Exception exp)
		{
		
		exp.printStackTrace();
		
		 
		
          }

	}

}
