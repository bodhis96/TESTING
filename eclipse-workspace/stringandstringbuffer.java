package javapack;

public class stringandstringbuffer 
{
	public static void main(String[] args)
	{
	      
	  //String s1="welcome";
      StringBuffer s=new StringBuffer("welcome");
    //System.out.println("String name is="+s1);
	  //String s2=s1+"akbar";
      System.out.println("String name is="+s);
      StringBuffer s3=s.append(" akbar");
      System.out.println("String after addition/manipulation is="+s3);

      
	   
	}

}
