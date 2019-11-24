package SDMS;

import java.awt.print.PrinterException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class printStudentMark extends javax.swing.JFrame {

    public static final String JDBC_DRIVER = "org.h2.Driver";
    public static final String DB_URL = "jdbc:h2:~/SDMS";
    public static final String DB_USERNAME = "root";
    public static final String DB_PASSWORD = "";
    private Connection con = null;
    private PreparedStatement pst = null;
    private String sql = null;
    private String adno;
    private String sem;

    public printStudentMark() {
        initComponents();
        adno = "2345";
        sem = "1";
        startup();
    }

    public printStudentMark(String str, String str2) {
        initComponents();
        this.adno = str;
        this.sem = str2;
        startup();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        formTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Print");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Close");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        formTA.setColumns(20);
        formTA.setRows(5);
        jScrollPane2.setViewportView(formTA);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(31, 31, 31))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        try {
            formTA.print();
        } catch (PrinterException ex) {
            Logger.getLogger(printStudentMark.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(printStudentMark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new printStudentMark().setVisible(true);
        });
    }

    private void startup() {
        formUpdate();
        formTA.setEditable(false);
    }

    private void formUpdate() {
        formTA.setTabSize(5);
        formTA.setText("\t\t   College of Engineering Perumon\n");
        formTA.append("\t\t\t   Student Mark List\n\n");
        formTA.append("Admission Number :" + adno + "\n");

        try {
            con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            sql = "select name,dept from student where adno = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, adno);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                formTA.append("Name : " + rs.getString(1) + "\tDepartment : " + rs.getString(2) + "\tSemester :" + sem + "\n");
            }
            formTA.append("\n\tSubject\t\t\t\t\tMark");
            sql = "select * from mark where adno = ? and sem = ?";
            pst = con.prepareStatement(sql);
            pst.setString(1, adno);
            pst.setString(2, sem);
            rs = pst.executeQuery();
            if (rs.next()) {
                formTA.append("\n\n\tSubject 1 \t\t:\t\t" + rs.getString(3));
                formTA.append("\n\n\tSubject 2 \t\t:\t\t" + rs.getString(4));
                formTA.append("\n\n\tSubject 3 \t\t:\t\t" + rs.getString(5));
                formTA.append("\n\n\tSubject 4 \t\t:\t\t" + rs.getString(6));
                formTA.append("\n\n\tSubject 5 \t\t:\t\t" + rs.getString(7));
                formTA.append("\n\n\tSubject 6 \t\t:\t\t" + rs.getString(8));
                formTA.append("\n\n\tLab 1 \t\t\t:\t\t" + rs.getString(9));
                formTA.append("\n\n\tLab 2 \t\t\t:\t\t" + rs.getString(10));
                formTA.append("\n\n\tCGPA \t\t\t:\t\t" + rs.getString(11));
            }
        } catch (SQLException ex) {
            Logger.getLogger(printStudentMark.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JTextArea formTA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
