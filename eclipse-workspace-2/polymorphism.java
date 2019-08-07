package javapack;

public class polymorphism
{
	public static void main(String[] args)
	{
		  int num1=1;
		  int num2=3;
		  fi a=new fi();
		  int f=a.sum();
		  int s=a.sum(num1,num2);
		  System.out.println("First sum"+f);
		  System.out.println("Second sum"+s);
	}
}
class fi
{
	int num1=12;
 	int num2=3;
 	int sum()
	{
		int sum=num1+num2;
		return sum;
	}
 	int sum(int a1,int b1)
	{
		int sum=a1+b1;
		return sum;
	}
}	