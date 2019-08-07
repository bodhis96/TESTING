package javapack;

public class arrayandexception 
{
	public static void main(String[] args)
	{
      //int[] a=new int[5];
		int[] a={1, 2, 0, 5};
      int l=a.length;
      for(int i=0;i<l;i++)
      {
    	  System.out.println(a[i]);
      }
      try
      {
	     System.out.println(a[5]);
	     int sum=10/a[2];
      }
      catch(ArithmeticException e)
      {
         System.out.println("you are dividing by zero");
       }
      catch(ArrayIndexOutOfBoundsException e)
      {
         System.out.println("The length is exceeded");
         //System.out.println(e.getMessage());
      }
     finally
      {
 	     System.out.println("final block");
      }
	     System.out.println("welcome");

 	}
}
