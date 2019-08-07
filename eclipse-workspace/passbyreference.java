package javapack;

public class passbyreference
{  

  //private int value=10;
	public static void main(String args[])
    {  
        int[] value= {10,20};  
        System.out.println("before calling "+value[0]);  
        c p=new c();
        p.alter(value);
        System.out.println("after calling "+value[0]);  

       
     }
}
class c
{
    public static void alter(int[] v)
    {  
      v[0]=v[0]+100;
    //System.out.println("after change "+v);  

    }  
        
      
}  
   