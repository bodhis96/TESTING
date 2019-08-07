package MainPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class cssselectorchildsubchildrest 
{

	public static void main(String[] args) throws InterruptedException
	{

		    System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
		 	WebDriver driver=new ChromeDriver();
	  		driver.get("http://www.amazon.in");
			driver.manage().window().maximize();
			Thread.sleep(5000);
            //Direct child
			//WebElement e1=driver.findElement(By.cssSelector("a[id='nav-link-yourAccount']>span"));
            //Indirect child
			WebElement e1=driver.findElement(By.cssSelector("a[id='nav-link-yourAccount'] span"));
			WebElement e2=driver.findElement(By.cssSelector("a[class='nav-a']"));
           Thread.sleep(6000);
            Actions a=new Actions(driver);
            a.moveToElement(e1).clickAndHold(e1).build().perform();
            Thread.sleep(6000);

            e2.click();
            driver.findElement(By.cssSelector("span[class='a-dropdown-prompt']")).click();
            Thread.sleep(5000);
          //Inner text contains
            //css=a[text='Log Out'] or a[innertext='Log Out']
            //+ 
            driver.findElement(By.cssSelector("label[class='a-form-label']+input")).sendKeys("Mir Akbar Husain");
            driver.findElement(By.cssSelector("ul[class='a-nostyle a-list-link'] li:nth-child(12)>a")).click();
           // driver.findElement(By.cssSelector("input[id='ap_phone_number']")).sendKeys("9731310981");
            //Match prefix starting-with
            //driver.findElement(By.cssSelector("input[id^='ap_phone']")).sendKeys("9731310981");
            //Match contains
            driver.findElement(By.cssSelector("input[id*='ap']")).sendKeys("9731310981");
            //Match suffix ends-with
            driver.findElement(By.cssSelector("input[id$='number']")).sendKeys("9731310981");
            //Tag and id
           //driver.findElement(By.cssSelector("input#ap_email")).sendKeys("mirakbarhusain@ymail.com");
          //Tag and class and attribute
           // driver.findElement(By.cssSelector("input.a-input-text[id='ap_email']")).sendKeys("mirakbarhusain@ymail.com");
            //Tag and class
            driver.findElement(By.cssSelector("input.a-input-text.a-span12.auth-required-field.auth-require-fields-match.auth-require-password-validation")).sendKeys("mysore15");
          //Tag and attribute
            driver.findElement(By.cssSelector("input[id='ap_password']")).sendKeys("mysore15");

           
          
            


	}
    

}
