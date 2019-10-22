/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SDMS;

import java.awt.HeadlessException;
import java.sql.*;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class studentMarks extends javax.swing.JFrame {

    public static final String JDBC_DRIVER = "org.h2.Driver";
    public static final String DB_URL = "jdbc:h2:~/SDMS";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "";
    String adno;

    public studentMarks() {
        initComponents();
        adno = "17015";
        startup();
    }

    public studentMarks(String number) {
        initComponents();
        adno = number;
        startup();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adnoCB = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        sub5TF = new javax.swing.JTextField();
        sub6TF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lab1TF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lab2TF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cgpaTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        sub2TF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        sub1TF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        sub3TF = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        sub4TF = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        submitB = new javax.swing.JButton();
        cancelB = new javax.swing.JButton();
        semCB = new javax.swing.JComboBox<>();
        adnoTF = new javax.swing.JTextField();

        adnoCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adnoCBActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Admission No :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Name :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Subject 1 :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Subject 2:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Semester :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Subject 3 :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Subject 5 :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Subject 4 :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("CGPA :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Lab 2 :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Lab 1 :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Subject 6 :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Marks in Subjects");

        submitB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        submitB.setText("Submit");
        submitB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBActionPerformed(evt);
            }
        });

        cancelB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancelB.setText("Cancel");
        cancelB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBActionPerformed(evt);
            }
        });

        semCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semCBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cgpaTF)
                            .addComponent(lab2TF)
                            .addComponent(lab1TF)
                            .addComponent(sub6TF)
                            .addComponent(sub5TF)
                            .addComponent(sub4TF)
                            .addComponent(nameTF)
                            .addComponent(sub1TF)
                            .addComponent(sub2TF)
                            .addComponent(sub3TF)
                            .addComponent(semCB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adnoTF)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(submitB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelB)))
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(adnoTF)
                        .addGap(1, 1, 1)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(nameTF)
                        .addGap(1, 1, 1)))
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(semCB, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub2TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub3TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub4TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub5TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub6TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lab1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lab2TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cgpaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelB)
                    .addComponent(submitB))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBActionPerformed
        submit();
    }//GEN-LAST:event_submitBActionPerformed

    private void cancelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelBActionPerformed

    private void semCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semCBActionPerformed
        markSearch();
    }//GEN-LAST:event_semCBActionPerformed

    private void adnoCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adnoCBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adnoCBActionPerformed

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
            java.util.logging.Logger.getLogger(studentMarks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new studentMarks().setVisible(true);
        });
    }

    private void submit() {
        if (semCB.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Semester not selected", "Error", JOptionPane.OK_OPTION);
        } else if (sub1TF.getText().equals("") || sub2TF.getText().equals("") || sub3TF.getText().equals("")
                || sub4TF.getText().equals("") || sub5TF.getText().equals("") || sub6TF.getText().equals("")
                || lab1TF.getText().equals("") || lab2TF.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Fields cannot be empty", "Error", JOptionPane.OK_OPTION);
        } else if (Integer.valueOf(sub1TF.getText()) > 100 || Integer.valueOf(sub2TF.getText()) > 100
                || Integer.valueOf(sub3TF.getText()) > 100 || Integer.valueOf(sub4TF.getText()) > 100
                || Integer.valueOf(sub5TF.getText()) > 100 || Integer.valueOf(sub6TF.getText()) > 100
                || Integer.valueOf(lab1TF.getText()) > 100 || Integer.valueOf(lab2TF.getText()) > 100) {
            JOptionPane.showMessageDialog(this, "Marks cannot be greater than 100", "Invalid Mark", JOptionPane.OK_OPTION);
        } else if (JOptionPane.showConfirmDialog(this, "Marks cannot be edited after submission."
                + "Continue?", "Submit Mark", JOptionPane.YES_NO_OPTION) == 0) {
            try {
                Class.forName(JDBC_DRIVER);
                Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
                String sql = "insert into mark values(?,?,?,?,?,?,?,?,?,?,?)";
                PreparedStatement pst = con.prepareStatement(sql);
                pst.setString(1, String.valueOf(adno));
                pst.setString(2, String.valueOf(semCB.getSelectedItem()));
                pst.setString(3, sub1TF.getText());
                pst.setString(4, sub2TF.getText());
                pst.setString(5, sub3TF.getText());
                pst.setString(6, sub4TF.getText());
                pst.setString(7, sub5TF.getText());
                pst.setString(8, sub6TF.getText());
                pst.setString(9, lab1TF.getText());
                pst.setString(10, lab2TF.getText());
                pst.setString(11, String.valueOf(CGPA()));
                pst.executeUpdate();
                con.close();
                JOptionPane.showMessageDialog(this, "Success");
                markSearch();
            } catch (SQLException | ClassNotFoundException e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }

    private void insertSem() {
        semCB.removeAllItems();
        try {
            Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            String sql = "select sem from student where adno=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, String.valueOf(adnoTF.getText()));
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                int loopVar = 1;
                while (loopVar < rs.getInt(1)) {
                    semCB.addItem(String.valueOf(loopVar));
                    loopVar = loopVar + 1;
                }
                break;
            }
            con.close();
            semCB.setSelectedIndex(-1);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private void searchName() {
        try {
            Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            String sql = "select name from student where adno=?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, adno);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                nameTF.setText(rs.getString(1));
            }
            con.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        insertSem();
    }

    private void markSearch() {
        makeEditable();
        clearField();
        try {
            Connection con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            String sql = "select * from mark where adno=? and sem = ?";
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, adno);
            pst.setString(2, (String) semCB.getSelectedItem());
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                sub1TF.setText(rs.getString(3));
                sub2TF.setText(rs.getString(4));
                sub3TF.setText(rs.getString(5));
                sub4TF.setText(rs.getString(6));
                sub5TF.setText(rs.getString(7));
                sub6TF.setText(rs.getString(8));
                lab1TF.setText(rs.getString(9));
                lab2TF.setText(rs.getString(10));
                cgpaTF.setText(rs.getString(11));
                makeNonEditable();
            }
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private void makeNonEditable() {
        sub1TF.setEditable(false);
        sub2TF.setEditable(false);
        sub3TF.setEditable(false);
        sub4TF.setEditable(false);
        sub5TF.setEditable(false);
        sub6TF.setEditable(false);
        lab1TF.setEditable(false);
        lab2TF.setEditable(false);
        cgpaTF.setEditable(false);
        submitB.setVisible(false);

    }

    private void startup() {
        adnoTF.setText(adno);
        adnoTF.setEditable(false);
        searchName();
        cgpaTF.setEditable(false);
        nameTF.setEditable(false);

    }

    private void clearField() {
        sub1TF.setText(null);
        sub2TF.setText(null);
        sub3TF.setText(null);
        sub4TF.setText(null);
        sub5TF.setText(null);
        sub6TF.setText(null);
        lab1TF.setText(null);
        lab2TF.setText(null);
        cgpaTF.setText(null);
    }

    private String CGPA() {
        int totalMark = Integer.valueOf(sub1TF.getText()) + Integer.valueOf(sub2TF.getText())
                + Integer.valueOf(sub3TF.getText()) + Integer.valueOf(sub4TF.getText())
                + Integer.valueOf(sub5TF.getText()) + Integer.valueOf(sub6TF.getText())
                + Integer.valueOf(lab1TF.getText()) + Integer.valueOf(lab2TF.getText());
        float percentage = ((float) totalMark / 800) * 100;
        float cgpa = (float) (percentage / 9.5);
        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        return decimalFormat.format(cgpa);
    }

    private void makeEditable() {
        sub1TF.setEditable(true);
        sub2TF.setEditable(true);
        sub3TF.setEditable(true);
        sub4TF.setEditable(true);
        sub5TF.setEditable(true);
        sub6TF.setEditable(true);
        lab1TF.setEditable(true);
        lab2TF.setEditable(true);
        submitB.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> adnoCB;
    private javax.swing.JTextField adnoTF;
    private javax.swing.JButton cancelB;
    private javax.swing.JTextField cgpaTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField lab1TF;
    private javax.swing.JTextField lab2TF;
    private javax.swing.JTextField nameTF;
    private javax.swing.JComboBox<String> semCB;
    private javax.swing.JTextField sub1TF;
    private javax.swing.JTextField sub2TF;
    private javax.swing.JTextField sub3TF;
    private javax.swing.JTextField sub4TF;
    private javax.swing.JTextField sub5TF;
    private javax.swing.JTextField sub6TF;
    private javax.swing.JButton submitB;
    // End of variables declaration//GEN-END:variables

}
