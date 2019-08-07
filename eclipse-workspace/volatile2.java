package javapack;

import javax.naming.InterruptedNamingException;

public class volatile2  
{
     static volatile int j=0;
	public static void main(String[] args) throws InterruptedException
	{
	 
	  //------------------------------------------------------	
	  Thread v1=new Thread()
	  {
		   public void run()
			{    
			    int t1=j;
 			    System.out.println(j);
		  	}
	  };
	  //------------------------------------------------------	

	  //------------------------------------------------------	
	  Thread v2=new Thread()
	  {
		   public void run()
			{    
			    j++;
 			    System.out.println(j);
 			    
 		    	try 
 		    	{
					Thread.sleep(800);
				} 
 		    	catch(InterruptedException e)
 			   	{
				  // TODO Auto-generated catch block
				     e.printStackTrace();
				}
				
     
		  	}
	  };
	  //------------------------------------------------------	
	  v1.run();
	  v2.run();
	} 
	
}
 