package javapack;

public class overriding 
{
	public static void main(String[] args)
	{
	  overe m=new overe();
	  m.m1();
	   
	}
}
class over
{
	void m1()
	{
		  System.out.println("before over riding");

	}
}

class overe extends over
{
	 
 	 
	@Override
	void m1()
	{
		  System.out.println("after over riding");

	}
	
	
}
