/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SDMS;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author Suhaib K
 */
public final class studentData extends javax.swing.JFrame {

    public static final String JDBC_DRIVER = "org.h2.Driver";
    public static final String DB_URL = "jdbc:h2:~/SDMS";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "";

    public studentData() {
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
        backB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataT = new javax.swing.JTable();
        newStudentB = new javax.swing.JButton();
        editStudentB = new javax.swing.JButton();
        studentProjectB = new javax.swing.JButton();
        refreshB = new javax.swing.JButton();
        adnoTF = new javax.swing.JTextField();
        markListB = new javax.swing.JButton();
        filterBy1B = new javax.swing.JComboBox<>();
        filterBy2B = new javax.swing.JComboBox<>();
        filterB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("editStudentF");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Student's Data");

        backB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        backB.setText("Back");
        backB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        backB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backBMouseClicked(evt);
            }
        });
        backB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBActionPerformed(evt);
            }
        });
        backB.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                backBKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backB, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(backB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 78, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dataT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "AdNo", "Name", "Gender", "Dept", "Sem", "DOB"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
            dataT.getColumnModel().getColumn(1).setPreferredWidth(40);
            dataT.getColumnModel().getColumn(2).setPreferredWidth(20);
            dataT.getColumnModel().getColumn(3).setPreferredWidth(25);
            dataT.getColumnModel().getColumn(4).setPreferredWidth(5);
            dataT.getColumnModel().getColumn(5).setPreferredWidth(35);
        }

        newStudentB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        newStudentB.setText("Add Student");
        newStudentB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        newStudentB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newStudentBActionPerformed(evt);
            }
        });

        editStudentB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        editStudentB.setText("Edit ");
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

        adnoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adnoTFActionPerformed(evt);
            }
        });
        adnoTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                adnoTFKeyReleased(evt);
            }
        });

        markListB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        markListB.setText("Mark List");
        markListB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        markListB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markListBActionPerformed(evt);
            }
        });

        filterB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        filterB.setText("Filter");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(adnoTF, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(newStudentB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(filterBy1B, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(filterBy2B, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(filterB)
                                .addGap(164, 164, 164)
                                .addComponent(studentProjectB)
                                .addContainerGap(136, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(editStudentB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(markListB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(refreshB))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(newStudentB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(filterBy1B)
                            .addComponent(filterBy2B)
                            .addComponent(filterB))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editStudentB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(markListB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refreshB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(studentProjectB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newStudentBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newStudentBActionPerformed
        addStudent add = new addStudent();
        add.setVisible(true);
        tableDataUpdate();
    }//GEN-LAST:event_newStudentBActionPerformed

    private void editStudentBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editStudentBActionPerformed
        editStudent newpage = new editStudent(adnoTF.getText());
        newpage.setVisible(true);
        tableDataUpdate();
    }//GEN-LAST:event_editStudentBActionPerformed

    private void backBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backBMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_backBMouseClicked

    private void backBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBActionPerformed
        adminHome newpage = new adminHome();
        newpage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBActionPerformed

    private void backBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_backBKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_backBKeyPressed

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

    private void adnoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adnoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adnoTFActionPerformed

    private void markListBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markListBActionPerformed
        markList();
    }//GEN-LAST:event_markListBActionPerformed

    private void adnoTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adnoTFKeyReleased

    }//GEN-LAST:event_adnoTFKeyReleased

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new studentData().setVisible(true);
        });
    }

    public void markList() {
        if (adnoTF.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "Feature not updated");
        } else {
            studentMarks newpage = new studentMarks(adnoTF.getText());
            newpage.setVisible(true);
        }
    }

    public void tableDataUpdate() {
        adnoTF.setText(null);
        DefaultTableModel model = (DefaultTableModel) dataT.getModel();
        model.setRowCount(0);
        try {
            Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            String sql = "select * from student order by adno";
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(3), rs.getString(4),
                    rs.getString(5), rs.getString(6), rs.getString(7)});
            }
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adnoTF;
    private javax.swing.JButton backB;
    private javax.swing.JTable dataT;
    private javax.swing.JButton editStudentB;
    private javax.swing.JButton filterB;
    private javax.swing.JComboBox<String> filterBy1B;
    private javax.swing.JComboBox<String> filterBy2B;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton markListB;
    private javax.swing.JButton newStudentB;
    private javax.swing.JButton refreshB;
    private javax.swing.JButton studentProjectB;
    // End of variables declaration//GEN-END:variables
}
