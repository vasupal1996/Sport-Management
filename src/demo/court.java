
package demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class court {
      private String cname;
    private int cid;
    public void getData(String n,int i)
    {
    cname=n;
    cid=i;
    }
    public void insertData(courtprop p)
    {
        Connection conn=null;
        try
        {
            conn=connectionprovider.getConnection();
            PreparedStatement stmt=conn.prepareStatement("insert into court_master(cid,cname) values(?,?)");
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
    
    public void updateData(courtprop p)
     {
        Connection conn=null;
    try
    {
     conn=connectionprovider.getConnection();
     PreparedStatement stmt=conn.prepareStatement("update court_master set cname=? where cid=?");
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
      public void deleteData(courtprop p)
     {
        Connection conn=null;
    try
    {
     conn=connectionprovider.getConnection();
     PreparedStatement stmt=conn.prepareStatement("delete from court_master where cid=?");
             stmt.setInt(1,p.getId());
            // stmt.setString(1, p.getName());
             stmt.executeUpdate();
             JOptionPane.showMessageDialog(null, "Record Deleted");
    }
    catch(Exception e)
    {
    System.out.println("indoor"+e);
    }
     
}
          public static int getMaxid()
{
     
        int q=0;
        ResultSet rs=null;
        Connection conn=null;
        try
        {
        conn=connectionprovider.getConnection();
        Statement st=conn.createStatement();
        
        rs=st.executeQuery("select max(cid) from court_master");
        
        while(rs.next())
        {
        q=rs.getInt(1);
        }
       
        }
        catch(Exception e)
        {
        
        }
         return q;
    }

}
