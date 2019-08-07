package javapack;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class transientserialization implements Serializable
{
     int a=2;
     int b=3;
   //transient int b=3;
   
  public static void main(String args[]) throws IOException, ClassNotFoundException
  {
	  transientserialization g1=new transientserialization();
	 System.out.println(g1.a);
	 System.out.println(g1.b);
	 File f=new File("C:\\Users\\Admin\\Desktop\\s.txt");
	 FileOutputStream fo=new FileOutputStream(f);
	 ObjectOutputStream oo=new ObjectOutputStream(fo);
	 oo.writeObject(g1);
	 garbagecollection g2;
	 FileInputStream fi=new FileInputStream(f);
	 ObjectInputStream oi=new ObjectInputStream(fi);
	 transientserialization g3=(transientserialization) oi.readObject();
	 System.out.println(g3.a);
	 System.out.println(g3.b);


	 
	 
	 
  }
}