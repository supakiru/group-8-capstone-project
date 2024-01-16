
package LibraryVisitorsTrackingSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Timestamp;

public class Archived_Gui extends javax.swing.JFrame {
public static int rowCount;

    public Archived_Gui() {
        initComponents();
        fetched();
        
       
          String stringRowCount = Integer.toString(rowCount);
              visitors.setText(stringRowCount);
      

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        showDataBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        visitors = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ARCHIVE DASHBOARD");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        showDataBtn.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        showDataBtn.setText("Clear Archive");
        showDataBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showDataBtnActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Archive:");

        visitors.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        visitors.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(showDataBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(visitors, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(showDataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(visitors))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 190, 350));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTable1.setAutoCreateRowSorter(false);
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_NUMBER", "FIRSTNAME", "LASTNAME", "COURSE/DEPT."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setToolTipText("");
        jTable1.setCellSelectionEnabled(true);
        jTable1.setDropMode(javax.swing.DropMode.ON);
        jTable1.setEnabled(false);
        jTable1.setInheritsPopupMenu(true);
        jTable1.setName("LOG IN HISTORY"); // NOI18N
        jTable1.setUpdateSelectionOnSort(false);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 820, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1065, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 477, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    Connection con;
    PreparedStatement ps;
    
  
    
    private void fetched(){
     
          try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String jdbcURL = "jdbc:mysql://127.0.0.1:3306/tcclibrarydb?autoReconnect=true&useSSL=false";
            String username = "root";
            String password = "";
            
             con = DriverManager.getConnection(jdbcURL, username, password);
            
            ps = con.prepareStatement("SELECT * FROM registered;");
            ResultSet rs = ps.executeQuery();
            
           
              DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

               
              
              
while (rs.next()) {
    String studentID = rs.getString("student_id");
    String firstname = rs.getString("firstname");
    String lastname = rs.getString("lastname");
    String course = rs.getString("course");

    



    // Add a new row to the table model with the data
    model.addRow(new Object[]{studentID, firstname, lastname,course});
    rowCount = jTable1.getRowCount();
}

// Update the JTable
jTable1.setModel(model);


        
        
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Archived_Gui.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          catch (SQLException ex) {
            Logger.getLogger(Archived_Gui.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
          
    
    private void showDataBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showDataBtnActionPerformed
 
        
     int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete data?"); 
        if(choice == JOptionPane.YES_OPTION){
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
             model.setRowCount(0); // Clear the table
             jTable1.setModel(model);             
             
             rowCount = 0;
            
// clear history
     
          try {
              
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            String jdbcURL = "jdbc:mysql://127.0.0.1:3306/tcclibrarydb?autoReconnect=true&useSSL=false";
            String username = "root";
            String password = "";
            
             con = DriverManager.getConnection(jdbcURL, username, password);
                    
             String tableName = "registered";

            // Create a SQL query to drop the table
            String sql = "DELETE FROM " + tableName;

            // Create a PreparedStatement
            PreparedStatement preparedStatement = con.prepareStatement(sql);               
            // Execute the SQL query to drop the table
            preparedStatement.executeUpdate();

            // Close the PreparedStatement and the connection
            preparedStatement.close();
            con.close();
                              
// Update the JTable
             
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dashboard_Gui.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          catch (SQLException ex) {
            Logger.getLogger(dashboard_Gui.class.getName()).log(Level.SEVERE, null, ex);
        }  
        }
        else{
            
        }
    }//GEN-LAST:event_showDataBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dashboard_Gui jobert = new dashboard_Gui();
        jobert.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Archived_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Archived_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Archived_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Archived_Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Archived_Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton showDataBtn;
    private javax.swing.JLabel visitors;
    // End of variables declaration//GEN-END:variables
}
