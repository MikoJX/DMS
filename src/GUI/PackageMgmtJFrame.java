/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//PACKAGE MANAGEMENT COMPLETE
package GUI;
import Classes.Package;
import Files.PackageFileIO;
import javax.swing.JOptionPane;
/**
 *
 * @author Miko
 */
public class PackageMgmtJFrame extends javax.swing.JFrame {
    PackageFileIO packObj = new PackageFileIO();
    
    double rate;
    String title;
    int pNo,max,min;
    
    private void autoGenerator(){
        String newPno,listPno;
        
        packObj.retrieveData();
        if(packObj.packV.size()==0){
            this.txtPackageNo.setText("111");
        }
        else {
           newPno=Integer.toString((packObj.packV.lastElement().getpackageNo())+1);
           this.txtPackageNo.setText(newPno.toString());

           int size = this.cboxPackageNo.getItemCount();
           //Remove ComboBox Item
           if (size>1) {
                for (int i = 1; i < size; i++) { 
                this.cboxPackageNo.removeItemAt(1);
                }
            }
           //Add ComboBox Item   
           for (int i = 0; i < packObj.packV.size(); i++) {
                listPno=Integer.toString(packObj.packV.elementAt(i).getpackageNo());
                this.cboxPackageNo.addItem(listPno);
            }
        }
    }
    
    private void clearField(){
        this.txtMax.setText("");
        this.txtMax2.setText("");
        this.txtMin.setText("");
        this.txtMin2.setText("");
        this.txtPackageTitle.setText("");
        this.txtPackageTitle2.setText("");
        this.txtRate.setText("");
        this.txtRate2.setText("");              
    }
    /**
     * Creates new form PackageMgmtJFrame
     */
    public PackageMgmtJFrame() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblOrderHeader = new javax.swing.JLabel();
        txtPackageTitle = new javax.swing.JTextField();
        txtMin = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMax = new javax.swing.JTextField();
        txtRate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtPackageNo = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        lblOrderHeader1 = new javax.swing.JLabel();
        btnSave2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtPackageTitle2 = new javax.swing.JTextField();
        txtMin2 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtMax2 = new javax.swing.JTextField();
        txtRate2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        cboxPackageNo = new javax.swing.JComboBox();
        lblCustomerHeader3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblOrderHeader.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblOrderHeader.setText("Add New Package");

        txtPackageTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPackageTitleActionPerformed(evt);
            }
        });

        jLabel8.setText("Min Amount : ");

        jLabel7.setText("Package Title :");

        jLabel9.setText("Max Amount : ");

        jLabel10.setText("Rate : ");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel13.setText("/100 gram");

        jLabel11.setText("Package No :");

        txtPackageNo.setEditable(false);
        txtPackageNo.setEnabled(false);
        txtPackageNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPackageNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblOrderHeader)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel7))
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPackageTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPackageNo, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtRate, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(btnSave)
                                            .addComponent(jLabel13)))))
                            .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addGap(65, 65, 65)
                                .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(278, 278, 278))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblOrderHeader)
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPackageNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtPackageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13))
                .addGap(127, 127, 127)
                .addComponent(btnSave)
                .addGap(48, 48, 48))
        );

        jTabbedPane1.addTab("Add New Package", jPanel1);

        lblOrderHeader1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblOrderHeader1.setText("Edit Package Record");

        btnSave2.setText("Save");
        btnSave2.setEnabled(false);
        btnSave2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSave2ActionPerformed(evt);
            }
        });

        jLabel14.setText("Package No :");

        jLabel17.setText("Package Title :");

        txtPackageTitle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPackageTitle2ActionPerformed(evt);
            }
        });

        jLabel18.setText("Min Amount : ");

        jLabel19.setText("Max Amount : ");

        jLabel20.setText("Rate : ");

        jLabel30.setText("/100 gram");

        cboxPackageNo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));
        cboxPackageNo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cboxPackageNoItemStateChanged(evt);
            }
        });
        cboxPackageNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxPackageNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel14)
                            .addComponent(jLabel17))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cboxPackageNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPackageTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtMin2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMax2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtRate2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnSave2)
                                    .addComponent(jLabel30))
                                .addGap(34, 34, 34)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblOrderHeader1)
                        .addGap(0, 410, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblOrderHeader1)
                .addGap(46, 46, 46)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cboxPackageNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtPackageTitle2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtMin2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(txtMax2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(jLabel30))
                .addGap(130, 130, 130)
                .addComponent(btnSave2)
                .addGap(43, 43, 43))
        );

        jTabbedPane1.addTab("Edit Package Record", jPanel2);

        lblCustomerHeader3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblCustomerHeader3.setText("Delivery Management System(DMS)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblCustomerHeader3)
                        .addGap(161, 161, 161)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCustomerHeader3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPackageTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPackageTitleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPackageTitleActionPerformed

    private void txtPackageTitle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPackageTitle2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPackageTitle2ActionPerformed

    private void txtPackageNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPackageNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPackageNoActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            title = this.txtPackageTitle.getText();
            pNo=Integer.parseInt(this.txtPackageNo.getText());
            max=Integer.parseInt(this.txtMax.getText());
            min=Integer.parseInt(this.txtMin.getText());
            rate=Double.parseDouble(this.txtRate.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid Input", "Error",
                    JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Package packs = new Package(rate, title,pNo, max, min);
        packObj.add(packs);
        JOptionPane.showMessageDialog(this, "Package Successful Added!", "Information",JOptionPane.INFORMATION_MESSAGE);
        autoGenerator();
        clearField();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void cboxPackageNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxPackageNoActionPerformed

    }//GEN-LAST:event_cboxPackageNoActionPerformed

    private void btnSave2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSave2ActionPerformed
        try {
            title = this.txtPackageTitle2.getText();
            pNo=Integer.parseInt(this.cboxPackageNo.getSelectedItem().toString());
            max=Integer.parseInt(this.txtMax2.getText());
            min=Integer.parseInt(this.txtMin2.getText());
            rate=Double.parseDouble(this.txtRate2.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid Input", "Error",JOptionPane.ERROR_MESSAGE);
            return;
        }

        Package packs = new Package(rate, title,pNo, max, min);
        packObj.edit(packs);
        //packObj.FileIOObj.RetrievePackage();
        //System.out.println(packObj.FileIOObj.packV.elementAt(0).getPackageNo());
        JOptionPane.showMessageDialog(this, "Package Record Successful Edited!", "Information",JOptionPane.INFORMATION_MESSAGE);
        
        autoGenerator();
        clearField();
        this.btnSave2.setEnabled(false);
    }//GEN-LAST:event_btnSave2ActionPerformed

    private void cboxPackageNoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cboxPackageNoItemStateChanged
        //CHANGES Done cboxPackageNo=="-" , then clearField, disable btnSave2
        
        if (this.cboxPackageNo.getSelectedIndex()==0) {
            this.btnSave2.setEnabled(false); //set Save button Enable 
            clearField();
        }
        else {
            this.btnSave2.setEnabled(true); //set Save button Enable 
        
        String No=this.cboxPackageNo.getSelectedItem().toString();
        
        //display all record according to packageNo
        for (int i = 0; i < packObj.packV.size(); i++) {
            String tempNo = Integer.toString(packObj.packV.elementAt(i).getpackageNo());
            if (tempNo.equals(No)) {
                this.txtMax2.setText(Integer.toString(packObj.packV.elementAt(i).getmax()));
                this.txtMin2.setText(Integer.toString(packObj.packV.elementAt(i).getmin()));
                this.txtPackageTitle2.setText(packObj.packV.elementAt(i).gettitle());
                this.txtRate2.setText(Double.toString(packObj.packV.elementAt(i).getrate()));
                break;
            }
        }
        
        }
    }//GEN-LAST:event_cboxPackageNoItemStateChanged

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
            java.util.logging.Logger.getLogger(PackageMgmtJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PackageMgmtJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PackageMgmtJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PackageMgmtJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PackageMgmtJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSave2;
    public static javax.swing.JComboBox cboxPackageNo;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblCustomerHeader3;
    private javax.swing.JLabel lblOrderHeader;
    private javax.swing.JLabel lblOrderHeader1;
    private javax.swing.JTextField txtMax;
    private javax.swing.JTextField txtMax2;
    private javax.swing.JTextField txtMin;
    private javax.swing.JTextField txtMin2;
    public static javax.swing.JTextField txtPackageNo;
    private javax.swing.JTextField txtPackageTitle;
    private javax.swing.JTextField txtPackageTitle2;
    private javax.swing.JTextField txtRate;
    private javax.swing.JTextField txtRate2;
    // End of variables declaration//GEN-END:variables
}
