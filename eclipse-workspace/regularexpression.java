package javapack;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularexpression 
{
	public static void main(String[] args) throws IOException 
	{
     try {
            //String texttofind="^1.hello";
            String texttofind1="^1.Keyword driven framwork";
    	    Pattern p=Pattern.compile(texttofind1);
            String line="1.hello akbar";
    	    //FileReader fr = new FileReader("C:\\Users\\Admin\\Desktop\\topics.txt");
    	    BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Admin\\Desktop\\topics.txt"));
            int s;
            String l=null;
             while ((l = br.readLine()) != null)
             {
            	System.out.println(l);
            	
                //System.out.print(s1);
                 Matcher m1 = p.matcher(l);
                
        	     // Matcher m2 = p.matcher(sr);
                
      	    if (m1.find( ))
      	    {
      	         System.out.println("Found value:"+ m1.group(0));
      	     
      	      }
      	   else 
      	    {
      	         System.out.println("NO MATCH");l=br.readLine();
      	      }
                
             }
                 br.close();
          } 
     catch (IOException e)
        {
               System.out.print("Exception caught");
    	       e.getMessage();
             //e.printStackTrace();
        }
     }

	 

}
