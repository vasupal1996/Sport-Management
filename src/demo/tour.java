
package demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class tour {
     public void insertData(tourprop p)
    {
        Connection conn=null;
        try
        {
            conn=connectionprovider.getConnection();
            PreparedStatement stmt=conn.prepareStatement("insert into tournament(id,name,address,contact,email,gender,gametype,game,court,time,days,dates) values(?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1, p.getId());
            stmt.setString(2,p.getName());
           
            stmt.setLong(4,p.getContact());
           stmt.setString(3,p.getAddress());
           stmt.setString(5,p.getEmail());
          
           stmt.setString(6,p.getGender());
             stmt.setString(7,p.getGametype());
               stmt.setString(8,p.getGame());
                 
                       stmt.setString(9,p.getCourt());
                       stmt.setString(12,p.getDate());
                       stmt.setString(10,p.getTime());
                       stmt.setString(11,p.getDay());
                       
                        
            stmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "record inserted");
        }
        catch(Exception e)
        {
            System.out.println(" "+e);
        }
    }
      public static int getMaxid()
{
     
        int x=0;
        ResultSet rs=null;
        Connection conn=null;
        try
        {
        conn=connectionprovider.getConnection();
        Statement st=conn.createStatement();
        
        rs=st.executeQuery("select max(id) from tournament");
        
        while(rs.next())
        {
        x=rs.getInt(1);
        }
       
        }
        catch(Exception e)
        {
        
        }
         return x;
    }
}
