/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;

import Files.OrderFileIO;
import Files.PackageFileIO;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Miko
 */
public class MainJFrame extends javax.swing.JFrame {
    
    OrderFileIO orderObj = new OrderFileIO();
    PackageFileIO packObj = new PackageFileIO();
    
    /**
     * Creates new form MainJFrame
     */
    public MainJFrame() {
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

        btnCustomer = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton();
        btnDelivery = new javax.swing.JButton();
        btnPayment = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnPackage = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        lblCustomerHeader3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCustomer.setText("Customer Management");
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });

        btnOrder.setText("Order Management");
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        btnDelivery.setText("Delivery Management");
        btnDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryActionPerformed(evt);
            }
        });

        btnPayment.setText("Payment Management");
        btnPayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaymentActionPerformed(evt);
            }
        });

        btnReport.setText("Report Management");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        btnPackage.setText("Package Management");
        btnPackage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPackageActionPerformed(evt);
            }
        });

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblCustomerHeader3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblCustomerHeader3.setText("Delivery Management System(DMS)");

        jLabel2.setText("Welcome to Delivery Management System (DMS)");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/20120121_134403_15.jpg"))); // NOI18N
        jLabel3.setMaximumSize(new java.awt.Dimension(259, 194));

        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPackage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnLogout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(148, 148, 148)
                        .addComponent(lblCustomerHeader3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnLogout)
                        .addGap(2, 2, 2)
                        .addComponent(btnCustomer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnOrder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelivery)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPayment)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnReport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPackage)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jSeparator3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCustomerHeader3)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        JFrame cFrame = new CustMgmtJFrame();
        cFrame.setVisible(true);
        cFrame.setAlwaysOnTop( true );
        cFrame.setLocationRelativeTo(null);
        cFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        String newPno;
        packObj.retrieveData();
        if(packObj.packV.size()!=0){
           newPno=Integer.toString((packObj.packV.lastElement().getpackageNo())+1);
           
           for (int i = 0; i < packObj.packV.size(); i++) {
               CustMgmtJFrame.cBoxPackageNo.addItem(packObj.packV.elementAt(i).getpackageNo());
               CustMgmtJFrame.cBoxPackageNo2.addItem(packObj.packV.elementAt(i).getpackageNo());
            }
        }        
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        JFrame oFrame = new OrderMgmtjFrame();
        oFrame.setVisible(true);
        oFrame.setAlwaysOnTop( true );
        oFrame.setLocationRelativeTo(null);
        oFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        String newOno;
        orderObj.retrieveData();
        if(orderObj.orderV.size()==0){
            OrderMgmtjFrame.txtOrderNo.setText("111");
        }
        else {
           newOno=Integer.toString((orderObj.orderV.lastElement().getorderNo())+1);
           OrderMgmtjFrame.txtOrderNo.setText(newOno.toString());
        }
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveryActionPerformed
        JFrame dFrame = new DeliveryMgmtJFrame();
        dFrame.setVisible(true);
        dFrame.setAlwaysOnTop( true );
        dFrame.setLocationRelativeTo(null);
        dFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        orderObj.retrieveData();
        
        for (int i = 0; i < orderObj.orderV.size(); i++) {
            Vector newRow = new Vector();
            newRow.add(orderObj.orderV.elementAt(i).getorderNo());
            newRow.add(orderObj.orderV.elementAt(i).getDeliverStatus());
            newRow.add(orderObj.orderV.elementAt(i).custObj.getcustIC());
            newRow.add(orderObj.orderV.elementAt(i).custObj.getcustName());
            newRow.add(orderObj.orderV.elementAt(i).getcName());
            newRow.add(orderObj.orderV.elementAt(i).getcAdd());
            
            DefaultTableModel defaultModel = (DefaultTableModel)DeliveryMgmtJFrame.tblDeliver.getModel();
            defaultModel.addRow(newRow);            
        }
    }//GEN-LAST:event_btnDeliveryActionPerformed

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        JFrame pFrame = new PaymentMgmtJFrame();
        pFrame.setVisible(true);
        pFrame.setAlwaysOnTop( true );
        pFrame.setLocationRelativeTo(null);
        pFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnPaymentActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        JFrame rFrame = new ReportMgmtJFrame();
        rFrame.setVisible(true);
        rFrame.setAlwaysOnTop( true );
        rFrame.setLocationRelativeTo(null);
        rFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_btnReportActionPerformed

    private void btnPackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPackageActionPerformed
        JFrame pFrame = new PackageMgmtJFrame();
        pFrame.setVisible(false);
        pFrame.setVisible(true);
        pFrame.setAlwaysOnTop( true );
        pFrame.setLocationRelativeTo(null);
        pFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        String newPno;
        packObj.retrieveData();
        if(packObj.packV.size()==0){
            PackageMgmtJFrame.txtPackageNo.setText("111");
        }
        else {
           newPno=Integer.toString((packObj.packV.lastElement().getpackageNo())+1);
           PackageMgmtJFrame.txtPackageNo.setText(newPno.toString());
           
           for (int i = 0; i < packObj.packV.size(); i++) {
               PackageMgmtJFrame.cboxPackageNo.addItem(packObj.packV.elementAt(i).getpackageNo());
            }
        }        
    }//GEN-LAST:event_btnPackageActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        int dialogButton = JOptionPane.YES_NO_OPTION;
        String dialogContent = "Do you want to logout ? ";
        int dialogResult = JOptionPane.showConfirmDialog(this, dialogContent, "System Logout Confirmation",dialogButton);
        
        if (dialogResult==0) {
            LoginJFrame logout = new LoginJFrame();
            logout.setVisible(true);
            logout.setLocationRelativeTo(null);
            this.setVisible(false);
        }             
    }//GEN-LAST:event_btnLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnDelivery;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnOrder;
    public static javax.swing.JButton btnPackage;
    private javax.swing.JButton btnPayment;
    public static javax.swing.JButton btnReport;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lblCustomerHeader3;
    // End of variables declaration//GEN-END:variables
}
