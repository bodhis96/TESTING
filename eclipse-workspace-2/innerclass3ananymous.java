package javapack;

interface show 
{ 
    void s(); 

} 
class innerclass3ananymous 
{ 
    public static void main(String[] args) 
    { 
   
        show oj1 = new show()
        { 
            @Override
            public void s() 
            { 
                System.out.print("welcome"); 
            } 
        }; 
        oj1.s(); 
    } 
} 