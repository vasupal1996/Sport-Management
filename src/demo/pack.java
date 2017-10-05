
package demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import javax.swing.JOptionPane;


public class pack {
    private int id;
      private String pack;
    private int amount;
    public void getData(String p,int a)
    {
    pack=p;
    amount=a;
    }
    public void insertData(packprop g)
    {
        Connection conn=null;
        try
        {
            conn=connectionprovider.getConnection();
            PreparedStatement stmt=conn.prepareStatement("insert into pack_master values(?,?,?)");
            stmt.setInt(3, g.getAmount());
            stmt.setString(2,g.getPack());
            stmt.setInt(1, g.getId());
            int i = stmt.executeUpdate();
            if(i>0){
        JOptionPane.showMessageDialog(null,"record inserted");        
            }else
        JOptionPane.showMessageDialog(null, "no record inserted");
        }
        catch(Exception e)
        {
            System.out.println(" "+e);
        }
    }
        public void updateData(packprop g)
    {
        Connection conn=null;
        try
        {
            conn=connectionprovider.getConnection();
            PreparedStatement stmt=conn.prepareStatement("update pack_master set pack=?,amount=? where id=?");
            stmt.setInt(2, g.getAmount());
            stmt.setString(1,g.getPack());
            stmt.setInt(3, g.getId());
            stmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "record updated");
        }
        catch(Exception e)
        {
            System.out.println(" "+e);
        }

    }
         public void deleteData(packprop g)
    {
        Connection conn=null;
        try
        {
            conn=connectionprovider.getConnection();
            PreparedStatement stmt=conn.prepareStatement("delete from pack_master  where id=?");
         //   stmt.setInt(2, g.getAmount());
         //   stmt.setString(1,g.getPack());
            stmt.setInt(1, g.getId());
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
     
        int g=0;
        ResultSet rs=null;
        Connection conn=null;
        try
        {
        conn=connectionprovider.getConnection();
        Statement st=conn.createStatement();
        
        rs=st.executeQuery("select max(id) from pack_master");
        
        while(rs.next())
        {
        g=rs.getInt(1);
        }
       
        }
        catch(Exception e)
        {
        
        }
         return g;
    }

}