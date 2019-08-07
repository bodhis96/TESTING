package javapack;

public class constructor 
{
	 
	public static void main(String[] args)
	{
	  int n1=2;
	  int n2=3;
	   sum2 s=new sum2(n1,n2);
	   int sum4= s.sum();
	   
	   //int n1=s.num1;
      // int n2=s.num2;			   
       System.out.println("Sum of"+n1+"and"+n2+"="+sum4);

	}

}
class sum2
{
	int num1;
 	int num2;
 	//----No argument constructor
	 sum2()
	 {
		 num1=2;
		 num2=3;
	 }
	 //---------------------------
	 //-------parameterized constructor
	 sum2(int nm1,int nm2)
	 {
		 num1=2;
		 num2=3;
	 }
	 //----------------------
	int sum()
	{
		int sum=num1+num2;
		return sum;
	}
	
}

