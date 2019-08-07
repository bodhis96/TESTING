package javapack;

public class pm 
{
	public static void main(String[] args)
	{
	  p2 e=new p2();
    }
	public void ad()
	{
		System.out.println("welcome");
	}
}
class p1
{
	private int num1=12;
 	private int num2=3;
	protected int num3=12;
	public int num4=12;
	
	protected void ad()
	{
		System.out.println("welcome");
	}


 }

class p2 extends p1
{
	int numb1=2;
 	int numb2=3;
}
