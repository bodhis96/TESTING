package javapack;

public class threadsusingthread 
{
	public static void main(String[] args)
	{
      t1 t1o=new t1();
      t1o.start();
      t2 t2o=new t2();
      t2o.start();
	}

}
class t1 extends Thread
{
	public void run()
	{
		System.out.println("thread1");
	}
}
class t2 extends Thread
{
	public void run()
	{
		System.out.println("thread2");
	}
}

