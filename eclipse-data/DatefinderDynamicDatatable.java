package MainPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatefinderDynamicDatatable
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akbar\\Desktop\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http:\\www.spicejet.com");
driver.manage().window().maximize();
driver.findElement(By.className("ui-datepicker-trigger")).click();
List<WebElement>  m=driver.findElements(By.className("ui-datepicker-month"));
List<WebElement>  y=driver.findElements(By.className("ui-datepicker-year"));
//WebElement r=driver.findElement(By.xpath("/html/body/div/div[2]/div/div/span[1]"));
WebElement t1=driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr"));
WebElement t2=driver.findElement(By.xpath("/html/body/div/div[1]/table/tbody/tr/td"));
List<WebElement> k1=driver.findElements(By.xpath("/html/body/div/div[1]/table/tbody/tr"));
List<WebElement> k2=driver.findElements(By.xpath("/html/body/div/div[2]/table/tbody/tr/td/a"));
WebElement left=driver.findElement(By.xpath(".//span[@class='ui-icon ui-icon-circle-triangle-w']"));
WebElement right=driver.findElement(By.xpath(".//span[@class='ui-icon ui-icon-circle-triangle-e']"));
int flag1=0;
int flag2=0;
int flag3=0;
int flag4=0;
int s1=y.size();
int s2=m.size();
int s3=k1.size();
int s4=k2.size();
int y1;
System.out.println(s1);
System.out.println(s2);
System.out.println(k1);
System.out.println(k1);


//----------------------year selection started
for( y1=0;y1<s1;y1++) 
{
	// y=driver.findElements(By.className("ui-datepicker-year"));
     if(y.get(y1).getText().equals("2019"))
   	 {
        
    	 
    	 flag1=1;
		 System.out.println("entered true part");

         break;

   	 }
     else
     {
    	 while(flag2!=1)
    	 {
    		 System.out.println("entered else part");

    		  right=driver.findElement(By.xpath(".//span[@class='ui-icon ui-icon-circle-triangle-e']"));
              right.click();
        	 y=driver.findElements(By.className("ui-datepicker-year"));

              if(y.get(y1).getText().equals("2019"))
            	 {
                  flag2=1;
            	 }
            


              
              
     	 }
     }	 
}    
System.out.println(flag1);
System.out.println(flag2);


   //-----------------------------------year selectipn over 	 
    	 
   //---------------------Month selection starts here 	 
                  for(int m1=1;m1<s2;m1++) 
                  {
               		 System.out.println("scanning month");

                	  m=driver.findElements(By.className("ui-datepicker-month"));
                		 System.out.println(m.get(m1).getText());

                      
                       if(m.get(m1).getText().equalsIgnoreCase("September"))
                     	 {
                           
                           flag3=1;
                  		 System.out.println("entered true part month");
                   		 System.out.println(m.get(m1).getText());


                           break;
                          }
                           else
                          {
                        	   System.out.println("entering false part month");
                      	      while(flag4!=1)
                      	     {
                      	      Thread.sleep(3000);
                      		   right=driver.findElement(By.xpath(".//span[@class='ui-icon ui-icon-circle-triangle-e']"));
                               right.click();

                      		  	m=driver.findElements(By.className("ui-datepicker-month"));

                                if(m.get(m1).getText().equalsIgnoreCase("September"))
                              	 {

                                    flag4=1;
                             		 System.out.println("entered false part month");

                                   
                              	 }   
                               
                                
                      	      }    
                           }
                  }
                  
         //-------------------------Month selection over         
                  
        //-------------------------Date selection starts here
            int flag5=0;      
                  for(int r=0;r<=s3;r++)
                  {

                  	for(int c=0;c<=s4;c++)
                      {
                		  k2=driver.findElements(By.xpath("/html/body/div/div[2]/table/tbody/tr/td/a"));

                		  	//m=driver.findElements(By.className("ui-datepicker-month"));

                      	if(k2.get(c).getText().equals("14"))
                      	{
                      		 flag5=1;
                      		k2.get(c).click();
                      		//break;
                      	}
                      	  if(flag5==1)
                      		  break;
                      	
                       }
                  }
                  
                  
                  
       //---------------Date selection ends here
     }
}
	
            	 
                  
             
                  
                  
  