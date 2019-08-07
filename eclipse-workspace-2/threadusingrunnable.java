package javapack;

public class threadusingrunnable 
{
	public static void main(String[] args)
	{
      r1 t1o=new r1();
      r2 t2o=new r2();
      Thread t1f =new Thread(t1o);  
      Thread t2f =new Thread(t2o);  
      t1f.setPriority(1);
      t2f.setPriority(2);
      t1f.start();
      t2f.start();
	}
}
class r1 implements Runnable
{
	@Override
	public void run()
	{
		 for(int i=0;i<=10;i++)
		 {
		    System.out.println("thread1");
		    if(i==4)
		    {
		    	Thread.yield();
		    }
		 }
	}
}
class r2 implements Runnable
{
	@Override
	@SuppressWarnings("deprecation")
	public void run()
	{
		 for(int i=0;i<=10;i++)
		 {
		    System.out.println("thread2");
		    
		 }
	}
}
