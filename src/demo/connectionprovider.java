package demo;

import demo.provider;
import java.sql.Connection;
import java.sql.DriverManager;


public class connectionprovider implements provider
{
    
     public static Connection conn=null;
static
{
    try
    {
        Class.forName(Driver);
        conn=DriverManager.getConnection(connectionUrl,username,password);
        System.out.println("connection established");
    }
    catch(Exception e)
    {
        System.out.println("" +e);
        
         System.out.println("connection established");
    }
    
}
public static Connection getConnection()
{
    

return conn;

}
    
}
