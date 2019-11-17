package SDMS;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;

public class editStudent extends javax.swing.JFrame {

    public static final String JDBC_DRIVER = "org.h2.Driver";
    public static final String DB_URL = "jdbc:h2:~/SDMS";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "";
    public static Connection con = null;
    public static String sql = null;
    public static PreparedStatement pst = null;
    String adno;

    public editStudent() {
        initComponents();
        adno = "1234";
        startup();

    }

    public editStudent(String number) {
        initComponents();
        adno = number;
        startup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderRG = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        mailTF = new javax.swing.JTextField();
        phoneTF = new javax.swing.JTextField();
        dobTF = new javax.swing.JTextField();
        nameTF = new javax.swing.JTextField();
        rnoTF = new javax.swing.JTextField();
        maleRB = new javax.swing.JRadioButton();
        femaleRB = new javax.swing.JRadioButton();
        deptCB = new javax.swing.JComboBox<>();
        updateB = new javax.swing.JButton();
        cancelB = new javax.swing.JButton();
        deleteB = new javax.swing.JButton();
        adnoTF = new javax.swing.JTextField();
        semCB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Admission No:*");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Name:*");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("RollNo:*");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Gender:*");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Department:*");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Semester:*");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Date of Birth:*");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Email ID:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Phone Number:");

        mailTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mailTFKeyPressed(evt);
            }
        });

        phoneTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTFActionPerformed(evt);
            }
        });
        phoneTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                phoneTFKeyPressed(evt);
            }
        });

        dobTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dobTFKeyPressed(evt);
            }
        });

        nameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFActionPerformed(evt);
            }
        });
        nameTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nameTFKeyPressed(evt);
            }
        });

        rnoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rnoTFActionPerformed(evt);
            }
        });
        rnoTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                rnoTFKeyPressed(evt);
            }
        });

        genderRG.add(maleRB);
        maleRB.setText("Male");
        maleRB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        genderRG.add(femaleRB);
        femaleRB.setText("Female");
        femaleRB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        deptCB.setToolTipText("");
        deptCB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        updateB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        updateB.setText("Update");
        updateB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBActionPerformed(evt);
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

        deleteB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        deleteB.setText("Delete");
        deleteB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBActionPerformed(evt);
            }
        });

        adnoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adnoTFActionPerformed(evt);
            }
        });
        adnoTF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adnoTFKeyPressed(evt);
            }
        });

        semCB.setToolTipText("");
        semCB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(deptCB, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(maleRB)
                            .addGap(18, 18, 18)
                            .addComponent(femaleRB))
                        .addComponent(nameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                        .addComponent(rnoTF)
                        .addComponent(dobTF)
                        .addComponent(phoneTF)
                        .addComponent(mailTF)
                        .addComponent(adnoTF, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE))
                    .addComponent(semCB, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(updateB, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cancelB, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteB, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(adnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maleRB)
                    .addComponent(femaleRB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deptCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(semCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dobTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateB)
                    .addComponent(cancelB)
                    .addComponent(deleteB))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFActionPerformed

    }//GEN-LAST:event_nameTFActionPerformed

    private void rnoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rnoTFActionPerformed

    }//GEN-LAST:event_rnoTFActionPerformed

    private void updateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBActionPerformed
        confirm(1);
    }//GEN-LAST:event_updateBActionPerformed

    private void cancelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelBActionPerformed

    private void deleteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBActionPerformed
        confirm(0);
    }//GEN-LAST:event_deleteBActionPerformed

    private void phoneTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTFActionPerformed

    }//GEN-LAST:event_phoneTFActionPerformed

    private void adnoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adnoTFActionPerformed

    }//GEN-LAST:event_adnoTFActionPerformed

    private void adnoTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adnoTFKeyPressed

    }//GEN-LAST:event_adnoTFKeyPressed

    private void nameTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTFKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            updateData();
        }
    }//GEN-LAST:event_nameTFKeyPressed

    private void rnoTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rnoTFKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            updateData();
        }
    }//GEN-LAST:event_rnoTFKeyPressed

    private void dobTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dobTFKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            updateData();
        }
    }//GEN-LAST:event_dobTFKeyPressed

    private void mailTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailTFKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            updateData();
        }
    }//GEN-LAST:event_mailTFKeyPressed

    private void phoneTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneTFKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            updateData();
        }
    }//GEN-LAST:event_phoneTFKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new editStudent().setVisible(true);
        });
    }

    private void startup() {
        adnoTF.setText(adno);
        adnoTF.setEditable(false);
        insertDeptandSem();
        insertData();
        dobTF.setToolTipText("Format: YYYY-MM-DD");
    }

    private void deleteData() {
        String username = (String) adno;
        try {
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            sql = "delete from student where adno=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, (String) adno);
            pst.executeUpdate();
            sql = "delete from user where username=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, username);
            pst.executeUpdate();
            sql = "delete from mark where adno=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, adno);
            pst.executeUpdate();
            sql = "delete from project where adno=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, adno);
            pst.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(this, "Deletion Successful");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }

    private void confirm(int opt) {

        if (opt == 0 && JOptionPane.showConfirmDialog(this, "Delete this Student?", "", JOptionPane.YES_NO_OPTION) == 0) {
            deleteData();
            this.dispose();
        } else if (opt == 1) {
            updateData();
        }

    }

    private void insertData() {
        try {
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            sql = "select * from student where adno=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, (String) adno);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                rnoTF.setText(String.valueOf(rs.getInt(2)));
                nameTF.setText(rs.getString(3));
                if (rs.getString(4).equals("Male")) {
                    maleRB.setSelected(true);
                } else {
                    femaleRB.setSelected(true);
                }
                deptCB.setSelectedItem(rs.getString(5));
                semCB.setSelectedItem(String.valueOf(rs.getInt(6)));
                dobTF.setText(String.valueOf(rs.getDate(7)));
                mailTF.setText(rs.getString(8));
                phoneTF.setText(rs.getString(9));
            }
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private void updateData() {
        String date = dobTF.getText();
        String phone = phoneTF.getText();
        String name = nameTF.getText();
        String rno = rnoTF.getText();
        String mail = mailTF.getText();
        String username = adno;
        try {
            if (name.equals("") || rno.equals("") || date.equals("")) //add date null condition
            {
                JOptionPane.showMessageDialog(this, "* field must have value");
            } else if (!(name.matches("[A-Z]+[a-z]+[ ]+")) && name.length() < 3) {

            } else if (Integer.valueOf(rno) <= 0 && !(rno.matches("[[0-9]+"))) {

            } else if ((deptCB.getSelectedItem().toString().equals("   "))) {
                JOptionPane.showMessageDialog(this, "Department not selectd");
            } else if ((int) semCB.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(this, "Semester Not Selected");
            } else if ((!(mail.contains("@")) && !(mail.contains(".com"))) && !(mail.equals(""))) {

            } else if (!(phone.equals("")) && (phone.length() != 10)) {
                JOptionPane.showMessageDialog(this, "Must be at least 10 letter long");
            } else if (!(phone.equals("")) && !(phone.matches("[0-9]+"))) {
                JOptionPane.showMessageDialog(this, "Invalid Characters");
            } else {
                try {
                    con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
                    sql = "delete from student where adno=?";
                    pst = con.prepareStatement(sql);
                    pst.setString(1, adno);
                    pst.executeUpdate();
                    sql = "insert into student values(?,?,?,?,?,?,?,?,?)";
                    pst = con.prepareStatement(sql);
                    pst.setString(1, adno);
                    pst.setString(2, rnoTF.getText());
                    pst.setString(3, nameTF.getText());
                    if (maleRB.isSelected()) {
                        pst.setString(4, "Male");
                    } else if (femaleRB.isSelected()) {
                        pst.setString(4, "Female");
                    }
                    pst.setString(5, deptCB.getSelectedItem().toString());
                    pst.setString(6, semCB.getSelectedItem().toString());
                    pst.setString(7, dobTF.getText());
                    pst.setString(8, mailTF.getText());
                    pst.setString(9, phoneTF.getText());
                    pst.executeUpdate();
                    sql = "delete from user where username=?";
                    pst = con.prepareStatement(sql);
                    pst.setString(1, username);
                    pst.executeUpdate();
                    sql = "insert into user values(?,?)";
                    pst = con.prepareStatement(sql);
                    pst.setString(1, username);
                    pst.setString(2, adno);
                    pst.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Updation Success");
                    con.close();

                } catch (HeadlessException | SQLException e) {
                    JOptionPane.showMessageDialog(this, e);
                }
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private void insertDeptandSem() {
        deptCB.removeAllItems();
        try {
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            sql = "select dept from course";
            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                deptCB.addItem(rs.getString(1));
            }
            con.close();
            deptCB.setSelectedIndex(-1);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
        for (int loopVar = 1; loopVar < 9; loopVar += 1) {
            semCB.addItem(String.valueOf(loopVar));
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adnoTF;
    private javax.swing.JButton cancelB;
    private javax.swing.JButton deleteB;
    private javax.swing.JComboBox<String> deptCB;
    private javax.swing.JTextField dobTF;
    private javax.swing.JRadioButton femaleRB;
    private javax.swing.ButtonGroup genderRG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField mailTF;
    private javax.swing.JRadioButton maleRB;
    private javax.swing.JTextField nameTF;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JTextField rnoTF;
    private javax.swing.JComboBox<String> semCB;
    private javax.swing.JButton updateB;
    // End of variables declaration//GEN-END:variables

}
