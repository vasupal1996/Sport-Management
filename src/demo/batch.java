
package demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class batch {
 private String btime;
    private int bid;
    public void getData(String n,int i)
    {
    btime=n;
    bid=i;
    }
    public void insertData(batchprop p)
    {
        Connection conn=null;
        try
        {
            conn=connectionprovider.getConnection();
            PreparedStatement stmt=conn.prepareStatement("insert into batch_master(bid, btime) values(?,?)");
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
     public void updateData(batchprop p)
    {
        Connection conn=null;
        try
        {
            conn=connectionprovider.getConnection();
            PreparedStatement stmt=conn.prepareStatement("update batch_master set btime=? where bid=?");
            stmt.setInt(2, p.getId());
            stmt.setString(1,p.getName());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "record updated");
        }
        catch(Exception e)
        {
            System.out.println(" "+e);
        }
    }    
        public void deleteData(batchprop p)
    {
        Connection conn=null;
        try
        {
            conn=connectionprovider.getConnection();
            PreparedStatement stmt=conn.prepareStatement("delete from batch_master where bid=?");
            stmt.setInt(1, p.getId());
           // stmt.setString(2,btime);
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "record deleted");
        }
        catch(Exception e)
        {
            System.out.println(" "+e);
        }
    }    
          public static int getMaxid()
{
     
        int b=0;
        ResultSet rs=null;
        Connection conn=null;
        try
        {
        conn=connectionprovider.getConnection();
        Statement st=conn.createStatement();
        
        rs=st.executeQuery("select max(bid) from batch_master");
        
        while(rs.next())
        {
        b=rs.getInt(1);
        }
       
        }
        catch(Exception e)
        {
        
        }
         return b;
    }

}
