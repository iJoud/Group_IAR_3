/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandJLawFirm;

/**
 *
 * @author iijoo
 */
public class FirstWindow extends javax.swing.JFrame {

    /**
     * Creates new form FirstWindow
     */
    public FirstWindow() {
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

        Interface = new javax.swing.JLabel();
        SignUp = new javax.swing.JButton();
        LogIn1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(970, 760));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Interface.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/First Window.png"))); // NOI18N
        Interface.setText("jLabel1");
        Interface.setPreferredSize(new java.awt.Dimension(950, 700));
        getContentPane().add(Interface, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        SignUp.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SignUp.setText("Sign Up");
        SignUp.setActionCommand("Sign In");
        SignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SignUpActionPerformed(evt);
            }
        });
        getContentPane().add(SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, 360, 70));

        LogIn1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        LogIn1.setText("Log In");
        LogIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogIn1ActionPerformed(evt);
            }
        });
        getContentPane().add(LogIn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 370, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SignUpActionPerformed
        this.dispose();
        new SignUp().setVisible(true);


    }//GEN-LAST:event_SignUpActionPerformed

    private void LogIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogIn1ActionPerformed

        this.dispose();
        new LogIn().setVisible(true);

    }//GEN-LAST:event_LogIn1ActionPerformed

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
            java.util.logging.Logger.getLogger(FirstWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FirstWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FirstWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FirstWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FirstWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Interface;
    private javax.swing.JButton LogIn1;
    private javax.swing.JButton SignUp;
    // End of variables declaration//GEN-END:variables
}
