package MainPackage;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class ibm7
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akbar\\Desktop\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.coxandkings.com");
		d.manage().window().maximize();
		String title=d.getTitle();
 		System.out.println("Title="+title);
 	if(title.equalsIgnoreCase("Tours and Travel Agency - Best Tour Packages in India & Abroad | Cox & Kings"))
  	if(title.contains("Tours and Travel Agency"))
	 	{
	 		System.out.println("title of home page is correct-No Defect");
	 	}
	 	else
	 	{
	 		System.out.println("title of home page is not correct-A Defect");
	 	}
 	
	 	//WebElement e1=d.findElement(By.xpath("//a[text()='KNOW MORE']"));
 	Thread.sleep(5000);

	 	WebElement e1=d.findElement(By.xpath("//a[text()='Know More' or class='btn btn-primary']"));

	 	
	 	if(e1.isDisplayed())
	 	{
	 		System.out.println("Button labelled Know more is present on the home page -No Defect");
	 	}
	 	else
	 	{
	 		System.out.println("Button labelled Know more is not present on the home page -A Defect");
	 	}
	 	Thread.sleep(5000);
	 	e1.click();
	 	Thread.sleep(7000);
	 	String title1=d.getTitle();
	    System.out.println(title1);

	 	if(title1.equalsIgnoreCase("The Big Holiday Flash Sale – Cox & Kings"))
	 	  //	if(title.contains("The Big Holiday Flash Sale"))
	 		 	{
	 		 		System.out.println("On clicking the Button labelled KNow More the module Flash sale appeared-No Defect");
	 		 	}
	 		 	else
	 		 	{
	 		 		System.out.println("On clicking the Button labelled KNow More the module Flash sale did not appear-A Defect");
	 		 	}
		 	Thread.sleep(7000);

	 	d.navigate().back();
	 	Thread.sleep(7000);
	 	String title2=d.getTitle();
 		System.out.println("akbar"+title2);

	 	if(title2.equalsIgnoreCase(title))
	 	{
	 		System.out.println("on clicking the browser back button the web site navigated to previous page browser back button is  working correct -No Defect");
	 	}
	 	else
	 	{
	 		System.out.println("on clicking the browser back button the web site did not navigate to previous page browser back button is not working correct -A Defect");
	 	}
	 	if(d.getPageSource().contains("OVER 260 YEARS OF DISCOVERY"))
	 	{
	 		System.out.println("The Text OVER 260 YEARS OF DISCOVERY is present on the home page -No Defect");
	 	}
	 	else
	 	{
	 		System.out.println("The Text OVER 260 YEARS OF DISCOVERY is not present on the home page -A Defect");
	 	}
	 	WebElement e21=d.findElement(By.xpath("//a[text()='Flights / Hotels / Cars']"));

	 	
	 	//WebElement e11=d.findElement(By.cssSelector("a[href='https://www.coxandkings.com/ibe_login/user/autologin?redirecturl=http://travelandstay.coxandkings.com'][class='parent']"));
        Actions a=new Actions(d);
        Actions a1=new Actions(d);

        a.moveToElement(e21).clickAndHold(e21).build().perform();
	 	WebElement e11=d.findElement(By.cssSelector("#flight ul"));
     	System.out.println(e11.isDisplayed());

   if(e11.isDisplayed())
        {
         	System.out.println("On moving mouse over the Menu Flights/Hotels/Cars the drop down menu appeared-No Defect");
         	
        }
        else
        {
         	System.out.println("On moving mouse over the Menu Flights/Hotels/Cars the drop down menu did not appeared-A Defect");
         	
        }
   
	WebElement e12=d.findElement(By.id("when"));
    //d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		e12.click();
	WebElement e13=d.findElement(By.linkText("Login"));
	e13.click();
    //d.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
   Thread.sleep(3000);
	WebElement e15=d.findElement(By.cssSelector("[class='close']"));
	e15.click();
	   Thread.sleep(3000);

	//WebElement e16=d.findElement(By.className("btn"));

 	//WebElement e24=d.findElement(By.xpath("//a[text()='Search holidays']"));
	 //	WebElement e24=d.findElement(By.xpath("//a[@class='btn btn-primary'][@id='search_holidays']"));
	 //	WebElement e24=d.findElement(By.xpath("//a[@class='btn btn-primary' and @id='search_holidays']"));
	 	WebElement e24=d.findElement(By.id("search_holidays"));

 	System.out.println(e24.isDisplayed());
    a1.moveToElement(e24).clickAndHold(e24).build().perform();
	WebElement e28=d.findElement(By.xpath("//ul[@class='widget-form-elements']/descendant::div[@class='filter-option pull-left'][2]"));
   e28.click();
   Thread.sleep(2000);
	//WebElement e29=d.findElement(By.xpath("//*[@id='search_holidays_form']/div/div/div/div/div/ul/li[4]/div/div/div/ul"));
	WebElement e29=d.findElement(By.xpath("//*[@id='search_holidays_form']/descendant::ul"));

	//WebElement e29=d.findElement(By.cssSelector("ul.dropdown-menu inner::before"));
  // e29.click();
 	System.out.println(e29.isDisplayed());
 	if(e29.isDisplayed())
    {
     	System.out.println("On clicking  the drop down what the drop down appeared-No Defect");
     	
    }
    else
    {
     	System.out.println("On clicking the the drop down what the drop down did not appeared-a Defect");
     	//*[@id="search_holidays_form"]/div/div/div/div/div/ul/li[4]/div/div/button/text()
    }
	//WebElement e30=d.findElement(By.xpath("//a[text()='Hills']"));
	//e30.click();
	//*[@id="search_holidays_form"]/div/div/div/div/div/ul/li[4]/div/div/div/ul/li[17]/a/span
  Thread.sleep(5000);
	WebElement e31=d.findElement(By.xpath("//*[@id='search_holidays_form']/descendant::button[@class='btn dropdown-toggle']"));
	//WebElement e31=d.findElement(By.xpath("//*[@id='search_holidays_form']/div/div/div/div/div/ul/li[4]/div/div/div/ul/li[1]/a/span"));
	WebElement e37=d.findElement(By.xpath("//*[@id='search_holidays_form']/div/div/div/div/div/ul/li[4]/div/div/div/ul/li[4]/a/span"));
	//WebElement e37=d.findElement(By.xpath("//*[@id='search_holidays_form']/descendant::a[7]/span"));
	e37.click();
	
	//WebElement e31=d.findElement(By.cssSelector("li.custom-field:nth-child(4) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(1) > a:nth-child(1) > span:nth-child(1)"));
  System.out.println(e31.isDisplayed());
 	e31.click();
 	Thread.sleep(5000);
 	/**
	WebElement e139=d.findElement(By.xpath("//ul[@class='dropdown-menu']"));

	WebElement e139=d.findElement(By.cssSelector("li#flight.has-submenu"));
*/
 	
 	WebElement e139=d.findElement(By.partialLinkText("Business"));
    a1.moveToElement(e139).clickAndHold(e139).build().perform();
    WebElement e34=d.findElement(By.className("fa-envelope-o"));
 	e34.click();
 	Thread.sleep(5000);
 	  WebElement i11=d.findElement(By.xpath("//input[@type='submit' and @value='Submit Query']"));
      i11.submit();
     
     try
     {
    	 String ta= d.switchTo().alert().getText();
    	 	System.out.println(ta);
    	 	if(ta.contains("Please Check the Fields Below"))
    	    {
    	 		System.out.println("After clicking the Submit button a alert appeared-No Defect");
    	 	      d.switchTo().alert().accept();    	     	
    	    }
      }
     catch(Exception e)
     {
         System.out.println("After clicking the Submit button alert did not appear-A Defect");
 
     }
   	Thread.sleep(5000);
 	Set<String> s=d.getWindowHandles();
	System.out.println(s.size());
	for(String h:d.getWindowHandles())
	{
			System.out.println(h);

		d.switchTo().window(h);
		String t=d.getTitle();
		System.out.println(t);
		Boolean flagn=false;
		if(t.equalsIgnoreCase("Fujitsu"))
    	{
		System.out.println("Yes found the window");
		d.switchTo().window(h);
		d.manage().window().maximize();
       // Thread.sleep(10000);
//			
		//WebDriverWait w=new WebDriverWait(driver,40);
			//WebElement i1=w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src='https://company.naukri.com/popups/fujitsu/2232019/fujitsu-ns-250x250-2232019.gif']")));
         //i1.click();
   WebElement i1=d.findElement(By.xpath("//img[@src='https://company.naukri.com/popups/fujitsu/2232019/fujitsu-ns-250x250-2232019.gif']"));
        i1.click();
        break;
		}
	else
	{
		flagn=true;
		System.out.println("No such window");
	}
	 	 
	}
	 
    WebElement e341=d.findElement(By.name("config_captcha_code"));
    e341.sendKeys("234t");
    
    WebElement e342=d.findElement(By.tagName("textarea"));
    System.out.println("yes tag name is working"+e342.isDisplayed());
    System.out.println("yes tag name is working"+e342.getAttribute("placeholder"));

   // e342.sendKeys("Bangalore");
    List<WebElement> li=d.findElements(By.tagName("textarea"));
   	int s1=li.size();
    	 	System.out.println("Total number of input of type=text are"+s1);
    	 	for(int i=0;i<s1;i++)
    	 	{
    		 	System.out.println(li.get(i).getAttribute("placeholder"));
    		 	String p=li.get(i).getAttribute("placeholder");
    		 	if(p.equalsIgnoreCase("Your Query (Max 200 characters)"))
    		 	{
    		 		//li.get(i).click();
    		 		li.get(i).sendKeys("i want a good flight");

    		 		break;

    		 	}
    		 	 

    	 	}
    	  	//WebElement e311=d.findElement(By.cssSelector("div.ttl"));
    	  	//WebElement e311=d.findElement(By.cssSelector("div.Float-box enquiry-form>div"));
    	    WebElement e311=d.findElement(By.xpath("//div[@class='Float-box enquiry-form']/form/div"));
     	System.out.println(e311.isDisplayed());
    	 	if(e311.isDisplayed())
    	    {
    	     	System.out.println("On clicking the image with post cover icon the form labelled send enquiry appeared-No Defect");
    	     	
    	    }
    	    else
    	    {
    	     	System.out.println("On clicking the image with post cover icon the form labelled send enquiry did not appear-A Defect");
    	     	
    	    }
	 	
    		e13.click();
    	  	//WebElement e131=d.findElement(By.cssSelector("div.dropdown-menu theme-03 login-sec:li:nth-child(1) a"));
    	    WebElement e131=d.findElement(By.xpath("//div[@class='dropdown-menu theme-03 login-sec']/ul/li/a"));

    		//dropdown-menu theme-03 login-sec
    		//WebElement e131=d.findElement(By.linkText("LOGIN"));
         	System.out.println(e131.isDisplayed());
            a1.moveToElement(e131).clickAndHold(e131).build().perform();
            String css=e131.getCssValue("color");
            //Thread.sleep(5000);
         	System.out.println(css);
         	String hex = Color.fromString(css).asHex();
         	System.out.println(hex);
            if(css.equals("#fff"))
    	 	{
    	 		System.out.println("on moving the mouse over the login button the background colour changed to blue-No Defect");
    	 	}
    	 	else
    	 	{
    	 		System.out.println("on moving the mouse over the login button the background colour did not change to blue-A Defect");
    	 	}

    		e131.click();
    		if(d.getPageSource().contains("Sign in"))
    	 	{
    	 		System.out.println("on clicking the login button the module with sign in appeared-No Defect");
    	 	}
    	 	else
    	 	{
    	 		System.out.println("on clicking the login button the module with sign in did not appear-A Defect");
    	 	}
    		String url=d.getCurrentUrl();
    		if(url.contains("login"))
    	 	{
    	 		System.out.println("on clicking the login button the module with sign in appeared-No Defect");
    	 	}
    	 	else
    	 	{
    	 		System.out.println("on clicking the login button the module with sign in did not appear-A Defect");
    	 	}
    		

	
 
}
}
