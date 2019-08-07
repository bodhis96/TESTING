package javapack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class streams 
{
	public static void main(String[] args) throws IOException
	{
      int[] a=new int[5];
      //InputStream is = new InputStream();
     // BufferedInputStream bis = new BufferedInputStream(bis);
      
      // create data input stream to read data in form of primitives.
     // DataInputStream in = new DataInputStream(bis);
      /**
	  System.out.println("Enter array elements using datainputstream");

       

	  
	  DataInputStream dis = new DataInputStream(System.in);
	    String str="Enter your Age :";
	    int e=dis.read();
 		  DataOutputStream dos = new DataOutputStream(System.out);
		  dos.write(e);
*/
	    
	    
	  
      //String str="Enter ;the array elements";
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  System.out.println("Enter array elements");

     // String inputString = input.readLine();

      for(int i=0;i<5;i++)
      {
         
          a[i]=Integer.parseInt(br.readLine());
      }
      int l=a.length;
	  System.out.println(l);

      for(int i=0;i<l;i++)
      {
    	  System.out.println(a[i]);
      }
      try
      {
	     System.out.println(a[5]);
      }
      catch(Exception e1)
      {
         System.out.println("The length is exceeded");
         System.out.println(e1.getMessage());
      }
	     System.out.println("welcome");

 	}
}
