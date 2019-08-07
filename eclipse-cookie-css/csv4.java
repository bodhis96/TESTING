package MainPackage;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class csv4
{

	public static void main(String[] args) throws IOException
	{

		  String filepath="C:\\Users\\Akbar\\Desktop\\a1.csv";
	  //CSVReader reader = new CSVReader(new FileReader(file), ',', '\'')
   FileInputStream fi=new FileInputStream(filepath);
   BufferedReader br=new BufferedReader(new InputStreamReader(fi));
   String s;
		 while((s=br.readLine())!=null)
		 {
 				String a[]=s.split(",");
				for(int i=0;i<a.length;i++)
				{
					 System.out.print(a[i]+" ");

				}
				 System.out.println("\n");
		 }
		 
      }
}	
