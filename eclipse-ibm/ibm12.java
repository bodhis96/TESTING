package MainPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ibm12
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akbar\\Desktop\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com");
		d.manage().window().maximize();
	    WebElement e1=d.findElement(By.linkText("Gmail"));
	 	if(e1.isDisplayed())
	 	{
	 		System.out.println("Link Gmail is present on the home page -No Defect");
	 	}
	 	else
	 	{
	 		System.out.println("Link Gmail is not present on the home page -A Defect");
	 	}
     }
 }
