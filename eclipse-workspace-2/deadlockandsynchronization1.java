package javapack;

import java.io.FileReader;
import java.io.IOException;

public class deadlockandsynchronization1 
{
	public static void main(String[] args)
	{
      m c1=new m();
      th1 t1o=new th1(c1);
      t1o.start();
      th2 t2o=new th2(c1);
      t2o.start();
	}

}
class m
{
	 synchronized public void af()
	{
		try 
		    {
                 FileReader fr = new FileReader("C:\\Users\\Admin\\Desktop\\topics.txt");
                 int s;
                  while ((s=fr.read())!=-1)
                 {
                    System.out.print((char)s);
                 }
                      fr.close();
             } 
         catch (IOException e)
            {
               System.out.print("No such file");
    	       // e.getMessage();
               //e.printStackTrace();
            }	
	}
}
class th1 extends Thread
{
	m cm;
	
 	  
    th1(m c1) 
    { 
        this.cm = c1; 
    } 
	
	@Override
	public void run()
	{
		 cm.af();
	}
}

class th2 extends Thread
{
	m cm;
	
	  
    th2(m c1) 
    { 
        this.cm = c1; 
    } 
	
	@Override
	public void run()
	{
		 cm.af();
	}
}



