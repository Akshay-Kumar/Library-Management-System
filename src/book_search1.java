import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.util.*;
public class book_search1 extends javax.swing.JFrame {

    /** Creates new form book_search1 */
    public book_search1() {
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

        b2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        t3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        t6 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SEARCH A BOOK");
        setMinimumSize(new java.awt.Dimension(700, 471));
        setResizable(false);
        getContentPane().setLayout(null);

        b2.setFont(new java.awt.Font("Tahoma", 1, 12));
        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Actions-draw-eraser-icon (1).png"))); // NOI18N
        b2.setText("Reset");
        b2.setToolTipText("click to reset");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(320, 390, 110, 30);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Actions-go-first-view-icon (3).png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(450, 390, 110, 30);

        b1.setFont(new java.awt.Font("Tahoma", 1, 12));
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search-icon (2).png"))); // NOI18N
        b1.setText("Search");
        b1.setToolTipText("click to search");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(170, 390, 120, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("AUTHOR");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(200, 180, 60, 20);

        t2.setEditable(false);
        getContentPane().add(t2);
        t2.setBounds(280, 130, 270, 30);

        t3.setEditable(false);
        getContentPane().add(t3);
        t3.setBounds(280, 170, 270, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("BOOK ID");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 90, 60, 15);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("BOOK NAME");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 140, 80, 15);
        getContentPane().add(t1);
        t1.setBounds(280, 80, 270, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PUBLICATION");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(170, 220, 90, 15);

        t4.setEditable(false);
        getContentPane().add(t4);
        t4.setBounds(280, 210, 270, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("AVAILABILITY");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(170, 320, 90, 15);

        t5.setEditable(false);
        getContentPane().add(t5);
        t5.setBounds(280, 310, 70, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TOPIC");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(220, 270, 40, 15);

        t6.setEditable(false);
        getContentPane().add(t6);
        t6.setBounds(280, 260, 270, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/book.jpg"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, -10, 700, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
      t1.setText("");
      t4.setText("");
      t2.setText("");
      t3.setText("");
      t5.setText("");
      t6.setText("");
}//GEN-LAST:event_b2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        dispose();
        new main1().setVisible(true);// TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        try{
    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
    Connection con = DriverManager.getConnection("jdbc:odbc:library","admin","akshay");
    PreparedStatement pst=con.prepareStatement("select * from book where BOOK_ID=?");
    pst.setString(1,t1.getText());
    
       
    ResultSet rs = pst.executeQuery();
    if ( rs.next() ){
        t2.setText(rs.getString(2));
        t3.setText(rs.getString(3));
        t4.setText(rs.getString(4));
        t5.setText(rs.getString(6));
        t6.setText(rs.getString(5));
        String a = t5.getText();
        if(a.equalsIgnoreCase("NO"))
        {
       JOptionPane.showMessageDialog(this,"Book is Unavailable","STATUS",JOptionPane.PLAIN_MESSAGE);
        } 
        else
        {
       JOptionPane.showMessageDialog(this,"Book is Available","STATUS",JOptionPane.PLAIN_MESSAGE);
        }    
            
    }
    else
    {
        t2.setText(""); t3.setText("");t4.setText("");t5.setText("");t6.setText("");
     JOptionPane.showMessageDialog(this,"Sorry! No record is found");   
    }
    
    con.close();
    

    
   }
catch(Exception e){ System.out.println(e); }
    }                                        

    
      
    
    {
    }//GEN-LAST:event_b1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new book_search1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JTextField t5;
    private javax.swing.JTextField t6;
    // End of variables declaration//GEN-END:variables
}
