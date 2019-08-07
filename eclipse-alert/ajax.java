package MainPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class ajax
{
    public static void main(String[] args) 
    {
    	String URL = "http://demo.guru99.com/test/ajax.html";
    	
    	WebDriver driver;
    	WebDriverWait wait;
      	
     		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
    		//create chrome instance
    		driver = new ChromeDriver();
    		driver.manage().window().maximize();
    		driver.navigate().to(URL);
     	
 
    		By container = By.cssSelector(".container");
    		//wait = new WebDriverWait(driver, 50);
    		//wait.until(ExpectedConditions.presenceOfElementLocated(container));
    		
    		//Get the text before performing an ajax call
    		WebElement noTextElement = driver.findElement(By.className("radiobutton"));
    		String textBefore = noTextElement.getText().trim();
    		System.out.println(textBefore);
    		//Click on the radio button
    		driver.findElement(By.id("yes")).click();
    	
    		//Click on Check Button
    		driver.findElement(By.id("buttoncheck")).click();
    		
    		/*Get the text after ajax call*/
    		//WebElement TextElement = driver.findElement(By.className("radiobutton"));
    		//wait.until(ExpectedConditions.visibilityOf(TextElement));
    		String textAfter = noTextElement.getText().trim();
    		System.out.println(textAfter);

    		/*Verify both texts before ajax call and after ajax call text.*/
    		Assert.assertNotEquals(textBefore, textAfter);
    		System.out.println("Ajax Call Performed");
    		
    		String expectedText = "Radio button is checked and it's value is Yes";
    		
    		/*Verify expected text with text updated after ajax call*/
    		Assert.assertEquals(textAfter, expectedText);
    		System.out.println("welcome");
    		
 	}

}
