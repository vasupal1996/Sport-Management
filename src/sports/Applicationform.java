/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sports;



import demo.*;

import java.sql.*;
import javax.swing.JOptionPane;

public class Applicationform extends javax.swing.JFrame {
int gid=0;
int bid=0;
int mid=0;
    public Applicationform() {
        initComponents();
         int x=application.getMaxid();
        x=x+1;
        jTextField1.setEditable(true);
        jTextField1.setText(String.valueOf(x));
          try // game type
        {
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Connection conn=DriverManager.getConnection("jdbc:sqlserver://localhost:49171;databaseName=sports;integratedSecurity=true");
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","oracle");
            Statement stmt=conn.createStatement();
          
            ResultSet rs=stmt.executeQuery("select gType from gameType");
            
            while(rs.next())
            {
            jComboBox1.addItem(rs.getString("gType"));
            }
            
        }
        catch(Exception e)
        {
        
        
        }
          try //batch timing
          {
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Connection conn=DriverManager.getConnection("jdbc:sqlserver://localhost:49171;databaseName=sports;integratedSecurity=true");
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","oracle");
            Statement stmt=conn.createStatement();
          
            ResultSet rs=stmt.executeQuery("select btime from batch_master");
               while(rs.next())
            {
            jComboBox3.addItem(rs.getString("btime"));
            }
          }
          catch(Exception e)
                  {
                      
                  }
          
                     try // coach name
          {
              //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Connection conn=DriverManager.getConnection("jdbc:sqlserver://localhost:49171;databaseName=sports;integratedSecurity=true");
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","oracle");
            Statement stmt=conn.createStatement();
          
            ResultSet rs=stmt.executeQuery("select cname from coach_master");
               while(rs.next())
            {
            jComboBox6.addItem(rs.getString("cname"));
            }
          }
          catch(Exception e)
                  {
                      
                  }    
             try //courtname
          {
              //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            //Connection conn=DriverManager.getConnection("jdbc:sqlserver://localhost:49171;databaseName=sports;integratedSecurity=true");
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","oracle");
            Statement stmt=conn.createStatement();
          
            ResultSet rs=stmt.executeQuery("select cname from court_master");
               while(rs.next())
            {
            jComboBox7.addItem(rs.getString("cname"));
            }
          }
          catch(Exception e)
                  {
                      
                  }
        try //package
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","oracle");
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select pack from pack_master");
            while(rs.next())
            {
                jComboBox8.addItem(rs.getString("pack"));
            }
        
        }  catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, ""+e);
        }

    
        /*try //fees 
        {
            String g=(String)jComboBox8.getSelectedItem();
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","oracle");
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select amount from pack_master where pack='" + g + "'");
            
            while(rs.next())
            {
                jComboBox9.addItem(rs.getString("amount"));
            }
        } catch (Exception e)
        {
        JOptionPane.showMessageDialog(rootPane, ""+e);
    }*/

    }   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jtextField33 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jComboBox8 = new javax.swing.JComboBox();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(511, 620));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel1.setText("ID:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(56, 51, 121, 17);

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei", 0, 24)); // NOI18N
        jLabel2.setText("APPLICATION FORM");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(160, 10, 299, 33);

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel3.setText("NAME:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(56, 79, 121, 17);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(195, 51, 281, 20);

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel4.setText("FATHER'S NAME:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(56, 107, 121, 17);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(195, 79, 281, 20);

        jtextField33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtextField33ActionPerformed(evt);
            }
        });
        getContentPane().add(jtextField33);
        jtextField33.setBounds(195, 107, 281, 20);

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel5.setText("ADDRESS:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(56, 135, 121, 17);

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel6.setText("CONTACT:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(56, 163, 121, 17);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(195, 130, 281, 20);

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel7.setText("EMAIL ID:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(56, 191, 121, 17);

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4);
        jTextField4.setBounds(195, 163, 281, 20);

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel8.setText("GAME TYPE:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(56, 275, 121, 17);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5);
        jTextField5.setBounds(195, 191, 281, 20);

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel9.setText("GAME:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(56, 303, 121, 17);

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1);
        jComboBox1.setBounds(195, 275, 281, 20);

        jLabel10.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel10.setText("BATCH TIMING:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(56, 331, 121, 17);

        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox2);
        jComboBox2.setBounds(195, 303, 281, 20);

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox3);
        jComboBox3.setBounds(195, 331, 281, 20);

        jLabel13.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel13.setText("COACH ALLOTED:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(56, 471, 121, 17);
        getContentPane().add(jComboBox6);
        jComboBox6.setBounds(195, 471, 281, 20);

        jLabel14.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel14.setText("COURT ALLOTED:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(56, 499, 135, 17);

        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox7);
        jComboBox7.setBounds(195, 499, 281, 20);

        jLabel15.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel15.setText("DOB:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(56, 219, 115, 17);

        jButton1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jButton1.setText("SUBMIT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(60, 530, 79, 25);

        jLabel16.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel16.setText("GENDER:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(56, 247, 115, 17);

        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField6);
        jTextField6.setBounds(195, 219, 281, 20);

        jRadioButton1.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jRadioButton1.setText("MALE");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(197, 247, 59, 25);

        jRadioButton2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jRadioButton2.setText("FEMALE");
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(288, 247, 71, 25);

        jButton2.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jButton2.setText("UPDATE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(187, 530, 79, 25);

        jButton3.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jButton3.setText("DELETE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(325, 530, 75, 25);

        jButton4.setText("Home");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(0, 0, 59, 30);

        jComboBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox8ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox8);
        jComboBox8.setBounds(195, 415, 281, 20);

        jLabel17.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel17.setText("PACKAGES:");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(56, 415, 121, 17);

        jLabel18.setFont(new java.awt.Font("Microsoft YaHei", 0, 12)); // NOI18N
        jLabel18.setText("FEE:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(56, 443, 121, 17);

        jComboBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox9ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox9);
        jComboBox9.setBounds(195, 443, 281, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
       // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        jComboBox2.removeAllItems();
        
        String gType=(String)jComboBox1.getSelectedItem();
       
        try
        {
        //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        //Connection conn=DriverManager.getConnection("jdbc:sqlserver://localhost:49171;databaseName=sports;integratedSecurity=true");
        
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","oracle");
       Statement stmt=conn.createStatement();
       
       
          
       if(gType.equals("Indoor"))
       {
       ResultSet rs=stmt.executeQuery("select gname from indoor_master");
        
        
       while(rs.next())
        {
        jComboBox2.addItem(rs.getString("gname"));
        
        }
       
       }
       else{
        ResultSet rso=stmt.executeQuery("select gname from outdoor_master");
        
        while(rso.next())
        {
        jComboBox2.addItem(rso.getString("gname"));
        }
        }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, ""+e);
        }

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
       
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed


    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 appprop p=new appprop();
String gender=" ";
       String aname=jTextField2.getText().toString();
        int aid=Integer.parseInt(jTextField1.getText());
        String fname=jtextField33.getText().toString();
 String email=jTextField5.getText().toString();
  String dob=jTextField6.getText().toString();
  long contact=Long.valueOf(jTextField4.getText());
  String address=jTextArea1.getText().toString();
  String pack=jComboBox8.getSelectedItem().toString();
  long fee= Long.valueOf(jComboBox9.getSelectedItem().toString());
  if(jRadioButton1.isSelected()==true)
  {
      gender=jRadioButton1.getText();
 }  
  else
  {
      gender=jRadioButton2.getText();
  }
  String gametype=jComboBox1.getSelectedItem().toString();
   String game=jComboBox2.getSelectedItem().toString();
    String batch=jComboBox3.getSelectedItem().toString();
     
       String court=jComboBox7.getSelectedItem().toString();
        String coach=jComboBox6.getSelectedItem().toString();
  p.setGender(gender);
        p.setName(aname);
        p.setId(aid);
          p.setFname(fname);
          p.setEmail(email);
          p.setDob(dob);
          p.setContact(contact);
          p.setAddress(address);
         
          p.setGametype(gametype);
          p.setGame(game);
          p.setBatch(batch);
          p.setCoach(coach);
          p.setCourt(court);
          p.setPackage(pack);
          p.setFee(fee);
          

        demo.application d=new application();
        d.insertData(p);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       appprop p=new appprop();
String gender=" ";
       String aname=jTextField2.getText().toString();
        int aid=Integer.parseInt(jTextField1.getText());
        String fname=jtextField33.getText().toString();
 String email=jTextField5.getText().toString();
  String dob=jTextField6.getText().toString();
  long contact=Long.valueOf(jTextField4.getText());
  String address=jTextArea1.getText().toString();
  if(jRadioButton1.isSelected()==true)
  {
      gender=jRadioButton1.getText();
 }  
  else
  {
      gender=jRadioButton2.getText();
  }
  String gametype=jComboBox1.getSelectedItem().toString();
   String game=jComboBox2.getSelectedItem().toString();
    String batch=jComboBox3.getSelectedItem().toString();
     
       String court=jComboBox7.getSelectedItem().toString();
        String coach=jComboBox6.getSelectedItem().toString();
        String pack=jComboBox8.getSelectedItem().toString();
        long fee=Long.valueOf(jComboBox9.getSelectedItem().toString());
  p.setGender(gender);
        p.setName(aname);
        p.setId(aid);
          p.setFname(fname);
          p.setEmail(email);
          p.setDob(dob);
          p.setContact(contact);
          p.setAddress(address);
         
          p.setGametype(gametype);
          p.setGame(game);
          p.setBatch(batch);
          p.setCoach(coach);
          p.setCourt(court);
          p.setPackage(pack);
          p.setFee(fee);
          

        demo.application d=new application();
        d.updateData(p);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        appprop p=new appprop();
        int aid=Integer.parseInt(jTextField1.getText());
        p.setId(aid);
          demo.application d=new application();
        d.deleteData(p);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      welcome a=new welcome();
      a.show();
      this.hide();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox8ActionPerformed
{
        try{    
            jComboBox9.removeAllItems();
            String g=(String)jComboBox8.getSelectedItem();
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","oracle");
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery("select amount from pack_master where pack='" + g + "'");
            
            while(rs.next())
            {
                jComboBox9.addItem(rs.getString("amount"));
            }
        } catch (Exception e)
        {
        JOptionPane.showMessageDialog(rootPane, ""+e);
    }        
}   

    }//GEN-LAST:event_jComboBox8ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
       
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jComboBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox9ActionPerformed
        //
    }//GEN-LAST:event_jComboBox9ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jtextField33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtextField33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtextField33ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Applicationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Applicationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Applicationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Applicationform.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Applicationform().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    javax.swing.JComboBox jComboBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jtextField33;
    // End of variables declaration//GEN-END:variables

   
}
