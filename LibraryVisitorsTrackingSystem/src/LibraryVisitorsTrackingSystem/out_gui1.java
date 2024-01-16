/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LibraryVisitorsTrackingSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jober
 */
public class out_gui1 extends javax.swing.JFrame {

    /**
     * Creates new form out_gui
     */
    public out_gui1() {
        initComponents();
              
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        id_out = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        logout_btn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        id_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_outActionPerformed(evt);
            }
        });
        jPanel1.add(id_out, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 140, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Enter your ID Number to Time-Out");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, 29));

        logout.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        logout.setText("Time-Out");
        logout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jPanel1.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, 57, -1));

        logout_btn.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        logout_btn.setText("Back");
        logout_btn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logout_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_btnActionPerformed(evt);
            }
        });
        jPanel1.add(logout_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 60, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Talisay City College Library Department");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 420, 40));

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(204, 255, 255));
        jLabel11.setText("WELCOME!!");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 100, 20));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibraryVisitorsTrackingSystem/logo.jpg"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 580, 100, -1));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LibraryVisitorsTrackingSystem/Ha.jpg"))); // NOI18N
        jLabel3.setAutoscrolls(true);
        jLabel3.setMaximumSize(new java.awt.Dimension(800, 1024));
        jLabel3.setMinimumSize(new java.awt.Dimension(800, 1024));
        jLabel3.setPreferredSize(new java.awt.Dimension(800, 1024));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -6, 770, 730));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 766, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void logoutNow(){
        String field_id = id_out.getText();
        if(field_id.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter your ID number on the field!");
        }
        else{
 
             verifyID();
            
        }
    }
    
    private void id_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_outActionPerformed
       
    }//GEN-LAST:event_id_outActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
         logoutNow();
   
       
    }//GEN-LAST:event_logoutActionPerformed

    private void logout_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_btnActionPerformed
    Menu_Gui menu = new Menu_Gui();
                            menu.setVisible(true);
                            this.dispose();
    }//GEN-LAST:event_logout_btnActionPerformed
     Connection con;
    PreparedStatement ps; 
    private void logout_fetch(){
     
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a");
        String formattedDateTime = now.format(formatter);
      
    //fetching date and time to sql
        
        String idOut = id_out.getText();
               
          try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String jdbcURL = "jdbc:mysql://127.0.0.1:3306/tcclibrarydb?autoReconnect=true&useSSL=false";
            String username = "root";
            String password = "";
            
             con = DriverManager.getConnection(jdbcURL, username, password);
            
            Connection con = DriverManager.getConnection(jdbcURL, username, password);

            // Get the current date and time formatted as "yyyy-MM-dd HH:mm:ss"
          

            // Create a PreparedStatement with your INSERT SQL
           String insertSql = "UPDATE register SET timeout = ? WHERE student_id = ?";
            PreparedStatement ps = con.prepareStatement(insertSql);


            // Set values for the placeholders
     
            ps.setString(1, formattedDateTime);
            ps.setString(2, idOut);
            
            // Execute the INSERT query
            int rowsAffected = ps.executeUpdate();

            ps.close();
            con.close();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(dashboard_Gui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void verifyID() {
    String idOut = id_out.getText();
    
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        String jdbcURL = "jdbc:mysql://127.0.0.1:3306/tcclibrarydb?autoReconnect=true&useSSL=false";
        String username = "root";
        String password = "";

        try (Connection con = DriverManager.getConnection(jdbcURL, username, password)) {
            String selectSql = "SELECT * FROM register WHERE student_id = ?";
            
            try (PreparedStatement ps = con.prepareStatement(selectSql)) {
                ps.setString(1, idOut);
                
                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {        
                        logout_fetch();
                         outnotif_gui notif = new outnotif_gui();
                            notif.setVisible(true);
                            this.dispose();
                        
                          
                    } else {
 
                  JOptionPane.showMessageDialog(this, "Sorry! No records found with your ID");
                    }
                }
            }
        }
    } catch (ClassNotFoundException | SQLException ex) {
        Logger.getLogger(dashboard_Gui.class.getName()).log(Level.SEVERE, null, ex);
    }
}

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
            java.util.logging.Logger.getLogger(out_gui1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(out_gui1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(out_gui1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(out_gui1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new out_gui1().setVisible(true);
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id_out;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logout;
    private javax.swing.JButton logout_btn;
    // End of variables declaration//GEN-END:variables
}
