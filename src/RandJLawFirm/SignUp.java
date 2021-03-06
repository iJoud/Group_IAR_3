package RandJLawFirm;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SignUp extends javax.swing.JFrame {

    public SignUp() {
        Employee.AllEmployees();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        forPass = new javax.swing.JPasswordField();
        forConfirmPass = new javax.swing.JPasswordField();
        forEmail = new javax.swing.JTextField();
        forID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Interface = new javax.swing.JLabel();
        SignUp = new javax.swing.JButton();
        back = new javax.swing.JLabel();

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel11.setText("Password:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(970, 760));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        forPass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        forPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forPassActionPerformed(evt);
            }
        });
        getContentPane().add(forPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 318, 312, 49));

        forConfirmPass.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(forConfirmPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 408, 312, 49));

        forEmail.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        forEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forEmailActionPerformed(evt);
            }
        });
        getContentPane().add(forEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 499, 312, 49));

        forID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        forID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forIDActionPerformed(evt);
            }
        });
        getContentPane().add(forID, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 226, 312, 49));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(27, 56, 65));
        jLabel1.setText("* Should Contain At least 1 Digit, 1 Letter");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 345, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(27, 56, 65));
        jLabel2.setText("* Should be At least 8 Characters ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 325, -1, -1));

        Interface.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/SignUp.png"))); // NOI18N
        Interface.setText("jLabel1");
        getContentPane().add(Interface, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 700));

        SignUp.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        SignUp.setText("Sign Up");
        SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpActionPerformed(evt);
            }
        });
        getContentPane().add(SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 584, 330, 60));

        back.setText("jLabel2");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void forEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forEmailActionPerformed

    private void forPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forPassActionPerformed

    private void forIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forIDActionPerformed

    private void SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpActionPerformed

        // read what user enters
        String UserID, Password, confirm_Password, email;
        UserID = forID.getText();
        Password = forPass.getText();
        confirm_Password = forConfirmPass.getText();
        email = forEmail.getText();
        Boolean isEmployee = Employee.isEmployeeID(UserID);
        try {
            // check what user enter
            if (UserID.isEmpty() || Password.isEmpty() || confirm_Password.isEmpty() || email.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please fill all the feilds ");
            } else if (!isEmployee) {// Check if Entered Id Exist in Employees Data
                JOptionPane.showMessageDialog(null, "Invalid ID, No Employee ID Match The ID You Entered");
            } else {
                // check password
                if (!Password.equals(confirm_Password)) {
                    JOptionPane.showMessageDialog(null, "The password doesn't match the confirm passweord");
                } else if (!User.isStrongPassword(Password)) {
                    JOptionPane.showMessageDialog(null, "Invalid Password, It is Weak Password");

                } // check email
                else if (!User.isValidEmail(email)) {
                    JOptionPane.showMessageDialog(null, "The email is not correct");
                } else { // else if all entered data is correct 
                    // create an object for the user to register
                    User newUser = new User(UserID, Password, email);
                    // read all informations of application users from the User File
                    User.ReadInformations();
                    // check if the ID already Registered
                    if (newUser.isIDExist(UserID) == true) {
                        JOptionPane.showMessageDialog(null, "The ID is already Registered");
                    } else { // successfully registered, add to User File
                        newUser.RegisterUser(newUser);
                        JOptionPane.showMessageDialog(null, "Registration Completed Successfully");
                        this.dispose();
                        new HomePage().setVisible(true);

                    }
                }
            }

        } catch (Exception ex) {

        }


    }//GEN-LAST:event_SignUpActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked

        new FirstWindow().setVisible(true);
        this.dispose();

    }//GEN-LAST:event_backMouseClicked

    public static void CheckID() {

    }

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Interface;
    private javax.swing.JButton SignUp;
    private javax.swing.JLabel back;
    private javax.swing.JPasswordField forConfirmPass;
    private javax.swing.JTextField forEmail;
    private javax.swing.JTextField forID;
    private javax.swing.JPasswordField forPass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
