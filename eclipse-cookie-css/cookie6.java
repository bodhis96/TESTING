package MainPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Date;
import java.util.StringTokenizer;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookie6 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver.exe");
  		WebDriver driver=new ChromeDriver();
  		Thread.sleep(3000);
  		
  		
  		try{
  			driver.get("https://easyweb.td.com/waw/idp/login.htm?execution=e1s1");
  	        driver.manage().window().maximize();
  			File file = new File("c:\\Cookienew2.data");
  			
  			FileReader fileReader = new FileReader(file);
  			
  			BufferedReader Buffreader = new BufferedReader(fileReader);
  			
  			String strline;
  			
  			while((strline=Buffreader.readLine())!=null)
  			{
  			
  			StringTokenizer token = new StringTokenizer(strline,";");
  			
  			while(token.hasMoreTokens())
  			{
  			
  			String name = token.nextToken();String value = token.nextToken();
  			
  			String domain = token.nextToken();String path = token.nextToken();
  			
  			Date expiry = null;
  			//Date expiry = new Date();

  			
  			String val;
  			
  			if(!(val=token.nextToken()).equals("null"))
  			{
  			
  			expiry = new Date();
  			
  			}
  			
  			Boolean isSecure = new Boolean(token.nextToken()).booleanValue();
  			
  			Cookie ck = new Cookie(name,value,domain,path,expiry,isSecure);
  			//System.out.println(ck);
  			
 
  			driver.manage().addCookie(ck); // This will add the stored cookie to our current session

  			}
  			
  			}
  			
  			}catch(Exception ex){
  			
  			ex.printStackTrace();
  			
  			}
  		//for(Cookie ck : cookie)							
        {			
       //  	System.out.println(ck.getName()+"\n"+ck.getValue());
        // 	String co1=driver.manage().getCookieNamed(c1);
         //	System.out.println(driver.manage().getCookieNamed(co1));
         	//Cookie ck = new Cookie("name", "value");
         	//driver.manage().addCookie(ck);
         	
             //return driver.manage().getCookieNamed(name);

         	Cookie cookie = driver.manage().getCookieNamed("cookie");
             System.out.println("cookie: " + cookie +"\n");
             System.out.println("cookie value: " + cookie.getValue().toString() + "\n");

        }		
			driver.navigate().refresh();

	}

}
