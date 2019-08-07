package javapack;

public class abstarctclass 
{
	public static void main(String[] args)
	{
	   two mu=new two();
 	   mu.display1();
 	   mu.display2();
	   mu.display3();
 	}
}
abstract class one 
{
	 
 	public abstract void display3();
 	void display1()
 	{
 		System.out.println("Hello Akbar");
 	}
}
class two extends one
{
	
 	void display2()
	{
 		System.out.println("welcome");
 	}
 	@Override
	public void display3()
 	{
 		System.out.println("Abstracted method");

 	}
 	
}
