package javapack;

public class interfaceandmultipleinheritance
{
	public static void main(String[] args)
	{
	      
	  multiply12 m=new multiply12();
 	  int prod= m.mul();
	  int sum= m.sum();
	  int n1=m.num1;
	  int n2=m.num2;
	  int nb1=m.numb1;
	  int nb2=m.num2;
	  System.out.println("Sum of"+n1+"and"+n2+"="+sum);
	  System.out.println("Product of"+nb1+"and"+nb2+"="+prod);
	  m.display1();
	  m.display2();
	}
}
class summtyrq
{
	int num1=12;
 	int num2=3;
 	int sum()
	{
		int sum=num1+num2;
		return sum;
	}
}
interface a11
{
	public void display1();
}

interface a22
{
	public void display2();

	}
class multiply12 extends summtyrq implements a11,a22
{
	int numb1=2;
 	int numb2=3;
 	 
	int mul()
	{
		int mul=numb1*numb2;
		return mul;
	}
     
	@Override
	public void display1() 
	{
       System.out.println("interface 1");		
	}
	@Override
	public void display2() 
	{
	       System.out.println("interface 2");		
		
	}
	
	
}
