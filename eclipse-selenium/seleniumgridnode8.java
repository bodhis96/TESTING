package MainPackage;

import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;


public class seleniumgridnode8 
{
 @Test
 // @Parameters("browser")
  public void f() throws MalformedURLException, InterruptedException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException
  {
	 
	 RemoteWebDriver driver=null;
	   //System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
	   	  String nodeUrl = "http://192.168.1.101:4444/wd/hub";


   DesiredCapabilities capability=new DesiredCapabilities();
   capability.setBrowserName("chrome");
   capability.setPlatform(Platform.WINDOWS);
   ChromeOptions o=new ChromeOptions();
	   o.merge(capability);
   driver = new RemoteWebDriver(new URL(nodeUrl),o);
   driver.manage().window().maximize();
   //driver.navigate().to("http:\\www.jetairways.com");
   driver.navigate().to("about:blank");
	 
	 //--------------first starts
	 seleniumgridnode2 ob= new seleniumgridnode2();
	 Class c1=ob.getClass();

     Field fn = c1.getField("flag2");
    fn.setAccessible(true);
    Object value = fn.get(ob);
    //System.out.println("akbar 1");

    System.out.println("value="+value);
	 //--------------first ends
    /**
    //--------------second starts
	 seleniumgridnode3 ob1= new seleniumgridnode3();
	 Class c2=ob1.getClass();

    Field fn1 = c2.getField("flag3");
   fn.setAccessible(true);
   Object value2 = fn1.get(ob);
   System.out.println("akbar 2");

   System.out.println("value="+value2);
	 //--------------second ends
   
   //--------------third starts
	 seleniumgridnode2 ob2= new seleniumgridnode2();
	 Class c3=ob2.getClass();

  Field fn2 = c3.getField("flag1");
 fn.setAccessible(true);
 Object value3 = fn2.get(ob);
 System.out.println("akbar 2");

 System.out.println("value="+value3);
	 //--------------third ends
 if(value=="1")
 {
     System.out.println("the text This website uses cookies and similar technologies is present and compatible in chrome browser-No Defect ");
  }
else
{
System.out.println("the text This website uses cookies and similar technologies is not present and not compatible in chrome browser-A Defect ");
}

 if(value2=="1")
 {
     System.out.println("the text This website uses cookies and similar technologies is present and compatible in firefox browser-No Defect ");
  }
else
{
System.out.println("the text This website uses cookies and similar technologies is not present and not compatible in firefox browser-A Defect ");
}

 
 if(value3=="3")
 {
     System.out.println("the text This website uses cookies and similar technologies is present and compatible in internet explorer browser-No Defect ");
  }
else
{
System.out.println("the text This website uses cookies and similar technologies is not present and not compatible in internet explorer browser-A Defect ");
}

	 */
	  
   } 
}


 