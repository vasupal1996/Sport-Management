
package demo;

import java.sql.*;
import demo.*;
import javax.swing.JOptionPane;

public class coach {
   
    public void insertData(coachprop p)
    {
        Connection conn=null;
        try
        {
            conn=connectionprovider.getConnection();
            PreparedStatement stmt=conn.prepareStatement("insert into coach_master(cid,cname,address,experience,salary,contact,gametype,game,gender) values(?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1,p.getId());
            stmt.setString(2,p.getName());
            stmt.setString(3,p.getAddress());
            stmt.setInt(4,p.getExperience());
            stmt.setInt(5,p.getSalary());
            stmt.setString(6,p.getContact());
            stmt.setString(7,p.getGametype());
            stmt.setString(8,p.getGame());
            stmt.setString(9,p.getGender());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "record inserted");
        }
        catch(Exception e)
        {
            System.out.println(" "+e);
        }
    }
      public void updateData(coachprop p)
    {
        Connection conn=null;
        try
        {
            conn=connectionprovider.getConnection();
            PreparedStatement stmt=conn.prepareStatement("update coach_master set cname=?,address=?,contact=?,salary=?,experience=?,gametype=?,game=?,gender=? where cid=? ");
            stmt.setInt(9, p.getId());
            stmt.setString(1,p.getName());
            stmt.setString(2,p.getAddress());
            stmt.setString(3,p.getContact());
            stmt.setInt(4,p.getSalary());
             stmt.setInt(5,p.getExperience());
             stmt.setString(6,p.getGametype());
            stmt.setString(7,p.getGame());
            stmt.setString(8,p.getGender());
          
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "record updated");
        }
        catch(Exception e)
        {
            System.out.println(" "+e);
        }
    }
          public void deleteData(coachprop p)
    {
        
        Connection conn=null;
    try
    {
     conn=connectionprovider.getConnection();
     PreparedStatement stmt=conn.prepareStatement("delete from coach_master where cid=? ");
             stmt.setInt(1,p.getId());
           
             stmt.executeUpdate();
             JOptionPane.showMessageDialog(null, "Record Deleted");
    }
    catch(Exception e)
    {
    System.out.println("coach_method"+e);
    }
    

    }
       public static int getMaxid()
{
     
        int z=0;
        ResultSet rs=null;
        Connection conn=null;
        try
        {
        conn=connectionprovider.getConnection();
        Statement st=conn.createStatement();
        
        rs=st.executeQuery("select max(cid) from coach_master");
        
        while(rs.next())
        {
        z=rs.getInt(1);
        }
       
        }
        catch(Exception e)
        {
        
        }
         return z;
    }
}
