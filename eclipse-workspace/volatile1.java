package javapack;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class volatile1 
{
	public static void main(String[] args)
	{
      common1 c1=new common1();
      st11 t1o=new st11(c1);
      st22 t22o=new st22(c1);
      //t1o.start();
      t22o.start();
   }

}
class common1 
{
	public static int num=4;
	public int i=1;
    synchronized void dis()
	 {
 		 while(i<6)
		 {
		    System.out.println(Thread.currentThread());
		    i++;
		 }
	 }
	 
	 
	 
}
class st11 extends Thread
{
	//private volatile int n1;
    //private volatile int v = 1;
    
    common1 cm1;
 	  
    public st11(common1 c1) 
    {
        //this.n1=common1.num;
        this.cm1=c1;
    }

	void c() 
    { 
      // n1=n1+1;  
    } 
	
	public void run()
	{    
	    System.out.println("thread 1");
		cm1.dis();
 	}
}

class st22 extends Thread
{
	//private volatile int n1;
   // private volatile int v = 1;
    common1 cm1;

    
 	  
    public st22(common1 c1) 
    {
        //this.n1=c1.num;
        this.cm1=c1;

    }

	void c() 
    { 
      // n1=n1+1;  
    } 
	
	public void run()
	{
		 System.out.println("thread 2");
		 cm1.dis();
	}
}

 

