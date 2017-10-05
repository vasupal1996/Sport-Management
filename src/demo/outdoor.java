
package demo;
import demo.*;
import java.sql.*;
import javax.swing.JOptionPane;


public class outdoor {
    private String gname;
    private int gameid;
    public void getData(String n,int i)
    {
        
    gname=n;
    gameid=i;
    }
    public void insertData(outprop p)
    {
        Connection conn=null;
        try
        {
            conn=connectionprovider.getConnection();
            PreparedStatement stmt=conn.prepareStatement("insert into outdoor_master(gid,gname) values(?,?)");
            stmt.setString(2, p.getName());
            stmt.setInt(1, p.getId());
            
            stmt.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "record inserted");
        }
        catch(Exception e)
        {
            System.out.println(" "+e);
        }
    }
     public void updateData(outprop p)
    {
        Connection conn=null;
        try
        {
            conn=connectionprovider.getConnection();
            PreparedStatement stmt=conn.prepareStatement("update outdoor_master set gname=? where gameid=?");
            stmt.setInt(1, p.getId());
            stmt.setString(2,p.getName());
            stmt.executeUpdate();
             JOptionPane.showMessageDialog(null, "record Updated");
        }
        catch(Exception e)
        {
            System.out.println(" "+e);
        }
    
    }
       public void deleteData(outprop p)
    {
        Connection conn=null;
        try
        {
            conn=connectionprovider.getConnection();
            PreparedStatement stmt=conn.prepareStatement("delete from outdoor_master where gameid=?");
            stmt.setInt(1, p.getId());
          //  stmt.setString(1,gname);
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
     
        int y=0;
        ResultSet rs=null;
        Connection conn=null;
        try
        {
        conn=connectionprovider.getConnection();
        Statement st=conn.createStatement();
        
        rs=st.executeQuery("select max(gid) from outdoor_master");
        
        while(rs.next())
        {
        y=rs.getInt(1);
        }
       
        }
        catch(Exception e)
        {
        
        }
         return y;
    }
}
