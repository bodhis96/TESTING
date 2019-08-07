package javapack;

public class encapsulation 
{
      
	public static void main(String[] args)
	{
		e2 l=new e2();
		l.sum1();
		
 	}
}
class e1
{
	private int num1=12;
 	public  int num2=3;
    int sum()
	{
 		int sum=num1+num2;
		return sum;
	}
}
class e2 extends e1
{
	 
    void sum1()
	{
 		//System.out.println(num1);
 		System.out.println(num2);
	}
}
 
