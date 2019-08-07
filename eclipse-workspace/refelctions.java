package javapack;

 public class refelctions
{
	public int num1=3;
 	int num2;
 	String s1="welcome";
 	String s2="akbar";

 	//----No argument constructor
	 refelctions()
	 {
		 num1=2;
		 num2=3;
	 }
	 //---------------------------
	 //-------parameterized constructor
	 refelctions(int nm1,int nm2)
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

