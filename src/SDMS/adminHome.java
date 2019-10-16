/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SDMS;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Suhaib K
 */
public class adminHome extends javax.swing.JFrame {

    public static final String JDBC_DRIVER = "org.h2.Driver";
    public static final String DB_URL = "jdbc:h2:~/SDMS";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "";

    public adminHome() {
        initComponents();
        tableDataUpdate();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        exitB = new javax.swing.JButton();
        loginPageB = new javax.swing.JButton();
        changePasswordB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataT = new javax.swing.JTable();
        newStudentB = new javax.swing.JButton();
        editStudentB = new javax.swing.JButton();
        studentProjectB = new javax.swing.JButton();
        refreshB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("College of Engineering Perumon");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Admin Panel");

        exitB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        exitB.setText("Exit");
        exitB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitBMouseClicked(evt);
            }
        });
        exitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBActionPerformed(evt);
            }
        });
        exitB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                exitBKeyPressed(evt);
            }
        });

        loginPageB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        loginPageB.setText("Login Page");
        loginPageB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginPageB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginPageBMouseClicked(evt);
            }
        });
        loginPageB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginPageBActionPerformed(evt);
            }
        });
        loginPageB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginPageBKeyPressed(evt);
            }
        });

        changePasswordB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        changePasswordB.setText("Change Password");
        changePasswordB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        changePasswordB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                changePasswordBMouseClicked(evt);
            }
        });
        changePasswordB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePasswordBActionPerformed(evt);
            }
        });
        changePasswordB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                changePasswordBKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(loginPageB, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(changePasswordB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(exitB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(loginPageB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(exitB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(changePasswordB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        dataT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AdNo", "RNo", "Name", "Gender", "Dept", "Sem", "DOB", "Email", "Phone"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(dataT);
        if (dataT.getColumnModel().getColumnCount() > 0) {
            dataT.getColumnModel().getColumn(0).setPreferredWidth(20);
            dataT.getColumnModel().getColumn(1).setPreferredWidth(5);
            dataT.getColumnModel().getColumn(2).setPreferredWidth(40);
            dataT.getColumnModel().getColumn(3).setPreferredWidth(20);
            dataT.getColumnModel().getColumn(4).setPreferredWidth(25);
            dataT.getColumnModel().getColumn(5).setPreferredWidth(5);
            dataT.getColumnModel().getColumn(6).setPreferredWidth(35);
            dataT.getColumnModel().getColumn(7).setPreferredWidth(100);
        }

        newStudentB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        newStudentB.setText("New Student");
        newStudentB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newStudentB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStudentBActionPerformed(evt);
            }
        });

        editStudentB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        editStudentB.setText("Edit Student");
        editStudentB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editStudentB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editStudentBActionPerformed(evt);
            }
        });

        studentProjectB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        studentProjectB.setText("Student Project");
        studentProjectB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        studentProjectB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentProjectBMouseClicked(evt);
            }
        });
        studentProjectB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentProjectBActionPerformed(evt);
            }
        });

        refreshB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        refreshB.setText("Refresh");
        refreshB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newStudentB, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(editStudentB, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(studentProjectB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshB)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newStudentB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editStudentB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentProjectB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBMouseClicked
        exitprogram();
    }//GEN-LAST:event_exitBMouseClicked

    private void exitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBActionPerformed
        exitprogram();
    }//GEN-LAST:event_exitBActionPerformed

    private void exitBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_exitBKeyPressed
        exitprogram();
    }//GEN-LAST:event_exitBKeyPressed

    private void newStudentBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStudentBActionPerformed
        addStudent add = new addStudent();
        add.setVisible(true);
        tableDataUpdate();
    }//GEN-LAST:event_newStudentBActionPerformed

    private void editStudentBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStudentBActionPerformed
        editStudent newpage = new editStudent();
        newpage.setVisible(true);
        tableDataUpdate();
    }//GEN-LAST:event_editStudentBActionPerformed

    private void loginPageBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginPageBMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginPageBMouseClicked

    private void loginPageBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginPageBActionPerformed
        Login newpage = new Login();
        newpage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginPageBActionPerformed

    private void loginPageBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginPageBKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginPageBKeyPressed

    private void changePasswordBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_changePasswordBMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_changePasswordBMouseClicked

    private void changePasswordBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePasswordBActionPerformed
        changePassword newpage = new changePassword("admin");
        newpage.setVisible(true);
    }//GEN-LAST:event_changePasswordBActionPerformed

    private void changePasswordBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_changePasswordBKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_changePasswordBKeyPressed

    private void studentProjectBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentProjectBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_studentProjectBActionPerformed

    private void studentProjectBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentProjectBMouseClicked
        projectDetails pd = new projectDetails();
        pd.setVisible(true);
    }//GEN-LAST:event_studentProjectBMouseClicked

    private void refreshBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBActionPerformed
        tableDataUpdate();
    }//GEN-LAST:event_refreshBActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminHome().setVisible(true);
            }
        });
    }

    public void tableDataUpdate() {
        DefaultTableModel model = (DefaultTableModel) dataT.getModel();
        model.setRowCount(0);
        try {
            Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            String sql = "select * from student order by adno";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                    rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)});
            }
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }

    private void exitprogram() {
        int YesNo;
        YesNo = JOptionPane.showConfirmDialog(this, "Are you sure?", "Exit Program", JOptionPane.YES_NO_OPTION);
        if (YesNo == 0) {
            System.exit(0);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton changePasswordB;
    private javax.swing.JTable dataT;
    private javax.swing.JButton editStudentB;
    private javax.swing.JButton exitB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loginPageB;
    private javax.swing.JButton newStudentB;
    private javax.swing.JButton refreshB;
    private javax.swing.JButton studentProjectB;
    // End of variables declaration//GEN-END:variables
}
