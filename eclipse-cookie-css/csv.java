package MainPackage;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.interactions.Actions;

public class csv
{

	public static void main(String[] args) throws IOException
	{

	  String filepath="C:\\Users\\Akbar\\Desktop\\a1.csv";
	  //CSVReader reader = new CSVReader(new FileReader(file), ',', '\'')

		CSVReader r = new CSVReader(new FileReader(filepath));
 		 //List d = r.readAll();
		 // int size=d.size();
		  String [] csvCell;
		  csvCell=r.readNext();
      
		  while ((r.readNext()) != null) 
		  { 
			 csvCell=r.readNext();
           }
		  int size=csvCell.length;
		 System.out.println("number of values in each row are="+size);
		 int flag = 0;

		 for(int i=0;i<size;i++)
		 {
			 System.out.println(csvCell[i]);
			if(csvCell[i].equalsIgnoreCase("sufian"))
			 {
				 flag=1;
			   //System.out.println("name syed exists -No Defect");
                 break;
			 }
			 else
			 {
				 flag=0;
			   //System.out.println("name syed dosnt exists -A Defect");
			 }
				
		 }
		 if(flag==1)
		 {
 			 System.out.println("name sufian exists -No Defect");

		 }
		 else
		 {
 			 System.out.println("name sufian dosnt exists -A Defect");

		 }
		 
      }
}	
