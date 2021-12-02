package RandJLawFirm;

import static RandJLawFirm.FileChooser.getMediaDirectory;
import java.io.File;
import java.io.FileInputStream;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import static java.nio.file.StandardCopyOption.*;
import java.util.Properties;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//import static jdk.nashorn.internal.objects.NativeRegExp.source;
import java.awt.Desktop;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SearchCase extends javax.swing.JFrame {

    /**
     * Creates new form AddTransaction
     */
    public SearchCase() throws FileNotFoundException {
        initComponents();
        Transaction.ReadTranInformations();
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
        Interface = new javax.swing.JLabel();
        Search = new javax.swing.JButton();
        back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        caseNum.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        caseNum.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        caseNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                caseNumActionPerformed(evt);
            }
        });
        getContentPane().add(caseNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 450, 60));

        Interface.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Interfaces/SearchCase.png"))); // NOI18N
        getContentPane().add(Interface, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 700));

        Search.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });
        getContentPane().add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 600, 240, 50));

        back.setText("jLabel1");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 40, 60, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void caseNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_caseNumActionPerformed

    }//GEN-LAST:event_caseNumActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        int caseIndex = Transaction.SearchTransaction(caseNum.getText());
        if (caseIndex == -1) {
            JOptionPane.showMessageDialog(null, 
                    "Case Number That You Entered Is Not Exist!", "Not Found", JOptionPane.ERROR_MESSAGE);
        } else {
            new ViewCaseDetails().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_SearchActionPerformed

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
         new HomePage().setVisible(true);
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
            java.util.logging.Logger.getLogger(SearchCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchCase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new SearchCase().setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(SearchCase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Interface;
    private javax.swing.JButton Search;
    private javax.swing.JLabel back;
    private javax.swing.JTextField caseNum;
    // End of variables declaration//GEN-END:variables
}
