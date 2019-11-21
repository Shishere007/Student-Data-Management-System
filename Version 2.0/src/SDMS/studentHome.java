package SDMS;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class studentHome extends javax.swing.JFrame {

    public static final String JDBC_DRIVER = "org.h2.Driver";
    public static final String DB_URL = "jdbc:h2:~/SDMS";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "";
    private Connection con;
    private PreparedStatement pst;
    private String sql;
    private String sem;
    String adno;

    public studentHome() {
        initComponents();
        adno = "1234";
        startup();
    }

    public studentHome(String user) {
        initComponents();
        this.adno = user;
        startup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderBG = new javax.swing.ButtonGroup();
        jTextField5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        exitB = new javax.swing.JButton();
        loginPageB = new javax.swing.JButton();
        changePasswordB = new javax.swing.JButton();
        tabbedPane = new javax.swing.JTabbedPane();
        personalDetailsP = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        adnoTF = new javax.swing.JTextField();
        nameTF = new javax.swing.JTextField();
        deptTF = new javax.swing.JTextField();
        mailTF = new javax.swing.JTextField();
        rnoTF = new javax.swing.JTextField();
        phoneTF = new javax.swing.JTextField();
        dobTF = new javax.swing.JTextField();
        semTF = new javax.swing.JTextField();
        maleRB = new javax.swing.JRadioButton();
        femaleRB = new javax.swing.JRadioButton();
        markListP = new javax.swing.JPanel();
        semCB = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        sub1TF = new javax.swing.JTextField();
        sub2TF = new javax.swing.JTextField();
        sub3TF = new javax.swing.JTextField();
        sub4TF = new javax.swing.JTextField();
        sub5TF = new javax.swing.JTextField();
        cgpaTF = new javax.swing.JTextField();
        lab1TF = new javax.swing.JTextField();
        sub6TF = new javax.swing.JTextField();
        lab2TF = new javax.swing.JTextField();
        downloadB = new javax.swing.JButton();
        projectDetailsP = new javax.swing.JPanel();
        projectWarningL = new javax.swing.JLabel();
        projectRejectedL = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        projectNameTF = new javax.swing.JTextField();
        updateB = new javax.swing.JButton();
        approveP = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        approvedCB = new javax.swing.JCheckBox();
        showProjectTableL = new javax.swing.JLabel();
        projectListTableP = new javax.swing.JScrollPane();
        projectListT = new javax.swing.JTable();

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Admission Number :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Name :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Date of Birth :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Roll Number :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Gender :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Department :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Semester :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Email ID :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Phone Number :");

        adnoTF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        nameTF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        deptTF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        mailTF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        rnoTF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        phoneTF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        dobTF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        dobTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobTFActionPerformed(evt);
            }
        });

        semTF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        genderBG.add(maleRB);
        maleRB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        maleRB.setText("Male");

        genderBG.add(femaleRB);
        femaleRB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        femaleRB.setText("Female");

        javax.swing.GroupLayout personalDetailsPLayout = new javax.swing.GroupLayout(personalDetailsP);
        personalDetailsP.setLayout(personalDetailsPLayout);
        personalDetailsPLayout.setHorizontalGroup(
            personalDetailsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalDetailsPLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(personalDetailsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(personalDetailsPLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(personalDetailsPLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deptTF, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(personalDetailsPLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(personalDetailsPLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, personalDetailsPLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(maleRB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(femaleRB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(personalDetailsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(semTF, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobTF, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phoneTF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        personalDetailsPLayout.setVerticalGroup(
            personalDetailsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(personalDetailsPLayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(personalDetailsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(personalDetailsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personalDetailsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(rnoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(personalDetailsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(personalDetailsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personalDetailsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(dobTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(personalDetailsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(maleRB)
                        .addComponent(femaleRB)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(personalDetailsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personalDetailsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(deptTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(personalDetailsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(semTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(personalDetailsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(personalDetailsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(mailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(personalDetailsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(phoneTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Personal Details", personalDetailsP);

        semCB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        semCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semCBActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("Subject 1 :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Subject 2 :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Subject 3 :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Subject 4 :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Lab 1 :");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Lab 2 :");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Subject 5 :");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Subject 6 :");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setText("CGPA :");

        sub1TF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        sub2TF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        sub3TF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        sub4TF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        sub5TF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        cgpaTF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        lab1TF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        lab1TF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lab1TFActionPerformed(evt);
            }
        });

        sub6TF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        lab2TF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        downloadB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        downloadB.setText("Download");
        downloadB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout markListPLayout = new javax.swing.GroupLayout(markListP);
        markListP.setLayout(markListPLayout);
        markListPLayout.setHorizontalGroup(
            markListPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(markListPLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(markListPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(markListPLayout.createSequentialGroup()
                        .addGroup(markListPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addGroup(markListPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(26, 26, 26)
                        .addGroup(markListPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(markListPLayout.createSequentialGroup()
                                .addGroup(markListPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sub5TF, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cgpaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lab1TF, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(104, 104, 104)
                                .addGroup(markListPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(markListPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sub6TF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lab2TF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(markListPLayout.createSequentialGroup()
                                .addGroup(markListPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(markListPLayout.createSequentialGroup()
                                        .addComponent(sub3TF, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel13))
                                    .addGroup(markListPLayout.createSequentialGroup()
                                        .addComponent(sub1TF, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(104, 104, 104)
                                        .addComponent(jLabel11)))
                                .addGap(33, 33, 33)
                                .addGroup(markListPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sub2TF, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sub4TF, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(59, Short.MAX_VALUE))
                    .addGroup(markListPLayout.createSequentialGroup()
                        .addComponent(semCB, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(downloadB)
                        .addGap(51, 51, 51))))
        );
        markListPLayout.setVerticalGroup(
            markListPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(markListPLayout.createSequentialGroup()
                .addGroup(markListPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(markListPLayout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(semCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(markListPLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(downloadB)))
                .addGap(28, 28, 28)
                .addGroup(markListPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub2TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(markListPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub3TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub4TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(markListPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub5TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sub6TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(markListPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lab1TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lab2TF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(markListPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cgpaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(122, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Mark List", markListP);

        projectWarningL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        projectWarningL.setForeground(new java.awt.Color(255, 51, 51));
        projectWarningL.setText("You Haven't updated your project Topic");

        projectRejectedL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        projectRejectedL.setForeground(new java.awt.Color(255, 51, 51));
        projectRejectedL.setText("Your Project has been rejected");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setText("Project Name :");

        projectNameTF.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        updateB.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        updateB.setText("Update");
        updateB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setText("Approved");

        javax.swing.GroupLayout approvePLayout = new javax.swing.GroupLayout(approveP);
        approveP.setLayout(approvePLayout);
        approvePLayout.setHorizontalGroup(
            approvePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(approvePLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(approvedCB)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        approvePLayout.setVerticalGroup(
            approvePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(approvePLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(approvePLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(approvedCB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        showProjectTableL.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        showProjectTableL.setText("► Show Alreday submitted Projects");
        showProjectTableL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showProjectTableL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showProjectTableLMousePressed(evt);
            }
        });

        projectListT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        projectListTableP.setViewportView(projectListT);

        javax.swing.GroupLayout projectDetailsPLayout = new javax.swing.GroupLayout(projectDetailsP);
        projectDetailsP.setLayout(projectDetailsPLayout);
        projectDetailsPLayout.setHorizontalGroup(
            projectDetailsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projectDetailsPLayout.createSequentialGroup()
                .addGroup(projectDetailsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(projectDetailsPLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(projectDetailsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(projectNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateB))
                        .addGap(64, 64, 64)
                        .addComponent(approveP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(projectDetailsPLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(showProjectTableL))
                    .addGroup(projectDetailsPLayout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(projectWarningL))
                    .addGroup(projectDetailsPLayout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(projectRejectedL)))
                .addContainerGap(124, Short.MAX_VALUE))
            .addComponent(projectListTableP)
        );
        projectDetailsPLayout.setVerticalGroup(
            projectDetailsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projectDetailsPLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(projectWarningL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(projectRejectedL)
                .addGap(18, 18, 18)
                .addGroup(projectDetailsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(projectDetailsPLayout.createSequentialGroup()
                        .addGroup(projectDetailsPLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(projectNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(updateB))
                    .addComponent(approveP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(showProjectTableL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(projectListTableP, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Project Details", projectDetailsP);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(loginPageB, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(changePasswordB)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(exitB, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPane)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(exitB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loginPageB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(changePasswordB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabbedPane))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        changePassword newpage = new changePassword(adno);
        newpage.setVisible(true);
    }//GEN-LAST:event_changePasswordBActionPerformed

    private void changePasswordBKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_changePasswordBKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_changePasswordBKeyPressed

    private void dobTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobTFActionPerformed

    private void semCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semCBActionPerformed
        insertMark();
        if (sub1TF.getText().equals("")) {
            downloadB.setVisible(false);
        } else {
            downloadB.setVisible(true);
        }
    }//GEN-LAST:event_semCBActionPerformed

    private void lab1TFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lab1TFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lab1TFActionPerformed

    private void showProjectTableLMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showProjectTableLMousePressed
        showProjectTableL.setVisible(false);
        projectListUpdate();
        projectListTableP.setVisible(true);
    }//GEN-LAST:event_showProjectTableLMousePressed

    private void updateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBActionPerformed
        updateProject();
    }//GEN-LAST:event_updateBActionPerformed

    private void downloadBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_downloadBActionPerformed
        downloadMarkList();
    }//GEN-LAST:event_downloadBActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new studentHome().setVisible(true);
        });
    }

    private void startup() {
        insertData();
        insertSem();
        downloadB.setVisible(false);
        disableEditorStudentDetailsPanel();
        projectDetailsPanelUpdate();
        projectListTableP.setVisible(false);

    }

    private void downloadMarkList() {
        printStudentMark newpage = new printStudentMark(adno, semCB.getSelectedItem().toString());
        newpage.setVisible(true);
    }

    private void exitprogram() {
        int YesNo;
        YesNo = JOptionPane.showConfirmDialog(this, "Are you sure?", "Exit Program", JOptionPane.YES_NO_OPTION);
        if (YesNo == 0) {
            System.exit(0);
        }
    }

    private void insertData() {
        try {
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            sql = "select * from student where adno=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, adno);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                adnoTF.setText(String.valueOf(rs.getString(1)));
                rnoTF.setText(String.valueOf(rs.getInt(2)));
                nameTF.setText(rs.getString(3));
                if (rs.getString(4).equals("Male")) {
                    maleRB.setSelected(true);

                } else {
                    femaleRB.setSelected(true);
                }
                deptTF.setText(String.valueOf((rs.getString(5))));
                semTF.setText(String.valueOf(rs.getInt(6)));
                sem = String.valueOf(rs.getInt(6));
                dobTF.setText(String.valueOf(rs.getDate(7)));
                mailTF.setText(rs.getString(8));
                phoneTF.setText(rs.getString(9));
            }
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private void disableEditorStudentDetailsPanel() // make text field non editable
    {
        dobTF.setEditable(false);
        adnoTF.setEditable(false);
        semTF.setEditable(false);
        phoneTF.setEditable(false);
        nameTF.setEditable(false);
        deptTF.setEditable(false);
        mailTF.setEditable(false);
        rnoTF.setEditable(false);
        maleRB.setEnabled(false);
        femaleRB.setEnabled(false);

    }

    private void disableEditorStudentMarkPanel() {
        sub1TF.setEditable(false);
        sub2TF.setEditable(false);
        sub3TF.setEditable(false);
        sub4TF.setEditable(false);
        sub5TF.setEditable(false);
        sub6TF.setEditable(false);
        lab1TF.setEditable(false);
        lab2TF.setEditable(false);
        cgpaTF.setEditable(false);
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

    private void insertMark() {
        clearField();
        try {
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            sql = "select * from mark where adno=? and sem = ?";
            pst = con.prepareStatement(sql);
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
            }
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
        disableEditorStudentMarkPanel();
    }

    private void insertSem() {
        try {
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            sql = "select sem from student where adno=?";
            pst = con.prepareStatement(sql);
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
        semCB.setSelectedIndex(-1);
    }

    private void projectDetailsPanelUpdate() {
        projectRejectedL.setVisible(false);
        approveP.setVisible(true);
        try {
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            sql = "select approved,pname from project where adno=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, adno);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                projectNameTF.setText(rs.getString(2));
                projectWarningL.setVisible(false);
                if (rs.getString(1).equals("yes") || rs.getString(1).equals("Yes")) {
                    approvedCB.setSelected(true);
                    updateB.setVisible(false);
                    approvedCB.setEnabled(false);
                    projectNameTF.setEditable(false);
                } else if (rs.getString(1).equals("yes") || rs.getString(1).equals("RJT")) {
                    projectRejectedL.setVisible(true);
                    approveP.setVisible(false);
                } else if (rs.getString(1).equals("")) {
                    projectWarningL.setVisible(true);
                    approveP.setVisible(false);
                } else {
                    approvedCB.setEnabled(false);
                }
            } else {
                approveP.setVisible(false);
            }
            con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private void projectListUpdate() {
        DefaultTableModel projectList = (DefaultTableModel) projectListT.getModel();
        projectList.setRowCount(0);
        projectList.setColumnCount(0);
        projectList.addColumn("Admission Number");
        projectList.addColumn("Student Name");
        projectList.addColumn("Project Name");
        projectList.addColumn("Approval");
        projectList.setRowCount(0);
        try {
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            sql = "select * from project";
            pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                projectList.addRow(new Object[]{rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4)});
            }
            con.close();
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    private void updateProject() {
        try {
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            sql = "select * from project where adno=?";
            pst = con.prepareStatement(sql);
            pst.setString(1, adno);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                sql = "delete from project where adno=?";
                pst = con.prepareStatement(sql);
                pst.setString(1, adno);
                pst.executeUpdate();
            }
            sql = "insert into project(adno,sname,pname) values(?,?,?)";
            pst = con.prepareStatement(sql);
            pst.setString(1, adnoTF.getText());
            pst.setString(2, nameTF.getText());
            pst.setString(3, projectNameTF.getText());
            pst.executeUpdate();
            con.close();
            JOptionPane.showMessageDialog(this, "Successful");
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(this, e);
        }
        projectListUpdate();
        projectDetailsPanelUpdate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField adnoTF;
    private javax.swing.JPanel approveP;
    private javax.swing.JCheckBox approvedCB;
    private javax.swing.JTextField cgpaTF;
    private javax.swing.JButton changePasswordB;
    private javax.swing.JTextField deptTF;
    private javax.swing.JTextField dobTF;
    private javax.swing.JButton downloadB;
    private javax.swing.JButton exitB;
    private javax.swing.JRadioButton femaleRB;
    private javax.swing.ButtonGroup genderBG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField lab1TF;
    private javax.swing.JTextField lab2TF;
    private javax.swing.JButton loginPageB;
    private javax.swing.JTextField mailTF;
    private javax.swing.JRadioButton maleRB;
    private javax.swing.JPanel markListP;
    private javax.swing.JTextField nameTF;
    private javax.swing.JPanel personalDetailsP;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JPanel projectDetailsP;
    private javax.swing.JTable projectListT;
    private javax.swing.JScrollPane projectListTableP;
    private javax.swing.JTextField projectNameTF;
    private javax.swing.JLabel projectRejectedL;
    private javax.swing.JLabel projectWarningL;
    private javax.swing.JTextField rnoTF;
    private javax.swing.JComboBox<String> semCB;
    private javax.swing.JTextField semTF;
    private javax.swing.JLabel showProjectTableL;
    private javax.swing.JTextField sub1TF;
    private javax.swing.JTextField sub2TF;
    private javax.swing.JTextField sub3TF;
    private javax.swing.JTextField sub4TF;
    private javax.swing.JTextField sub5TF;
    private javax.swing.JTextField sub6TF;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JButton updateB;
    // End of variables declaration//GEN-END:variables
}
