package javapack;

public class passbyvalue
{  

    public static void main(String args[])
    {  
        int value=10;  
        System.out.println("before change "+value);  
        alter(value);
        System.out.println("after change "+value);  

       
     }
    public static void alter(int v)
    {  
      v=v+100;
      System.out.println("after change "+v);  

    }  
        
      
}  
   