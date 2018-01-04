
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.*;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * lib.java
 *
 * Created on Feb 9, 2012, 10:33:31 PM
 */
/**
 *
 * @author AKKI
 */
public class lib extends javax.swing.JFrame {

    /** Creates new form lib */
    public lib() {
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
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LIBRARY MANAGEMENT SYSTEM");
        setMinimumSize(new java.awt.Dimension(735, 466));
        setResizable(false);
        getContentPane().setLayout(null);

        b1.setFont(new java.awt.Font("Tahoma", 1, 14));
        b1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/administrator-icon.png"))); // NOI18N
        b1.setText("   ADMIN");
        b1.setToolTipText("login as an admin");
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(530, 30, 170, 60);

        b2.setFont(new java.awt.Font("Tahoma", 1, 14));
        b2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Places-user-identity-icon (2).png"))); // NOI18N
        b2.setText("MEMBER");
        b2.setToolTipText("login as a member");
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(530, 140, 170, 60);

        b3.setFont(new java.awt.Font("Tahoma", 1, 14));
        b3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Actions-edit-delete-icon.png"))); // NOI18N
        b3.setText("      EXIT");
        b3.setToolTipText("click to exit");
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(530, 250, 170, 60);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/get_info.png"))); // NOI18N
        jButton1.setText("About");
        jButton1.setToolTipText("About Us");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(590, 350, 110, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/library-wallpaper-1680x1050.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 735, 450);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        dispose();
        new admin().setVisible(true);
}//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        dispose();
        new member().setVisible(true);
}//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        try {
			//Show a Confirmation Dialog.
		    	int reply = JOptionPane.showConfirmDialog (this, 
				"Do you really want to exit From\n Library Management System?",
				"Library Management System - Exit", JOptionPane.YES_NO_OPTION);
			//Check the User Selection.
			if (reply == JOptionPane.YES_OPTION) {				//If User's Choice Yes then.
				setVisible (false);					//Hide the Frame.
				dispose();            					//Free the System Resources.
				System.exit (0);        				//Close the Application.
			}
			else if (reply == JOptionPane.NO_OPTION) {			//If User's Choice No then.
				setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);	//Do Nothing Return to Program.
			}
		} 

		catch (Exception e) {}
}//GEN-LAST:event_b3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       Object obj = evt.getSource();
        
                {

			
			String msg = "LIBRARY MANAGEMENT SYSTEM.\n\n" + "Created & Designed By:\n" + 
				"Akshay Kumar Singh\nAmit Kumar\nDeepak Agarwal\nDebashmita Ghosh\nDebolina Majumdar\n\n" + "College:\nB.P.Poddar Institute of Management & Technology";
			JOptionPane.showMessageDialog (this, msg,"About Library Management System",JOptionPane.INFORMATION_MESSAGE);

		}

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new lib().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
