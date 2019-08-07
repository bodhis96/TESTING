package javapack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class userdefinedexception extends Exception
{
	 
	 public userdefinedexception() 
	{
	     System.out.println("you have entered a invalid value");
	}
	
	
	
	public static void main(String[] args) throws userdefinedexception, RuntimeException, IOException
		{
			try
			{
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter value");
                int n=Integer.parseInt(br.readLine());
                if(n<5)
                {
                	throw new userdefinedexception();
                }
                else
                {
    				System.out.println("you have entered correct value");
                }
                	
    		}	
	        catch(userdefinedexception e)
			{
				System.out.println(e.getMessage());

			}
 			 
	    }
}		
		
		

	       




