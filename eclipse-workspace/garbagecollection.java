package javapack;

class garbagecollection
{
     int a;
     static garbagecollection g3;
        public void s(int c)
      {
         a=c;
      }
       public void dis()
       {
         System.out.println("a="+a);
       }
       
    public static void main(String args[])
    {
	 garbagecollection g1=new garbagecollection();
	 garbagecollection g2=new garbagecollection();
   //garbagecollection g3;
     g3=g2;
     g1.s(1);
     g2.s(3);
     g1.dis();
     g2.dis();
     //g3=g2;
     g3.dis();
     g2=null;
     g3.dis();
    //g3=null;
     g1.finalize();
     System.gc();  
     try
     {
        g3.dis();
     }
     catch(Exception e)
     {
    	 System.out.println("object no more exists");
     }
     }
    public void finalize()
    {
 	   g3=null;
 	   System.out.println("finalize called");
	   }  

}
 