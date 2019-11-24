package SDMS;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class projectDetails extends javax.swing.JFrame {

    public static final String JDBC_DRIVER = "org.h2.Driver";
    public static final String DB_URL = "jdbc:h2:~/SDMS";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "";
    private Connection con = null;
    private PreparedStatement pst = null;
    private String sql = null;

    public projectDetails() {
        initComponents();
        updateTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        approveB = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        rejectB = new javax.swing.JButton();
        cancelB = new javax.swing.JButton();
        adnoTF = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        projectListT = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Project Details");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        approveB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        approveB.setText("Approve");
        approveB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        approveB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                approveBMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Admission No:");

        rejectB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        rejectB.setText("Reject");
        rejectB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rejectB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rejectBMouseClicked(evt);
            }
        });
        rejectB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectBActionPerformed(evt);
            }
        });

        cancelB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancelB.setText("Cancel");
        cancelB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelBMouseClicked(evt);
            }
        });
        cancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBActionPerformed(evt);
            }
        });

        adnoTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                adnoTFKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(adnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(approveB)
                .addGap(2, 2, 2)
                .addComponent(rejectB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelB)
                .addGap(97, 97, 97))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(approveB)
                    .addComponent(jLabel2)
                    .addComponent(rejectB)
                    .addComponent(cancelB)
                    .addComponent(adnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        projectListT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Adno", "Student Name", "Project Name", "Approved", "Year"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        projectListT.getTableHeader().setReorderingAllowed(false);
        projectListT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                projectListTMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                projectListTMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(projectListT);
        if (projectListT.getColumnModel().getColumnCount() > 0) {
            projectListT.getColumnModel().getColumn(0).setResizable(false);
            projectListT.getColumnModel().getColumn(0).setPreferredWidth(5);
            projectListT.getColumnModel().getColumn(1).setResizable(false);
            projectListT.getColumnModel().getColumn(2).setResizable(false);
            projectListT.getColumnModel().getColumn(3).setResizable(false);
            projectListT.getColumnModel().getColumn(4).setResizable(false);
            projectListT.getColumnModel().getColumn(4).setPreferredWidth(5);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void approveBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_approveBMouseClicked
        approve();
    }//GEN-LAST:event_approveBMouseClicked

    private void cancelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelBActionPerformed

    private void rejectBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rejectBActionPerformed

    private void cancelBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelBMouseClicked
        this.dispose();
    }//GEN-LAST:event_cancelBMouseClicked

    private void rejectBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rejectBMouseClicked
        reject();
    }//GEN-LAST:event_rejectBMouseClicked

    private void projectListTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectListTMouseClicked

    }//GEN-LAST:event_projectListTMouseClicked

    private void projectListTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectListTMousePressed
        adnoTextFieldUpdate();
    }//GEN-LAST:event_projectListTMousePressed

    private void adnoTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adnoTFKeyReleased
        tableSearchData();
    }//GEN-LAST:event_adnoTFKeyReleased

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("WIndows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(projectDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new projectDetails().setVisible(true);
        });
    }

    private void updateTable() {
        DefaultTableModel projectList = (DefaultTableModel) projectListT.getModel();
        projectList.setRowCount(0);
        try {
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            sql = "select * from project";
            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                projectList.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        } finally {
            try {
                if (con != null) {
                    con.close();
                }

            } catch (SQLException e) {
            }
        }
    }

    private void adnoTextFieldUpdate() {
        DefaultTableModel model = (DefaultTableModel) projectListT.getModel();
        int tableSelectedRow = projectListT.getSelectedRow();
        adnoTF.setText(model.getValueAt(tableSelectedRow, 0).toString());
    }

    private void tableSearchData() {
        DefaultTableModel model = (DefaultTableModel) projectListT.getModel();
        String search = adnoTF.getText();
        TableRowSorter<DefaultTableModel> tableSearch = new TableRowSorter<>(model);
        projectListT.setRowSorter(tableSearch);
        tableSearch.setRowFilter(RowFilter.regexFilter(search));
    }

    private void approve() {
        if (adnoTF.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Choose Admission Number", "Error", JOptionPane.OK_OPTION);
        } else {

            try {
                con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
                sql = "update project set approved = 'Yes' where adno=?";
                pst = con.prepareStatement(sql);
                pst.setString(1, adnoTF.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Update Success");
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(this, e);
            } finally {
                try {
                    if (con != null) {
                        con.close();
                    }

                } catch (SQLException e) {
                }
            }
        }
        updateTable();
    }

    private void reject() {
        if (adnoTF.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Choose Admission Number", "Error", JOptionPane.OK_OPTION);
        } else {

            try {
                con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
                sql = "update project set approved = 'RJT' where adno=?";
                pst = con.prepareStatement(sql);
                pst.setString(1, adnoTF.getText());
                pst.executeUpdate();
                JOptionPane.showMessageDialog(this, "Update Success");
            } catch (HeadlessException | SQLException e) {
                JOptionPane.showMessageDialog(this, e);
            } finally {
                try {
                    if (con != null) {
                        con.close();
                    }

                } catch (SQLException e) {
                }
            }
        }
        updateTable();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adnoTF;
    private javax.swing.JButton approveB;
    private javax.swing.JButton cancelB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable projectListT;
    private javax.swing.JButton rejectB;
    // End of variables declaration//GEN-END:variables

}
