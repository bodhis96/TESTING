package javapack;

public class innerclass1 
{
	public static void main(String[] args)
	{
	 outer o=new outer();
	 o.innercall();
	}
}
class outer
{
	 
 	void dis1()
	{
 		  System.out.println("outer class method");
	}
 	private class inner
 	{
 		void dis2()
 		{
 	 		  System.out.println("inner class method");
 		}
 	}
 	void innercall()
	{
       inner i1=new inner();	
       i1.dis2();
    }
}

 