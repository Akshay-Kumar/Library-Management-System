
import javax.swing.JOptionPane;
import java.util.*;
import java.sql.*;
import javax.swing.JFrame;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * admin.java
 *
 * Created on Jan 24, 2012, 10:53:18 PM
 */
/**
 *
 * @author AKSHAY
 */
public class admin extends javax.swing.JFrame {

  
    public admin() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        b1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        Jlabel1 = new javax.swing.JLabel();
        Jlabel2 = new javax.swing.JLabel();
        t = new javax.swing.JTextField();
        p = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADMIN LOGIN");
        setMinimumSize(new java.awt.Dimension(641, 431));
        setResizable(false);
        getContentPane().setLayout(null);

        b1.setFont(new java.awt.Font("Tahoma", 1, 14));
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Cute-Ball-Go-icon (1).png"))); // NOI18N
        b1.setText("LOGIN");
        b1.setToolTipText("click to login");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(190, 270, 120, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Actions-draw-eraser-icon (1).png"))); // NOI18N
        jButton2.setText("RESET");
        jButton2.setToolTipText("click to reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(350, 269, 120, 40);

        Jlabel1.setFont(new java.awt.Font("Tahoma", 1, 14));
        Jlabel1.setForeground(new java.awt.Color(255, 255, 255));
        Jlabel1.setText("USER ID");
        getContentPane().add(Jlabel1);
        Jlabel1.setBounds(140, 97, 60, 40);

        Jlabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        Jlabel2.setForeground(new java.awt.Color(255, 255, 255));
        Jlabel2.setText("PASSWORD");
        getContentPane().add(Jlabel2);
        Jlabel2.setBounds(120, 167, 82, 40);
        getContentPane().add(t);
        t.setBounds(230, 100, 220, 30);
        getContentPane().add(p);
        p.setBounds(230, 170, 220, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/6682451781_a4eb7fe7b0_z.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 640, 427);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        t.setText("");
        p.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        try{
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
    Connection con = DriverManager.getConnection("jdbc:odbc:library","admin","akshay");
    PreparedStatement pst = con.prepareStatement("select * from user where USER_ID=?");
    pst.setString(1,t.getText());
    ResultSet rs=pst.executeQuery();
    if (rs.next()){
        
    String a=rs.getString("USER_ID");
    String b=rs.getString("PASSWORD");
    String a1=t.getText().toString();
    String b1=p.getText().toString();
    
    
    
     if(a1.equals(a) && b1.equals(b))
     {con.close();
      dispose();
      new main().setVisible(true);
     }
     else
     {  t.setText("");
        p.setText("");
        JOptionPane.showMessageDialog(this,"Sorry! Wrong Password \n Try Again","Error",JOptionPane.ERROR_MESSAGE);}
    }
    else{ t.setText("");
          p.setText("");
          JOptionPane.showMessageDialog(this,"Invalid User Id","Error",JOptionPane.ERROR_MESSAGE);}
    
    }
   catch(Exception e){ System.out.println(e); }
 
    }//GEN-LAST:event_b1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new admin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jlabel1;
    private javax.swing.JLabel Jlabel2;
    private javax.swing.JButton b1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField p;
    private javax.swing.JTextField t;
    // End of variables declaration//GEN-END:variables
}
