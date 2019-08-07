package MainPackage;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class csv2
{

	public static void main(String[] args) throws IOException
	{


		  String filepath="C:\\Users\\Akbar\\Desktop\\a1.csv";
	  //CSVReader reader = new CSVReader(new FileReader(file), ',', '\'')

		CSVReader c = new CSVReader(new FileReader(filepath));
		List<String[]> r =  c.readAll(); 
		String [] cell;
		int sizer=r.size();
		 System.out.println("number of rows are="+sizer);
			int flag = 0;

		 for (String[] row : r) 
		 { 
			 for (String cell1 : row)
			   { 


				 System.out.print(cell1+" ");
				 if(cell1.equalsIgnoreCase("sufian"))
				 {
					 flag=1;
 	                 break;
				 }
				 /**
				 else
				 {
					 flag=0;
					 
 				 }
 */
			   }
			 System.out.println("\n");

		 }
		 System.out.println(flag);
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



 
		 