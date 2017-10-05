
package demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class application {
      private int aid;
    private String aname;
      private String fname;
      private String address;
      private long contact;
      private String email;
      private String dob;
      private String gender;
      private String gametype;
      private String game;
      private String batch;
      private String court;
      private String coach;
      
            private String pack;
            private long fee;
    public void getData(String n,int i ,long a)
    {
    aname=n;
    aid=i;
    contact=a;
    coach=n;
    fname=n;
    address=n;
    
    court=n;
    batch=n;
    game=n;
    gametype=n;
    gender=n;
    email=n;
    dob=n;
    pack=n;
    fee=a;
            }
    public void insertData(appprop p)
    {
        Connection conn=null;
        try
        {
            conn=connectionprovider.getConnection();
            PreparedStatement stmt=conn.prepareStatement("insert into application(aid,aname,fname,address,contact,email,dob,gender,gametype,game,batch,coach,court,pack,fee) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setInt(1, p.getId());
            stmt.setString(2,p.getName());
            stmt.setString(3,p.getFname());
            stmt.setLong(5,p.getContact());
           stmt.setString(4,p.getAddress());
           stmt.setString(6,p.getEmail());
           stmt.setString(7,p.getDob());
           stmt.setString(8,p.getGender());
             stmt.setString(9,p.getGametype());
               stmt.setString(10,p.getGame());
                 stmt.setString(11,p.getBatch());
                       stmt.setString(13,p.getCourt());
                         stmt.setString(12,p.getCoach());
                          stmt.setString(14,p.getPackage());
                           stmt.setLong(15,p.getFee());
                       stmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "record inserted");
        }
        catch(Exception e)
        {
            System.out.println(" "+e);
        }
    }
     public void updateData(appprop p)
    {
        Connection conn=null;
        try
        {
            conn=connectionprovider.getConnection();
            PreparedStatement stmt=conn.prepareStatement("update application set aname=?,fname=?,address=?,contact=?,email=?,dob=?,gender=?,gametype=?,game=?,batch=?,membertype=?,membership=?,coach=?,court=?,pack=?,fee=? where aid=?");
            stmt.setInt(17, p.getId());
            stmt.setString(1,p.getName());
            stmt.setString(2,p.getFname());
            stmt.setLong(4,p.getContact());
           stmt.setString(3,p.getAddress());
           stmt.setString(5,p.getEmail());
           stmt.setString(6,p.getDob());
           stmt.setString(7,p.getGender());
             stmt.setString(8,p.getGametype());
               stmt.setString(9,p.getGame());
                 stmt.setString(10,p.getBatch());
   
                       stmt.setString(13,p.getCourt());
                         stmt.setString(14,p.getCoach());
                          stmt.setString(15,p.getPackage());
            stmt.setLong(16,p.getFee());
            stmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "record updated");
        }
        catch(Exception e)
        {
            System.out.println(" "+e);
        }
}
     public void deleteData(appprop p)
     {
 Connection conn=null;
        try
        {
            conn=connectionprovider.getConnection();
            PreparedStatement stmt=conn.prepareStatement("delete from application where aid=?");   
             stmt.setInt(1, p.getId());
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
     
        int x=0;
        ResultSet rs=null;
        Connection conn=null;
        try
        {
        conn=connectionprovider.getConnection();
        Statement st=conn.createStatement();
        
        rs=st.executeQuery("select max(aid) from application");
        
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
