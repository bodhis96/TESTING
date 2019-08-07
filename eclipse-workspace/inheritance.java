package javapack;

public class inheritance 
{
	public static void main(String[] args)
	{
	  multiply m=new multiply();
	  int prod= m.mul();
	  int sum= m.sum();
	  int n1=m.num1;
	  int n2=m.num2;
	  int nb1=m.numb1;
	  int nb2=m.num2;
	  System.out.println("Sum of"+n1+"and"+n2+"="+sum);
	  System.out.println("Product of"+nb1+"and"+nb2+"="+prod);
	}
}
class summ
{
	int num1=12;
 	int num2=3;
 	int sum()
	{
		int sum=num1+num2;
		return sum;
	}
}

class multiply extends summ
{
	int numb1=2;
 	int numb2=3;
 	 
	int mul()
	{
		int mul=numb1*numb2;
		return mul;
	}
	
	
}



