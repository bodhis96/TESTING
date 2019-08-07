package javapack;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class readingtextfile 
{
	public static void main(String[] args) throws IOException 
	{
     try {
            FileReader fr = new FileReader("C:\\Users\\Admin\\Desktop\\topics1.txt");
            int s;
             while ((s=fr.read())!=-1)
             {
                System.out.print((char)s);
             }
                 fr.close();
          } 
     catch (IOException e)
        {
               System.out.print("Exception caught");
    	       e.getMessage();
             //e.printStackTrace();
        }
     }     
}	


