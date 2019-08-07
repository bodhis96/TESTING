package MainPackage;

import  java.sql.Connection;
import  java.sql.DriverManager;
import  java.sql.ResultSet;
import  java.sql.SQLException;
import  java.sql.Statement;		
public class  databasetesting
{				
    	public static void  main(String[] args) throws  ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException 
    	{													
			
            int flag = 0;

    		//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"		
                //String dbUrl = "jdbc:mysql://localhost:3306/akbarnew1";		
    		
 
                
            //"jdbc:mysql://localhost:3306/projects?user=user1&password=123");


				//Database Username		
				String username = "root";	
                
				//Database Password		
				String password = "mysore15";				

				//Query to Execute		
				String selectquery = "select * from table1;";	
			String insertquery = "insert into table1 values('aditya',19);";	

         	    //Load mysql jdbc driver		
           	    Class.forName("com.mysql.jdbc.Driver");		
           
           		//Create Connection to DB		
            	//Connection con = DriverManager.getConnection(dbUrl,username,password);
            	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/akbars","akbar","mysore15");
                if (con != null)
                {
                     System.out.println("Connected to the Database...");
                 }
          
          		//Create Statement Object		
        	   Statement stmt = con.createStatement();	
        	   Statement stmt1 = con.createStatement();	

        	   try
        	   {
    	         stmt.execute(insertquery);
                 System.out.println("sql insert query was successfull");

        	   }
        	   catch(Exception e)
        	   {
                   System.out.println("sql insert query was not successfull");
 
        	   }

        	   //---------------Select query starts
        	   
        	   //----------------select query to check inserted record starts
        	   try
        	   {
        	       ResultSet rs= stmt1.executeQuery(selectquery);							
         		// While Loop to iterate through all data and print results		
				   while (rs.next())
				  {
			        String name = rs.getString(1);								        
                    String age  = rs.getString(2);					                               
                    System. out.println(name+"  "+age);
                      if(name.equalsIgnoreCase("hitesh"))
                     {
                          flag=1;
                          break;
                     }
                      else
                      {
                          flag=0;
 
                      }

                   }
                   System.out.println("sql select query was successfull");

                   System.out.println(flag);

                   if(flag==1)
                   {
                   	  //System.out.println("sql insert query was successfull-the record named hitesh exists - No Defect");
                      System.out.println("sql insert query was successfull-the record named aditya exists was successfully inserted sql insert statement is working  good - No Defect");

                   }
                    else
                    {
                    // System.out.println("sql insert query was successfull-the record named hitesh dosnt exists -A Defect");
 	                   System.out.println("sql insert query was not successfull-the record named aditya was not successfully inserted sql  insert statement is not working good -A Defect");
                   }
        	   }
        	   catch(Exception e)
        	   {
                   System.out.println("sql select query was not successfull");
        	   }
        	   
        	   //----------------select query to check inserted record ends

        	   /**

       			// Execute the SQL Query. Store results in ResultSet	
        	   try
        	   {
        	       ResultSet rs= stmt.executeQuery(query);							
         		// While Loop to iterate through all data and print results		
				while (rs.next()){
			        		String myName = rs.getString(1);								        
                            String myAge = rs.getString(2);					                               
                            System. out.println(myName+"  "+myAge);		
                    }	
                System.out.println("sql select query was successfull");
        	   }
        	   catch(Exception e)
        	   {
                   System.out.println("sql select query was not successfull");
        	   }
        	   */
        	   //---------------Select query ends
      			 // closing DB Connection		
        	  
      			con.close();			
		}
}
    	