
package demo;

import java.sql.*;
import javax.swing.JOptionPane;

public class user {
   
    String uname;
        String pass;
    public void getData(String u, String p) {
        this.uname = u;
        this.pass = p;
    }
    public void insertData(String u, String p)
    {
        
        Connection conn=null;
        try
        {
            conn=connectionprovider.getConnection();
            PreparedStatement stmt=conn.prepareStatement("insert into userlogin(uname,pass)values(?,?)");
            stmt.setString(1,uname);
            stmt.setString(2,pass);
            stmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "record inserted");
        }
        catch(Exception e)
        {
            System.out.println(" "+e);
        }
    }
    
    

}