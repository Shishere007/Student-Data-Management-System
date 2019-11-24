package SDMS;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public final class adminHome extends javax.swing.JFrame {

    public static final String JDBC_DRIVER = "org.h2.Driver";
    public static final String DB_URL = "jdbc:h2:~/SDMS";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "";
    public static Connection con = null;
    public static String sql = null;
    public static PreparedStatement pst = null;

    public adminHome() {
        initComponents();
        startup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        changePasswordB = new javax.swing.JButton();
        exitB = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataT = new javax.swing.JTable();
        newStudentB = new javax.swing.JButton();
        editStudentB = new javax.swing.JButton();
        projectB = new javax.swing.JButton();
        refreshB = new javax.swing.JButton();
        adnoTF = new javax.swing.JTextField();
        markListB = new javax.swing.JButton();
        filterBy1B = new javax.swing.JComboBox<>();
        filterBy2B = new javax.swing.JComboBox<>();
        filterB = new javax.swing.JButton();
        filterBy3B = new javax.swing.JComboBox<>();
        loginPageB1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("editStudentF");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Admin Panel");

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 257, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changePasswordB, javax.swing.GroupLayout.Alignment.TRAILING)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
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
        dataT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataTMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                dataTMousePressed(evt);
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

        projectB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        projectB.setText("Project");
        projectB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        projectB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                projectBMouseClicked(evt);
            }
        });
        projectB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectBActionPerformed(evt);
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

        filterBy1B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        filterBy1B.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                filterBy1BItemStateChanged(evt);
            }
        });
        filterBy1B.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filterBy1BMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                filterBy1BMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                filterBy1BMouseReleased(evt);
            }
        });
        filterBy1B.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
                filterBy1BCaretPositionChanged(evt);
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
            }
        });
        filterBy1B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterBy1BActionPerformed(evt);
            }
        });

        filterBy2B.setMaximumRowCount(10);
        filterBy2B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        filterB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        filterB.setText("Filter");
        filterB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        filterB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterBActionPerformed(evt);
            }
        });

        filterBy3B.setMaximumRowCount(10);
        filterBy3B.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        filterBy3B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterBy3BActionPerformed(evt);
            }
        });

        loginPageB1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        loginPageB1.setText("Login Page");
        loginPageB1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginPageB1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginPageB1MouseClicked(evt);
            }
        });
        loginPageB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginPageB1ActionPerformed(evt);
            }
        });
        loginPageB1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                loginPageB1KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(adnoTF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filterBy1B, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(editStudentB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(markListB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(projectB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshB))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filterBy2B, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(filterBy3B, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(filterB)))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(loginPageB1, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                        .addGap(51, 51, 51))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(newStudentB, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(loginPageB1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newStudentB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filterBy2B)
                    .addComponent(filterBy1B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(filterBy3B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filterB))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editStudentB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(markListB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        if (!adnoTF.getText().equals("")) {
            editStudent newpage = new editStudent(adnoTF.getText());
            newpage.setVisible(true);
        }

    }//GEN-LAST:event_editStudentBActionPerformed

    private void projectBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectBActionPerformed
        projectDetails newpage = new projectDetails();
        newpage.setVisible(true);
    }//GEN-LAST:event_projectBActionPerformed

    private void projectBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectBMouseClicked

    }//GEN-LAST:event_projectBMouseClicked

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
        tableSearchData();
    }//GEN-LAST:event_adnoTFKeyReleased

    private void dataTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataTMouseClicked

    }//GEN-LAST:event_dataTMouseClicked

    private void dataTMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataTMousePressed
        adnoTextFieldUpdate();
    }//GEN-LAST:event_dataTMousePressed

    private void filterBy1BMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filterBy1BMouseClicked

    }//GEN-LAST:event_filterBy1BMouseClicked

    private void filterBy1BMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filterBy1BMouseExited

    }//GEN-LAST:event_filterBy1BMouseExited

    private void filterBy1BItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_filterBy1BItemStateChanged

    }//GEN-LAST:event_filterBy1BItemStateChanged

    private void filterBy1BMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filterBy1BMouseReleased

    }//GEN-LAST:event_filterBy1BMouseReleased

    private void filterBy1BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterBy1BActionPerformed
        if (filterBy1B.getSelectedIndex() != -1) {
            updateFilterComboBox2();
        }
    }//GEN-LAST:event_filterBy1BActionPerformed

    private void filterBy1BCaretPositionChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_filterBy1BCaretPositionChanged

    }//GEN-LAST:event_filterBy1BCaretPositionChanged

    private void filterBy3BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterBy3BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_filterBy3BActionPerformed

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

    private void loginPageB1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginPageB1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_loginPageB1MouseClicked

    private void loginPageB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginPageB1ActionPerformed
        new Login().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginPageB1ActionPerformed

    private void loginPageB1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_loginPageB1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_loginPageB1KeyPressed

    private void exitBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitBMouseClicked
        exitprogram();
    }//GEN-LAST:event_exitBMouseClicked

    private void exitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBActionPerformed
        exitprogram();
    }//GEN-LAST:event_exitBActionPerformed

    private void exitBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_exitBKeyPressed
        exitprogram();
    }//GEN-LAST:event_exitBKeyPressed

    private void filterBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterBActionPerformed
        if (filterBy1B.getSelectedIndex() != -1) {
            filterTable();
        }
    }//GEN-LAST:event_filterBActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new adminHome().setVisible(true);
        });
    }

    public void markList() {
        if (adnoTF.getText().isBlank()) {
            markList newpage = new markList();
            newpage.setVisible(true);
        } else {
            studentMarks newpage = new studentMarks(adnoTF.getText());
            newpage.setVisible(true);
        }
    }

    private void adnoTextFieldUpdate() {
        DefaultTableModel model = (DefaultTableModel) dataT.getModel();
        int tableSelectedRow = dataT.getSelectedRow();
        adnoTF.setText(model.getValueAt(tableSelectedRow, 0).toString());
    }

    private void tableSearchData() {
        DefaultTableModel model = (DefaultTableModel) dataT.getModel();
        String search = adnoTF.getText();
        TableRowSorter<DefaultTableModel> tableSearch = new TableRowSorter<>(model);
        dataT.setRowSorter(tableSearch);
        tableSearch.setRowFilter(RowFilter.regexFilter(search));
    }

    private void startup() {
        tableDataUpdate();
        dataT.setAutoCreateRowSorter(true);
        updateFilterComboBox1();
        filterBy2B.setEnabled(false);
        filterBy1B.setSelectedIndex(-1);
        filterBy3B.setVisible(false);
    }

    private void updateFilterComboBox1() {
        filterBy1B.addItem("Semester");
        filterBy1B.addItem("Department");
        filterBy1B.addItem("Gender");

    }

    private void exitprogram() {
        int YesNo;
        YesNo = JOptionPane.showConfirmDialog(this, "Are you sure?", "Exit Program", JOptionPane.YES_NO_OPTION);
        if (YesNo == 0) {
            System.exit(0);
        }
    }

    private void updateFilterComboBox2() {
        filterBy2B.setEnabled(true);
        filterBy2B.removeAllItems();
        filterBy3B.removeAllItems();
        filterBy3B.addItem("0");
        switch (filterBy1B.getSelectedItem().toString()) {
            case "Department":
                try {
                    con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
                    sql = "select * from course";
                    pst = con.prepareStatement(sql);
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {
                        filterBy2B.addItem(rs.getString(1));
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
                for (int loopVar = 1; loopVar < 9; loopVar += 1) {
                    filterBy3B.addItem(String.valueOf(loopVar));
                }
                filterBy3B.setVisible(true);
                break;
            case "Gender":
                filterBy2B.addItem("Male");
                filterBy2B.addItem("Female");
                filterBy3B.setVisible(false);
                break;
            case "Semester":
                for (int loopVar = 1; loopVar < 9; loopVar += 1) {
                    filterBy2B.addItem(String.valueOf(loopVar));
                }
                filterBy3B.setVisible(false);
                break;
            default:
                break;
        }
        filterBy2B.setSelectedIndex(0);
    }

    private void filterTable() {
        try {
            DefaultTableModel model = (DefaultTableModel) dataT.getModel();
            model.setRowCount(0);
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            switch (filterBy1B.getSelectedItem().toString()) {
                case "Department":
                    if (filterBy3B.getSelectedItem().toString().equals("0")) {
                        sql = "select * from student where dept = ?";
                        pst = con.prepareStatement(sql);
                        pst.setString(1, filterBy2B.getSelectedItem().toString());
                        ResultSet rs = pst.executeQuery();
                        while (rs.next()) {
                            model.addRow(new Object[]{rs.getString(1), rs.getString(3), rs.getString(4),
                                rs.getString(5), rs.getString(6), rs.getString(7)});
                        }
                    } else {
                        sql = "select * from student where dept = ? and sem = ?";
                        pst = con.prepareStatement(sql);
                        pst.setString(1, filterBy2B.getSelectedItem().toString());
                        pst.setString(2, filterBy3B.getSelectedItem().toString());
                        ResultSet rs = pst.executeQuery();
                        while (rs.next()) {
                            model.addRow(new Object[]{rs.getString(1), rs.getString(3), rs.getString(4),
                                rs.getString(5), rs.getString(6), rs.getString(7)});
                        }
                    }

                    break;
                case "Gender":
                    sql = "select * from student where sex = ? ";
                    pst = con.prepareStatement(sql);
                    pst.setString(1, filterBy2B.getSelectedItem().toString());
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {
                        model.addRow(new Object[]{rs.getString(1), rs.getString(3), rs.getString(4),
                            rs.getString(5), rs.getString(6), rs.getString(7)});
                    }
                    break;
                case "Semester":
                    sql = "select * from student where sem = ? ";
                    pst = con.prepareStatement(sql);
                    pst.setString(1, filterBy2B.getSelectedItem().toString());
                    rs = pst.executeQuery();
                    while (rs.next()) {
                        model.addRow(new Object[]{rs.getString(1), rs.getString(3), rs.getString(4),
                            rs.getString(5), rs.getString(6), rs.getString(7)});
                    }
                    break;
                default:
                    break;
            }
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(this, ex);
        } finally {
            try {
                if (con != null) {
                    con.close();
                }

            } catch (SQLException e) {
            }
        }

    }

    public void tableDataUpdate() {
        adnoTF.setText(null);
        DefaultTableModel model = (DefaultTableModel) dataT.getModel();
        model.setRowCount(0);
        try {
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            sql = "select * from student order by adno";
            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(3), rs.getString(4),
                    rs.getString(5), rs.getString(6), rs.getString(7)});
            }
        } catch (SQLException e) {
            //JOptionPane.showMessageDialog(this, e);
        } finally {
            try {
                if (con != null) {
                    con.close();
                }

            } catch (SQLException e) {
            }
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adnoTF;
    private javax.swing.JButton changePasswordB;
    private javax.swing.JTable dataT;
    private javax.swing.JButton editStudentB;
    private javax.swing.JButton exitB;
    private javax.swing.JButton filterB;
    private javax.swing.JComboBox<String> filterBy1B;
    private javax.swing.JComboBox<String> filterBy2B;
    private javax.swing.JComboBox<String> filterBy3B;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton loginPageB1;
    private javax.swing.JButton markListB;
    private javax.swing.JButton newStudentB;
    private javax.swing.JButton projectB;
    private javax.swing.JButton refreshB;
    // End of variables declaration//GEN-END:variables

}
