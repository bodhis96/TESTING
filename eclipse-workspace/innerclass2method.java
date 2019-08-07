package javapack;

 
class innerclass2method
{
	 
 	void dis1()
	{
 		  System.out.println("outer class method");
	      class inner
          {
 	    	 void dis2()
 		    {
 	  		  System.out.println("inner class method");
 	        }		
          }
	      inner i1=new inner();
	      i1.dis2();
     }
 	
 	public static void main(String[] args)
	{
 		innerclass2method o=new innerclass2method();
	 o.dis1();
	}
} 	


	      
	      
     

 