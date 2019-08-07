package javapack;

import java.io.FileReader;
import java.io.IOException;

public class deadlocksynchronization 
{
	public static void main(String[] args)
	{
      common c1=new common();
      st1 t1o=new st1(c1);
      t1o.start();
      st2 t2o=new st2(c1);
      t2o.start();
	}

}

class common 
{
	synchronized  public void af()
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
class st1 extends Thread
{
	common cm;
	
 	  
    st1(common common) 
    { 
        this.cm = common; 
    } 
	
	@Override
	public void run()
	{
		 cm.af();
	}
}

class st2 extends Thread
{
	common cm;
	
	  
    st2(common common) 
    { 
        this.cm = common; 
    } 
	
	@Override
	public void run()
	{
		 cm.af();
	}
}


