package MainPackage;

import java.lang.reflect.Field;
import java.net.MalformedURLException;

import org.testng.annotations.Test;


public class seleniumgridnode4 
{
 @Test
 // @Parameters("browser")
  public void f() throws MalformedURLException, InterruptedException, InstantiationException, IllegalAccessException
  {
    //--------------first starts
	 Class<MainPackage.seleniumgridnode1> c=MainPackage.seleniumgridnode1.class; 
	 Field[] f1=c.getDeclaredFields();
	 seleniumgridnode1 ins=c.newInstance();            
	 for(int i = 0; i < f1.length; i++) 
	 {
	   System.out.println("Field=" + f1[i].getName().toString());
	   f1[1].set(ins,16);
	   System.out.println("Value=" + f1[i].get(ins));
	 }
   //Constructor[] co= c.getConstructors();
	 //Field f=c.getClass().getDeclaredField("num1c);
    // System.out.println(f1);      
	//-----------first ends  
     
   //--------------second starts
   	 Class<MainPackage.seleniumgridnode2> d=MainPackage.seleniumgridnode2.class; 
   	 Field[] f2=c.getDeclaredFields();
   	 seleniumgridnode2 ins1=d.newInstance();            
   	 for(int i = 0; i < f2.length; i++) 
   	 {
   	   System.out.println("Field=" + f2[i].getName().toString());
   	   f2[1].set(ins1,16);
   	   System.out.println("Value=" + f2[i].get(ins1));
   	 }
      //Constructor[] co= c.getConstructors();
   	 //Field f=c.getClass().getDeclaredField("num1c);
        //System.out.println(f1);      
   	//-----------second ends
        
        //--------------third starts
      	 Class<MainPackage.seleniumgridnode3> e=MainPackage.seleniumgridnode3.class; 
      	 Field[] f3=c.getDeclaredFields();
      	 seleniumgridnode3 ins2=e.newInstance();            
      	 for(int i = 0; i < f3.length; i++) 
      	 {
      	   System.out.println("Field=" + f3[i].getName().toString());
      	   f3[1].set(ins2,16);
      	   System.out.println("Value=" + f3[i].get(ins2));
      	 }
         //Constructor[] co= c.getConstructors();
      	 //Field f=c.getClass().getDeclaredField("num1c);
           //System.out.println(f3);      
      	//-----------third ends
	  
   } 
}


 