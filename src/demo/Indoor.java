
package demo;


import java.sql.*;
import javax.swing.JOptionPane;

public class Indoor {
    private String gname;
    private int gid;   
    public void getData(String n,int i)
    {
    gname=n;
    gid=i;
    }
    public void insertData(prop p)
    {
        Connection conn=null;
        try
        {
            conn=connectionprovider.getConnection();
            PreparedStatement stmt=conn.prepareStatement("insert into indoor_master(gid, gname) values(?,?)");
            stmt.setInt(1, p.getId());
            stmt.setString(2,p.getName());
            stmt.executeUpdate();
            
        JOptionPane.showMessageDialog(null, "record inserted");
        }
        catch(Exception e)
        {
            System.out.println(" "+e);
        }
    }
    
    public void updateData(prop p)
     {
        Connection conn=null;
    try
    {
     conn=connectionprovider.getConnection();
     PreparedStatement stmt=conn.prepareStatement("update indoor_master set gname=? where gid=?");
             stmt.setInt(2,p.getId());
             stmt.setString(1, p.getName());
             stmt.executeUpdate();
             JOptionPane.showMessageDialog(null, "Record Updated");
    }
    catch(Exception e)
    {
    System.out.println("indoor"+e);
    }
     
     }
    public void deleteData(prop p)
     {
        Connection conn=null;
    try
    {
     conn=connectionprovider.getConnection();
     PreparedStatement stmt=conn.prepareStatement("delete from indoor_master where gid=?");
             stmt.setInt(1,p.getId());
         //    stmt.setString(2, p.getName());
             stmt.executeUpdate();
             JOptionPane.showMessageDialog(null, "Record Deleted");
    }
    catch(Exception e)
    {
    System.out.println("indoor_method"+e);
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
        
        rs=st.executeQuery("select max(gid) from indoor_master");
        
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
 