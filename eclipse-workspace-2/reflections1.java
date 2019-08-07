package javapack;

import java.lang.reflect.Field;
public class reflections1
{
	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InstantiationException 
	{
		 Class<javapack.refelctions> c=javapack.refelctions.class; 
		 Field[] f1=c.getDeclaredFields();
		 javapack.refelctions ins=c.newInstance();            
		 for(int i = 0; i < f1.length; i++) 
		 {
		   System.out.println("Field=" + f1[i].getName().toString());
		   f1[1].set(ins,16);
		   System.out.println("Value=" + f1[i].get(ins));
		 }
	   //Constructor[] co= c.getConstructors();
		 //Field f=c.getClass().getDeclaredField("num1c);
	     System.out.println(f1); 
       /**
		for(Constructor c1:co)
		{
	     System.out.println(c1); 
		}
		*/
	}

}

 