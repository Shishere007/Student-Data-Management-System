package SDMS;

import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.sql.*;
import javax.swing.JOptionPane;

public class addStudent extends javax.swing.JFrame {

    public static final String JDBC_DRIVER = "org.h2.Driver";
    public static final String DB_URL = "jdbc:h2:~/SDMS";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "";
    public static Connection con = null;
    public static String sql = null;
    public static PreparedStatement pst = null;

    public addStudent() {
        initComponents();
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
        cancelB = new javax.swing.JButton();
        clearB = new javax.swing.JButton();
        adnoTF = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        errorADNO = new javax.swing.JLabel();
        errorNAME = new javax.swing.JLabel();
        errorSEM = new javax.swing.JLabel();
        errorMAIL = new javax.swing.JLabel();
        errorRNO = new javax.swing.JLabel();
        submitB = new javax.swing.JButton();
        errorPhone = new javax.swing.JLabel();
        semCB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dobTFKeyReleased(evt);
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
        femaleRB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRBActionPerformed(evt);
            }
        });

        deptCB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        cancelB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        cancelB.setText("Cancel");
        cancelB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBActionPerformed(evt);
            }
        });

        clearB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        clearB.setText("Clear");
        clearB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBActionPerformed(evt);
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

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("New Student");

        errorADNO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        errorADNO.setForeground(new java.awt.Color(255, 0, 0));

        errorNAME.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        errorNAME.setForeground(new java.awt.Color(255, 0, 0));

        errorSEM.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        errorSEM.setForeground(new java.awt.Color(255, 0, 51));

        errorMAIL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        errorMAIL.setForeground(new java.awt.Color(255, 0, 51));

        errorRNO.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        errorRNO.setForeground(new java.awt.Color(255, 0, 0));

        submitB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        submitB.setText("Submit");
        submitB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        submitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBActionPerformed(evt);
            }
        });

        errorPhone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        errorPhone.setForeground(new java.awt.Color(255, 0, 51));

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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nameTF, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                    .addComponent(rnoTF)
                    .addComponent(dobTF)
                    .addComponent(phoneTF)
                    .addComponent(mailTF)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(maleRB)
                        .addGap(18, 18, 18)
                        .addComponent(femaleRB))
                    .addComponent(adnoTF)
                    .addComponent(deptCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(semCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errorADNO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(errorNAME, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(errorSEM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(errorRNO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(errorPhone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(errorMAIL, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(cancelB, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(submitB, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(clearB, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(126, 126, 126)
                        .addComponent(jLabel10)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorADNO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorNAME))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(errorRNO, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maleRB)
                    .addComponent(femaleRB))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deptCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorSEM)
                    .addComponent(semCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(errorMAIL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errorPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelB)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(clearB)
                        .addComponent(submitB)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTFActionPerformed

    private void rnoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rnoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rnoTFActionPerformed

    private void cancelBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBActionPerformed
        this.dispose();
    }//GEN-LAST:event_cancelBActionPerformed

    private void phoneTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneTFActionPerformed

    private void clearBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBActionPerformed
        clearfield();
    }//GEN-LAST:event_clearBActionPerformed

    private void adnoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adnoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_adnoTFActionPerformed

    private void submitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBActionPerformed
        submit();
    }//GEN-LAST:event_submitBActionPerformed

    private void femaleRBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleRBActionPerformed

    private void dobTFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dobTFKeyReleased
    }//GEN-LAST:event_dobTFKeyReleased

    private void dobTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dobTFKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            submit();
        }
    }//GEN-LAST:event_dobTFKeyPressed

    private void adnoTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adnoTFKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            submit();
        }
    }//GEN-LAST:event_adnoTFKeyPressed

    private void nameTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nameTFKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            submit();
        }
    }//GEN-LAST:event_nameTFKeyPressed

    private void rnoTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_rnoTFKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            submit();
        }
    }//GEN-LAST:event_rnoTFKeyPressed

    private void mailTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailTFKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            submit();
        }
    }//GEN-LAST:event_mailTFKeyPressed

    private void phoneTFKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phoneTFKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            submit();
        }
    }//GEN-LAST:event_phoneTFKeyPressed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new addStudent().setVisible(true);
        });
    }

    private void startup() {
        insertDeptandSem();
        clearfield();
        dobTF.setToolTipText("Format: YYYY-MM-DD");
    }

    private void submit() {
        String date = dobTF.getText();
        String phone = phoneTF.getText();
        String adno = adnoTF.getText();
        String name = nameTF.getText();
        String rno = rnoTF.getText();
        String mail = mailTF.getText();
        String username = adno;
        clearError();
        try {
            if (adno.equals("") || name.equals("") || rnoTF.getText().equals("") || date.equals("")) {
                JOptionPane.showMessageDialog(this, "* field must have value");
            } else if (!(adno.matches("[0-9]+"))) {
                errorADNO.setText("Invalid");
            } else if (name.contains("[1-9]+[!,@,#,$,%,^,&,*]") || name.length() < 3) {
                errorNAME.setText("Invalid");
            } else if (!(rnoTF.getText().matches("[0-9]+")) || (!(rnoTF.getText().matches("[0-9]+")) && Integer.valueOf(rnoTF.getText()) <= 0)) {
                errorRNO.setText("Invalid");
            } else if (deptCB.getSelectedIndex() < 0) {
                JOptionPane.showMessageDialog(this, "Department not selected");
            } else if ((!(mail.contains("@")) && !(mail.contains(".com"))) && (!(mail.equals(""))) && mail.length() < 12) {
                errorMAIL.setText("Invalid");
            } else if (!(phone.equals("")) && (phone.length() != 10)) {
                errorPhone.setText("Invalid");
            } else if (!(phone.equals("")) && !(phone.matches("[0-9]+"))) {
                errorPhone.setText("Invalid");
            } else {
                try {
                    con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
                    sql = "select name from student where adno=?";
                    pst = con.prepareStatement(sql);
                    pst.setString(1, adnoTF.getText());
                    ResultSet rs = pst.executeQuery();
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(this, "Admission Number Already Exists", "", JOptionPane.OK_OPTION);
                    } else {
                        sql = "insert into student values(?,?,?,?,?,?,?,?,?)";
                        pst = con.prepareStatement(sql);
                        pst.setString(1, adnoTF.getText());
                        pst.setString(2, rno);
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
                        sql = "insert into user values(?,?)";
                        pst = con.prepareStatement(sql);
                        pst.setString(1, username);
                        pst.setString(2, adnoTF.getText());
                        pst.executeUpdate();
                        JOptionPane.showMessageDialog(this, "Submission Success");
                        clearfield();
                    }

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
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private void clearfield() {
        clearError();
        dobTF.setText(null);
        maleRB.setSelected(true);
        adnoTF.setText(null);
        nameTF.setText(null);
        rnoTF.setText(null);
        phoneTF.setText(null);
        mailTF.setText(null);
        dobTF.setText(null);
        deptCB.setSelectedIndex(-1);
        semCB.setSelectedIndex(-1);
    }

    private void clearError() {
        errorADNO.setText(null);
        errorNAME.setText(null);
        errorRNO.setText(null);
        errorSEM.setText(null);
        errorMAIL.setText(null);
        errorPhone.setText(null);
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
            deptCB.setSelectedIndex(-1);
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
        for (int loopVar = 1; loopVar < 9; loopVar += 1) {
            semCB.addItem(String.valueOf(loopVar));
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adnoTF;
    private javax.swing.JButton cancelB;
    private javax.swing.JButton clearB;
    private javax.swing.JComboBox<String> deptCB;
    private javax.swing.JTextField dobTF;
    private javax.swing.JLabel errorADNO;
    private javax.swing.JLabel errorMAIL;
    private javax.swing.JLabel errorNAME;
    private javax.swing.JLabel errorPhone;
    private javax.swing.JLabel errorRNO;
    private javax.swing.JLabel errorSEM;
    private javax.swing.JRadioButton femaleRB;
    private javax.swing.ButtonGroup genderRG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JButton submitB;
    // End of variables declaration//GEN-END:variables

}
