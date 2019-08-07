package MainPackage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DataDrivenUsingExcell 
{
 
   @SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException, IOException 
	{
	   
	   
	  
    File file=new File("C:\\Users\\Akbar\\Desktop\\Data.xlsx");
    FileInputStream fi=new FileInputStream(file);
    String fn="C:\\Users\\Akbar\\Desktop\\Data.xlsx";
    System.out.println(file);
    System.out.println("welcome");

    //Find the file extension by splitting file name in substring  and getting only extension name
    String fe=fn.substring(fn.indexOf("."));
    System.out.println(fe);
    try
    {
         if(fe.equals(".xlsx"))
       {
           System.out.println("your file extension is xlsx");
          Workbook w = new XSSFWorkbook(fi);
          org.apache.poi.ss.usermodel.Sheet guru99Sheet = w.getSheet("s");
          int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();
          for (int i = 0; i < rowCount+1; i++) 
          {
              Row row = guru99Sheet.getRow(i);
              String name=null;
       	   String password=null;
              for (int j = 0; j < row.getLastCellNum(); j++) 
              {
            	  
                 
            	  if(j==0)
            	  {
  
                 	name=row.getCell(j).getStringCellValue();

            	  }
            	if(j==1)
            	{
            	 password=row.getCell(j).getStringCellValue();
            	}
              }  
              System.out.print(name);
              System.out.print("  ");

              System.out.print(password);
             //---------------------------------------------
      		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akbar\\Desktop\\chromedriver.exe");
      		WebDriver d1=new ChromeDriver();
                 d1.get("http://ksrtc.in/oprs-web/");
                 d1.manage().window().maximize();
                 Thread.sleep(1000);
                 d1.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
                 d1.findElement(By.linkText("Sign In")).click();
                 //d1.findElement(By.xpath("//*[@id='login']/a[1]")).click();

                 Thread.sleep(3000);
                 d1.findElement(By.id("userName")).sendKeys(name);
                 d1.findElement(By.id("password")).sendKeys(password);
                 d1.findElement(By.id("submitBtn")).click();
                 Thread.sleep(1000);
                 
               
                
                 if(name.equalsIgnoreCase("mah@yahoo.com") && password.equalsIgnoreCase("mysore15"))
                 {
                	   Thread.sleep(15000);

                     System.out.print("welcome to lasvegas akbar");
                     System.out.print("\n");


                	  
                     boolean a=d1.findElement(By.linkText("Logout")).isDisplayed();
	                 if(a) 
	                 {
	                     System.out.println("login success for valid name  and valid password No defect");
 	 
	                 }
	                 else
	                 {
	                     System.out.println("login not success for valid name  and valid password A defect");
	                 }
	                 d1.findElement(By.linkText("Logout")).click();
	                 d1.close();
                 }
                
                 if(name.equalsIgnoreCase("mah@yahoo.com") && password.equalsIgnoreCase("mysore16"))
                 {
                   if(d1.getPageSource().contains("Login incorrect. Please try again"))
                     {
	                     System.out.println("login not success for valid name  and in valid password No defect");
 
	                 }
	                 else
	                 {
	                     System.out.println("login  success for valid name  and in valid password A defect");
	                     
	                 }
                	 d1.close();
                 }
                 
                 
                   
              }       
          }
       }
  //for ends------------------------------------------------------------         
   
    
    catch (Exception e)
      {
   		throw (e);
      }
    
    //-------------------------------------------------------------------
    try
    {
    	if(fe.equals(".xls"))
        {
              System.out.println("your file extension is xls");
           Workbook w = new HSSFWorkbook(fi);
          org.apache.poi.ss.usermodel.Sheet guru99Sheet = w.getSheet("s");
          int rowCount = guru99Sheet.getLastRowNum()-guru99Sheet.getFirstRowNum();
          //Create a loop over all the rows of excel file to read it
          for (int i = 0; i < rowCount+1; i++) 
          {
              Row row = guru99Sheet.getRow(i);
              //Create a loop to print cell values in a row
              for (int j = 0; j < row.getLastCellNum(); j++) 
              {
                 //Print Excel data in console
            	 String name=row.getCell(j).getStringCellValue();
            	 j=j+1;
            	 String password=row.getCell(j).getStringCellValue();
                 System.out.print(name);
                 System.out.print("  ");

                 System.out.print(password);
                 //---------------------------------------------
         		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Akbar\\Desktop\\chromedriver.exe");
                  WebDriver d1=new ChromeDriver();
                 d1.get("http://ksrtc.in/oprs-web/");
                 d1.manage().window().maximize();

                 Thread.sleep(1000);
                 d1.findElement(By.xpath("//*[@id='login']/a[1]")).click();
                 Thread.sleep(3000);
                 d1.findElement(By.id("userName")).sendKeys(name);
                 d1.findElement(By.id("password")).sendKeys(password);
                 d1.findElement(By.id("submitBtn")).click();
                 Thread.sleep(1000);
                
                 System.out.print(name);
                 System.out.print("  ");

                 System.out.print(password);
               //  System.out.println(a);
            	   Thread.sleep(3000);

                 if(name=="mah@yahoo.com" && password=="mysore15")
                 {
              	   

                     boolean a=d1.findElement(By.xpath("//*[@id=\"login\"]/a[1]")).isDisplayed();
	                 if(a) 
	                 {
	                     System.out.println("login success for valid name  and valid password No defect");
 	 
	                 }
	                 else
	                 {
	                     System.out.println("login not success for valid name  and valid password A defect");
	                 }
                	 
                 }
                
                 if(name=="mah@yahoo.com" && password=="mysore1")
                 {
                   if(d1.getPageSource().contains("Login incorrect. Please try again\r\n"))
	                 	                 {
	                     System.out.println("login not success for valid name  and in valid password No defect");
 	 
	                 }
	                 else
	                 {
	                     System.out.println("login  success for valid name  and in valid password A defect");
	                 }
                	 
                 }
                
                 
        //---------------------------------------------------------------         
       //-------------------------------------------

              }
              System.out.println();
          }

       }
    }
    
    //-------------------try ends
    catch (Exception e)
      {
   		throw (e);
      }
      
        
	
}
}
