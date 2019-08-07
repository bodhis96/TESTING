package javapack;

public class superandthis 
{
	public static void main(String[] args)
	{
	  multiplyuy m=new multiplyuy();
	  m.s();
	 
	   
	}
}
class summmn
{
	int num1=12;
	void s()
	{
       System.out.println(num1);
	}
}

class multiplyuy extends summmn
{
	int num1=2;
	void s()
	{
       //System.out.println(num1);
         System.out.println(super.num1);

	}
	
	
}
