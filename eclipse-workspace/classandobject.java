package javapack;

public class classandobject 
{
	public static void main(String[] args)
	{
	   int num1=2;
	   int num2=3;
	   add a=new add();
       int sum1=a.sum(num1,num2);
       System.out.println("Sum of"+num1+"and"+num2+"="+sum1);
	}

}
 class add
{
	//int num1=2;
	//int num2=3;
	int sum(int num1,int num2)
	{
		int sum=num1+num2;
		return sum;
	}
	
}
