package javapack;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class datainputstrm 
{

	   public static void main(String args[])throws IOException 
	   {

	      // writing string to a file encoded as modified UTF-8
	      DataOutputStream do1 = new DataOutputStream(new FileOutputStream("C:\\Users\\Admin\\Desktop\\ds.txt"));
	      //do1.writeUTF("welome to java");
	      do1.writeBytes("welcome to java");
	      //--
	      InputStream input = new FileInputStream("C:\\Users\\Admin\\Desktop\\ds.txt");  
	      DataInputStream inst = new DataInputStream(input);  
	      int count = input.available();  
	      byte[] ary = new byte[count];  
	      inst.read(ary);  
	      for (byte bt : ary)
	      {  
	        char k = (char) bt;  
	        System.out.print(k);  
	      //System.out.print(k+"-");  
	      }

        /**
	      // Reading data from the same file
	      DataInputStream dio = new DataInputStream(new FileInputStream("C:\\Users\\Admin\\Desktop\\ds.txt"));
	      do1.writeUTF("welome to java");

	      while(dio.available()>0) 
	      {
	        // byte s = (dio.readByte());
 	         System.out.print(dio.);
	      }
	      */
	   }
	}