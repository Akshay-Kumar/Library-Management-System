
import java.sql.*;
public class book_viewall1 extends javax.swing.JFrame {

  
    public book_viewall1() {
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

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("VIEW ALL BOOKS");
        setMinimumSize(new java.awt.Dimension(837, 440));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search (2).png"))); // NOI18N
        jButton1.setMnemonic('S');
        jButton1.setText("Search");
        jButton1.setToolTipText("click to search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(720, 140, 100, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 40, 650, 330);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Actions-go-first-view-icon (3).png"))); // NOI18N
        jButton3.setText("Back");
        jButton3.setToolTipText("click go back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(720, 230, 100, 30);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/loading/loading6.gif"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(570, 380, 110, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view3.JPG"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-6, 0, 840, 420);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:library","admin","akshay");
            Statement pst = con.createStatement();
            ResultSet rs = pst.executeQuery("select * from book");
            String aa ="BOOK_ID           NAME                  AUTHOR            PUBLICATION           TOPIC             AVAIL_STATUS";
            while ( rs.next() ){
 aa=aa+"\n"+rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t        "+rs.getString(5)+"\t        "+rs.getString(6);
            }
            con.close();
            jTextArea1.setText(aa);
            
            
        } catch(Exception e){ System.out.println(e); }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        new main1().setVisible(true);
}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new book_viewall1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
