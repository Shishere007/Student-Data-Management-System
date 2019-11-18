package SDMS;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class dataBase extends javax.swing.JFrame {

    public static final String JDBC_DRIVER = "org.h2.Driver";
    public static final String DB_URL = "jdbc:h2:~/SDMS";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "";
    public static Connection con = null;
    public static String sql = null;
    public static PreparedStatement pst = null;
    public static final String Create_Table_User = "Create Table user ( username varchar(20) primary key,\n"
            + "password varchar(10))";
    public static final String Create_Table_Student = "create table student( adno int(6) primary key,\n"
            + "rollno int(2) not null,\n"
            + "name varchar(25) not null,\n"
            + "sex varchar(6) not null default 'Male',\n"
            + "dept varchar(5) not null,\n"
            + "sem int(1) not null check(sem>0),\n"
            + "dob date,\n"
            + "email varchar(25),\n"
            + "phone varchar(10))";
    public static final String Create_Table_Project = "create table project( adno int(6) primary key,\n"
            + "sname varchar2(25) not null,\n"
            + "pname varchar2(20) not null,\n"
            + "approved varchar(3) default 'no',\n"
            + "year int(4) not null default '2019')";
    public static final String Create_Table_Course = "create table course(dept varchar(4) primary key,\n"
            + "deptName varchar2(30) not null)";
    public static final String Create_Table_Mark = "create table mark (adno int(6) not null,\n"
            + "sem int(1) not null,\n"
            + "sub1 int default '0',\n"
            + "sub2 int default '0',\n"
            + "sub3 int default '0',\n"
            + "sub4 int default '0',\n"
            + "sub5 int default '0',\n"
            + "sub6 int default '0',\n"
            + "lab1 int default '0',\n"
            + "lab2 int default '0',\n"
            + "cgpa float default '0',\n"
            + "primary key (adno,sem));";

    public dataBase() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane3 = new javax.swing.JTabbedPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        closeTabe1B = new javax.swing.JButton();
        createTableL = new javax.swing.JLabel();
        dropTableL = new javax.swing.JLabel();
        updateBasicDataL = new javax.swing.JLabel();
        emptyTableL = new javax.swing.JLabel();
        updateSampleDataL = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginPage2B = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataBaseT = new javax.swing.JTable();
        studentB = new javax.swing.JButton();
        courseB = new javax.swing.JButton();
        userB = new javax.swing.JButton();
        markB = new javax.swing.JButton();
        projectB = new javax.swing.JButton();
        closeTabe2B = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        loginPageB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        closeTabe1B.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        closeTabe1B.setText("Close");
        closeTabe1B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeTabe1BActionPerformed(evt);
            }
        });

        createTableL.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        createTableL.setText("►  Create Tables");
        createTableL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        createTableL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                createTableLMouseClicked(evt);
            }
        });

        dropTableL.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        dropTableL.setText("►  Drop Tables");
        dropTableL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dropTableL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dropTableLMouseClicked(evt);
            }
        });

        updateBasicDataL.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        updateBasicDataL.setText("►  Update Basic Table Data");
        updateBasicDataL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateBasicDataL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateBasicDataLMouseClicked(evt);
            }
        });

        emptyTableL.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        emptyTableL.setText("►  Empty Tables");
        emptyTableL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        emptyTableL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                emptyTableLMouseClicked(evt);
            }
        });

        updateSampleDataL.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        updateSampleDataL.setText("►  Update Sample Table Data");
        updateSampleDataL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateSampleDataL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateSampleDataLMouseClicked(evt);
            }
        });

        jLabel2.setText("sample data update not configured");

        loginPage2B.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        loginPage2B.setText("Login Page");
        loginPage2B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginPage2BActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginPage2B)
                        .addGap(18, 18, 18)
                        .addComponent(closeTabe1B))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emptyTableL, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dropTableL, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(createTableL, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(updateBasicDataL, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(updateSampleDataL, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(220, 220, 220)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 150, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(closeTabe1B)
                    .addComponent(loginPage2B))
                .addGap(78, 78, 78)
                .addComponent(createTableL, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dropTableL, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateBasicDataL, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(emptyTableL, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateSampleDataL, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92)
                .addComponent(jLabel2)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Start Setup", jPanel2);

        dataBaseT.setModel(dataBaseT.getModel());
        jScrollPane1.setViewportView(dataBaseT);

        studentB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        studentB.setText("Student");
        studentB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentBActionPerformed(evt);
            }
        });

        courseB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        courseB.setText("Course");
        courseB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                courseBActionPerformed(evt);
            }
        });

        userB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        userB.setText("User");
        userB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userBActionPerformed(evt);
            }
        });

        markB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        markB.setText("Mark");
        markB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                markBActionPerformed(evt);
            }
        });

        projectB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        projectB.setText("Project");
        projectB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                projectBActionPerformed(evt);
            }
        });

        closeTabe2B.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        closeTabe2B.setText("Close");
        closeTabe2B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeTabe2BActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Database");

        loginPageB.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        loginPageB.setText("Login Page");
        loginPageB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginPageBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studentB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(courseB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(markB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(projectB)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(262, 262, 262)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginPageB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(closeTabe2B)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(closeTabe2B)
                        .addComponent(loginPageB))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(studentB)
                    .addComponent(courseB)
                    .addComponent(userB)
                    .addComponent(markB)
                    .addComponent(projectB))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Tables", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void studentBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentBActionPerformed
        studentTableUpdate();
    }//GEN-LAST:event_studentBActionPerformed

    private void courseBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_courseBActionPerformed
        courseTableUpdate();
    }//GEN-LAST:event_courseBActionPerformed

    private void userBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userBActionPerformed
        userTableUpdate();
    }//GEN-LAST:event_userBActionPerformed

    private void markBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_markBActionPerformed
        markTableUpdate();
    }//GEN-LAST:event_markBActionPerformed

    private void projectBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_projectBActionPerformed
        projectTableUpdate();
    }//GEN-LAST:event_projectBActionPerformed

    private void closeTabe2BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeTabe2BActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeTabe2BActionPerformed

    private void closeTabe1BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeTabe1BActionPerformed
        this.dispose();
    }//GEN-LAST:event_closeTabe1BActionPerformed

    private void createTableLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_createTableLMouseClicked
        createTables();
    }//GEN-LAST:event_createTableLMouseClicked

    private void dropTableLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dropTableLMouseClicked
        if (JOptionPane.showConfirmDialog(this, "Sure?", "", JOptionPane.YES_NO_OPTION) == 0) {
            dropTables();
        }

    }//GEN-LAST:event_dropTableLMouseClicked

    private void updateBasicDataLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateBasicDataLMouseClicked
        updateBasicTableData();
    }//GEN-LAST:event_updateBasicDataLMouseClicked

    private void emptyTableLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_emptyTableLMouseClicked
        if (JOptionPane.showConfirmDialog(this, "Sure?", "", JOptionPane.YES_NO_OPTION) == 0) {
            emptyTables();
        }
    }//GEN-LAST:event_emptyTableLMouseClicked

    private void updateSampleDataLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateSampleDataLMouseClicked
        JOptionPane.showMessageDialog(this, "Feature not Updated");
    }//GEN-LAST:event_updateSampleDataLMouseClicked

    private void loginPage2BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginPage2BActionPerformed
        login newpage = new login();
        newpage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginPage2BActionPerformed

    private void loginPageBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginPageBActionPerformed
        login newpage = new login();
        newpage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_loginPageBActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dataBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new dataBase().setVisible(true);
        });
    }

    private void createTables() {
        try {
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            pst = con.prepareStatement(Create_Table_User);
            pst.execute();
            pst = con.prepareStatement(Create_Table_Student);
            pst.execute();
            pst = con.prepareStatement(Create_Table_Project);
            pst.execute();
            pst = con.prepareStatement(Create_Table_Course);
            pst.execute();
            pst = con.prepareStatement(Create_Table_Mark);
            pst.execute();
            con.close();
            JOptionPane.showMessageDialog(this, "Tables created successfully");
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Tables Exists!!!");
        }
    }

    private void updateBasicTableData() {
        try {
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            sql = "insert into course values ('" + "CSE" + "',"
                    + "'" + "Computer Science" + "')";
            pst = con.prepareStatement(sql);
            pst.execute();
            sql = "insert into course values ('" + "EEE" + "',"
                    + "'" + "Electrical and Electronics" + "')";
            pst = con.prepareStatement(sql);
            pst.execute();
            sql = "insert into course values ('" + "ECE" + "',"
                    + "'" + "Electronics and Communications" + "')";
            pst = con.prepareStatement(sql);
            pst.execute();
            sql = "insert into course values ('" + "IT" + "',"
                    + "'" + "Information Technology" + "')";
            pst = con.prepareStatement(sql);
            pst.execute();
            sql = "insert into course values ('" + "Mech" + "',"
                    + "'" + "Mechanical" + "')";
            pst = con.prepareStatement(sql);
            pst.execute();
            String adminData = "insert into user values ('" + "admin" + "',"
                    + "'" + "pass" + "')";
            pst = con.prepareStatement(adminData);
            pst.execute();
            con.close();
            JOptionPane.showMessageDialog(this, "Basic Table Data Updated");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Already Updated!!!");
        }
    }

    private void emptyTables() {
        try {
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            sql = "delete from user";
            pst = con.prepareStatement(sql);
            pst.execute();
            sql = "delete from student";
            pst = con.prepareStatement(sql);
            pst.execute();
            sql = "delete from project";
            pst = con.prepareStatement(sql);
            pst.execute();
            sql = "delete from course";
            pst = con.prepareStatement(sql);
            pst.execute();
            con.close();
            JOptionPane.showMessageDialog(this, "Tables data deleted successfully");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Tables contains no data");
        }
    }

    private void dropTables() {
        try {
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            sql = "drop table if exists user";
            pst = con.prepareStatement(sql);
            pst.execute();
            sql = "drop table if exists student";
            pst = con.prepareStatement(sql);
            pst.execute();
            sql = "drop table if exists project";
            pst = con.prepareStatement(sql);
            pst.execute();
            sql = "drop table if exists course";
            pst = con.prepareStatement(sql);
            pst.execute();
            sql = "drop table if exists mark";
            pst = con.prepareStatement(sql);
            pst.execute();
            con.close();
            JOptionPane.showMessageDialog(this, "Tables deleted successfully");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Tables doesn't exist!");

        }
    }

    public void userTableUpdate() {
        DefaultTableModel model = (DefaultTableModel) dataBaseT.getModel();
        model.setRowCount(0);
        model.setColumnCount(0);
        model.addColumn("Username");
        model.addColumn("Password");
        try {
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            sql = "select * from user";
            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2)});
            }
            con.close();
        } catch (SQLException ex) {
            //JOptionPane.showMessageDialog(this, "Error in code");
        }
    }

    public void markTableUpdate() {
        DefaultTableModel model = (DefaultTableModel) dataBaseT.getModel();
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
            con.close();
        } catch (SQLException ex) {
            //Logger.getLogger(dataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void projectTableUpdate() {
        DefaultTableModel model = (DefaultTableModel) dataBaseT.getModel();
        model.setRowCount(0);
        model.setColumnCount(0);
        model.addColumn("Admission No");
        model.addColumn("Student Name");
        model.addColumn("Project Name");
        model.addColumn("Approved");
        model.addColumn("Year");
        try {
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            sql = "select * from project";
            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)});
            }
            con.close();
        } catch (SQLException ex) {
            // Logger.getLogger(dataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void courseTableUpdate() {
        DefaultTableModel model = (DefaultTableModel) dataBaseT.getModel();
        model.setRowCount(0);
        model.setColumnCount(0);
        model.addColumn("Dept");
        model.addColumn("DeptName");
        try {
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            sql = "select * from course";
            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2)});
            }
            con.close();
        } catch (SQLException ex) {
            //Logger.getLogger(dataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void studentTableUpdate() {
        DefaultTableModel model = (DefaultTableModel) dataBaseT.getModel();
        model.setRowCount(0);
        model.setColumnCount(0);
        model.addColumn("Admission No");
        model.addColumn("RollNo");
        model.addColumn("Name");
        model.addColumn("Sex");
        model.addColumn("Department");
        model.addColumn("Semester");
        model.addColumn("DOB");
        model.addColumn("Email");
        model.addColumn("Phone");
        try {
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            sql = "select * from student";
            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4),
                    rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9)});
            }
            con.close();
        } catch (SQLException ex) {
            //Logger.getLogger(dataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeTabe1B;
    private javax.swing.JButton closeTabe2B;
    private javax.swing.JButton courseB;
    private javax.swing.JLabel createTableL;
    private javax.swing.JTable dataBaseT;
    private javax.swing.JLabel dropTableL;
    private javax.swing.JLabel emptyTableL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JButton loginPage2B;
    private javax.swing.JButton loginPageB;
    private javax.swing.JButton markB;
    private javax.swing.JButton projectB;
    private javax.swing.JButton studentB;
    private javax.swing.JLabel updateBasicDataL;
    private javax.swing.JLabel updateSampleDataL;
    private javax.swing.JButton userB;
    // End of variables declaration//GEN-END:variables

}
