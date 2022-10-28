/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package secondAssignment.system.ui;

import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import secondAssignment.system.model.login.Credentials;
import secondAssignment.system.model.login.LoginList;
import secondAssignment.system.person.City;
import secondAssignment.system.person.DoctorDirectory;
import secondAssignment.system.person.PatientDirectory;
import secondAssignment.system.ui.Doctor.Doctor;
import secondAssignment.system.ui.community.CommintyAdmin;
import secondAssignment.system.ui.hospital.HospitalAdmin;
import secondAssignment.system.ui.patient.Patient;

/**
 *
 * @author devshahofficial
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    LoginList lgnList;
    PatientDirectory patientList;
    City city;
    DoctorDirectory doctorList;

    public Login(LoginList lgnList, PatientDirectory patientList, City city, DoctorDirectory doctorList) {
        initComponents();
        this.lgnList = lgnList;
        this.city = city;
        this.patientList = patientList;
        this.doctorList = doctorList;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        password = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        pwdPassword = new javax.swing.JPasswordField();
        btnLogin = new javax.swing.JButton();
        btnClose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        password.setText("Password");

        username.setText("UserName");

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnClose.setText("Close");
        btnClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCloseActionPerformed(evt);
            }
        });

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(pwdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btnLogin)
                        .addGap(95, 95, 95)
                        .addComponent(btnClose)))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(pwdPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin)
                    .addComponent(btnClose))
                .addContainerGap(139, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCloseActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to close application", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }

    }//GEN-LAST:event_btnCloseActionPerformed
    public static boolean loginPageclientSideValidation(javax.swing.JFrame frame, String userName, String passWord) {
        if (Pattern.compile("^[a-zA-Z\\s]*$").matcher(userName).matches() && !userName.equals("")) {
            System.out.println("User name is valid.");
            if ( //Pattern.compile("^[a-zA-Z\\s]*$").matcher(passWord).matches() && 
                    !passWord.equals("")) {
                System.out.println("Password is valid.");
                return true;
            } else {
                JOptionPane.showMessageDialog(frame, "Password field is empty", "Alert", JOptionPane.WARNING_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(frame, "User Name is not valid. Only characters and spaces are allowed.", "Alert", JOptionPane.WARNING_MESSAGE);
        }
        return false;
    }
    
    
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        String userName = txtUserName.getText();
        String passWord = pwdPassword.getText();
        boolean passed = loginPageclientSideValidation(this, userName, passWord);

        ArrayList<Credentials> emp = new ArrayList<Credentials>();
        if (passed) {
            for (Credentials cred : lgnList.getLoginList()) {
                //for (int i = 0; i < lgnList.getLoginList().size(); i++) {
                String userNm = (cred.getUserName());
                String pwd = (cred.getPassWord());
                System.out.println(pwd);

                String role = (cred.getRole());
                emp.add(cred);
                System.out.println(emp.toString());

                if (userName.equals(userNm) && passWord.equals(pwd) && role.contains("doctor")) {
                    setVisible(false);
                    System.out.println(userNm);
                    new Doctor(lgnList, patientList, city, doctorList).setVisible(true);

                } else if (userName.equals(userNm) && passWord.equals(pwd) && role.contains("patient")) {
                    setVisible(false);
                    System.out.println(userNm);
                    new Patient(lgnList, patientList, city, doctorList).setVisible(true);

                } else if (userName.equals(userNm) && passWord.equals(pwd) && role.contains("hospital admin")) {
                    setVisible(false);
                    new HospitalAdmin(lgnList, patientList, city, doctorList).setVisible(true);

                } else if (userName.equals(userNm) && passWord.equals(pwd) && role.contains("community admin")) {
                    setVisible(false);
                    new CommintyAdmin(lgnList, patientList, city, doctorList).setVisible(true);

                } else if (userName.equals(userNm) && passWord.equals(pwd) && role.contains("admin")) {
                    setVisible(false);
                    System.out.println(userNm);
                    new Home(lgnList).setVisible(true);
                }
                else{
                    JOptionPane.showMessageDialog(null, "User doesn't exist. Please create a new user", "Alert", JOptionPane.WARNING_MESSAGE);
                }
            }
        }

    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    //    public static void main(String args[]) {
    //        /* Set the Nimbus look and feel */
    //        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
    //        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
    //         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
    //         */
    //        try {
    //            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
    //                if ("Nimbus".equals(info.getName())) {
    //                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
    //                    break;
    //                }
    //            }
    //        } catch (ClassNotFoundException ex) {
    //            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        } catch (InstantiationException ex) {
    //            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        } catch (IllegalAccessException ex) {
    //            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
    //            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    //        }
    //        //</editor-fold>
    //
    //        /* Create and display the form */
    //        java.awt.EventQueue.invokeLater(new Runnable() {
    //            public void run() {
    //                
    //                new Login().setVisible(true);
    //            }
    //        });
    //    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField pwdPassword;
    private javax.swing.JTextField txtUserName;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}