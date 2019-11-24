package SDMS;

import java.sql.*;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public final class markList extends javax.swing.JFrame {

    public static final String JDBC_DRIVER = "org.h2.Driver";
    public static final String DB_URL = "jdbc:h2:~/SDMS";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "";
    public static Connection con = null;
    public static String sql = null;
    public static PreparedStatement pst = null;

    public markList() {
        initComponents();
        markTableUpdate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        markT = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        adnoTF = new javax.swing.JTextField();
        editB = new javax.swing.JButton();
        refreshB = new javax.swing.JButton();
        closeB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        markT.setModel(markT.getModel());
        markT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                markTMousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(markT);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Student Mark List");

        adnoTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                adnoTFKeyReleased(evt);
            }
        });

        editB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        editB.setText("Edit");
        editB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBActionPerformed(evt);
            }
        });

        refreshB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        refreshB.setText("Refresh");
        refreshB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBActionPerformed(evt);
            }
        });

        closeB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        closeB.setText("Close");
        closeB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(257, 257, 257)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                .addComponent(closeB))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(adnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(editB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshB))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel1))
                    .addComponent(closeB, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editB, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshB, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void adnoTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adnoTFKeyReleased
        tableSearchData();
    }//GEN-LAST:event_adnoTFKeyReleased

    private void markTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_markTMousePressed
        adnoTextFieldUpdate();
    }//GEN-LAST:event_markTMousePressed

    private void refreshBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBActionPerformed
        adnoTF.setText(null);
        markTableUpdate();
    }//GEN-LAST:event_refreshBActionPerformed

    private void closeBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeBActionPerformed

    private void editBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBActionPerformed
        if (!adnoTF.getText().equals("")) {
            studentMarks newpage = new studentMarks(adnoTF.getText());
            newpage.setVisible(true);
        }

    }//GEN-LAST:event_editBActionPerformed
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(markList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new markList().setVisible(true);
        });
    }

    public void markTableUpdate() {
        DefaultTableModel model = (DefaultTableModel) markT.getModel();
        model.setRowCount(0);
        model.setColumnCount(0);
        model.addColumn("Adno");
        model.addColumn("Sem");
        model.addColumn("sub1");
        model.addColumn("sub2");
        model.addColumn("sub3");
        model.addColumn("sub4");
        model.addColumn("sub5");
        model.addColumn("sub6");
        model.addColumn("lab1");
        model.addColumn("lab2");
        model.addColumn("CGPA");
        try {
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            sql = "select * from mark";
            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                    rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getString(10), rs.getString(11)});
            }
        } catch (SQLException ex) {
            //Logger.getLogger(dataBase.class.getName()).log(Level.SEVERE, null, ex);
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
        DefaultTableModel model = (DefaultTableModel) markT.getModel();
        int tableSelectedRow = markT.getSelectedRow();
        adnoTF.setText(model.getValueAt(tableSelectedRow, 0).toString());
    }

    private void tableSearchData() {
        DefaultTableModel model = (DefaultTableModel) markT.getModel();
        String search = adnoTF.getText();
        TableRowSorter<DefaultTableModel> tableSearch = new TableRowSorter<>(model);
        markT.setRowSorter(tableSearch);
        tableSearch.setRowFilter(RowFilter.regexFilter(search));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adnoTF;
    private javax.swing.JButton closeB;
    private javax.swing.JButton editB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable markT;
    private javax.swing.JButton refreshB;
    // End of variables declaration//GEN-END:variables

}
