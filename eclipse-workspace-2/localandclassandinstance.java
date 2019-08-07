package javapack;

public class localandclassandinstance 
{
      int numc=12;
    //final int numc=12;

  	  void d1()
	{
 		int numl1=2;
		int numl2=3;
		int sum=numl1+numl2;
	    System.out.println("Sum of"+numl1+"and"+numl2+"="+sum);

	}
  	 void d2()
 	{
  		//Fianal
   	    System.out.println("class variable before change"+numc);
        numc=numc+2;
  	    System.out.println("class variable after change"+numc);
 	  //System.out.println("Sum of"+numl1+"and"+numl2+"="+sum);

 	}
	public static void main(String[] args)
	{
		localandclassandinstance l=new localandclassandinstance();
		l.d2();
		
 	}
}
class stat1
{
	static int num1=12;
 	static int num2=3;
 	static int sum()
	{
 		int sum=num1+num2;
		return sum;
	}
}

 