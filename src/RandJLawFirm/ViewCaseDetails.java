/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RandJLawFirm;

import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ViewCaseDetails extends javax.swing.JFrame {

    File CaseFile;

    public ViewCaseDetails() {
        initComponents();
        caseNum.setText(Transaction.getTransactions().get(Transaction.getFoundCaseIndex()).getCaseNumber());
        caseTitle1.setText(Transaction.getTransactions().get(Transaction.getFoundCaseIndex()).getCaseTitle());
        CaseFile = new File(Transaction.getTransactions().get(Transaction.getFoundCaseIndex()).getCaseDoc());
        caseTitle.setText(CaseFile.getName());
        Status.setText(Transaction.getTransactions().get(Transaction.getFoundCaseIndex()).getStatus());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        caseNum = new javax.swing.JTextField();
        Status = new javax.swing.JTextField();
        caseTitle = new javax.swing.JTextField();
        caseTitle1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        OpenFile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(965, 740));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        caseNum.setEditable(false);
        caseNum.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(caseNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 256, 250, 50));

        Status.setEditable(false);
        Status.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 250, 50));

        caseTitle.setEditable(false);
        caseTitle.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        caseTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caseTitleActionPerformed(evt);
            }
        });
        getContentPane().add(caseTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 250, 50));

        caseTitle1.setEditable(false);
        caseTitle1.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        getContentPane().add(caseTitle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 250, 60));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/viewCase.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, -1));

        OpenFile.setBackground(new java.awt.Color(204, 204, 204));
        OpenFile.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        OpenFile.setText("Open File");
        OpenFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenFileActionPerformed(evt);
            }
        });
        getContentPane().add(OpenFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 140, 40));

        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, 50));

        back.setText("jLabel2");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpenFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenFileActionPerformed

        Desktop desktop = Desktop.getDesktop();
        try {
            desktop.open(CaseFile);
        } catch (IOException ex) {
        }
        
    }//GEN-LAST:event_OpenFileActionPerformed

    private void caseTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caseTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_caseTitleActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        try {
            new SearchCase().setVisible(true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ViewCaseDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

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
            java.util.logging.Logger.getLogger(ViewCaseDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewCaseDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewCaseDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewCaseDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewCaseDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton OpenFile;
    private javax.swing.JTextField Status;
    private javax.swing.JLabel back;
    private javax.swing.JTextField caseNum;
    private javax.swing.JTextField caseTitle;
    private javax.swing.JTextField caseTitle1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
