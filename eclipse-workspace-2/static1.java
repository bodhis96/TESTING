package javapack;

public class static1 
{
	public static void main(String[] args)
	{
	//Static variable
	  int v=stat.num1;
	  System.out.println("Num1="+v);
	  stat.sum();
 	}
}
class stat
{
	static int num1=12;
 	static int num2=3;
 	static int sum()
	{
 		
		int sum=num1+num2;
		return sum;
	}
}

 