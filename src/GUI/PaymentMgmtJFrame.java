/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI;
import Classes.Invoice;
import Classes.Order;
import Classes.Payment;
import Files.OrderFileIO;
import Files.InvoiceFileIO;
import Files.PaymentFileIO;
import javax.swing.JOptionPane;
/**
 *
 * @author Miko
 */
public class PaymentMgmtJFrame extends javax.swing.JFrame {
    
    OrderFileIO orderObj = new OrderFileIO();
    InvoiceFileIO invObj = new InvoiceFileIO();
    PaymentFileIO payObj = new PaymentFileIO();
    int invNo,payNo,orderNo,IC;
    double weight,amount;
    String name,sName,sAdd,cName,cAdd;
            
    public void clearField(){
        this.txtIC.setText("");
        this.txtIC2.setText("");
        this.txtOrderDetail.setText("");
        this.txtOrderDetail2.setText("");
    }
    /**
     * Creates new form PaymentMgmtJFrame
     */
    public PaymentMgmtJFrame() {
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
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        lblDeliveryHeader1 = new javax.swing.JLabel();
        lblPIC = new javax.swing.JLabel();
        txtIC = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblPIC1 = new javax.swing.JLabel();
        btnGenerate = new javax.swing.JButton();
        cBoxOrderNo = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOrderDetail = new javax.swing.JTextArea();
        lblPIC3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblDeliveryHeader2 = new javax.swing.JLabel();
        btnPay = new javax.swing.JButton();
        lblPIC2 = new javax.swing.JLabel();
        txtIC2 = new javax.swing.JTextField();
        btnSearch2 = new javax.swing.JButton();
        lblPIC4 = new javax.swing.JLabel();
        cBoxOrderNo2 = new javax.swing.JComboBox();
        lblPIC5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtOrderDetail2 = new javax.swing.JTextArea();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        lblCustomerHeader3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblIdentity = new javax.swing.JLabel();

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

        lblDeliveryHeader1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblDeliveryHeader1.setText("Generate Invoice");

        lblPIC.setText("IC : ");

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblPIC1.setText("Order No :");

        btnGenerate.setText("Generate");
        btnGenerate.setEnabled(false);
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        cBoxOrderNo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));
        cBoxOrderNo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cBoxOrderNoItemStateChanged(evt);
            }
        });
        cBoxOrderNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxOrderNoActionPerformed(evt);
            }
        });

        txtOrderDetail.setColumns(20);
        txtOrderDetail.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        txtOrderDetail.setRows(5);
        jScrollPane1.setViewportView(txtOrderDetail);

        lblPIC3.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        lblPIC3.setText("Order Details ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDeliveryHeader1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPIC)
                                .addGap(18, 18, 18)
                                .addComponent(txtIC, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPIC1)
                                .addGap(18, 18, 18)
                                .addComponent(cBoxOrderNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(248, 248, 248)
                        .addComponent(btnGenerate))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(lblPIC3)))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblDeliveryHeader1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPIC)
                    .addComponent(txtIC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPIC1)
                    .addComponent(cBoxOrderNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(lblPIC3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGenerate)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Invoice", jPanel1);

        lblDeliveryHeader2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblDeliveryHeader2.setText("Made Payment");

        btnPay.setText("Payment");
        btnPay.setEnabled(false);
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        lblPIC2.setText("IC : ");

        btnSearch2.setText("Search");
        btnSearch2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearch2ActionPerformed(evt);
            }
        });

        lblPIC4.setText("Order No :");

        cBoxOrderNo2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-" }));
        cBoxOrderNo2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cBoxOrderNo2ItemStateChanged(evt);
            }
        });
        cBoxOrderNo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxOrderNo2ActionPerformed(evt);
            }
        });

        lblPIC5.setFont(new java.awt.Font("Tempus Sans ITC", 0, 14)); // NOI18N
        lblPIC5.setText("Order Details ");

        txtOrderDetail2.setColumns(20);
        txtOrderDetail2.setFont(new java.awt.Font("Times New Roman", 0, 13)); // NOI18N
        txtOrderDetail2.setRows(5);
        jScrollPane2.setViewportView(txtOrderDetail2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblPIC2)
                                .addGap(18, 18, 18)
                                .addComponent(txtIC2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSearch2))
                            .addComponent(lblDeliveryHeader2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblPIC4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cBoxOrderNo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(btnPay))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(lblPIC5)))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblDeliveryHeader2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPIC2)
                    .addComponent(txtIC2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPIC4)
                    .addComponent(cBoxOrderNo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(lblPIC5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPay)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Made Payment", jPanel2);
        jTabbedPane1.addTab("View Payment ", jTabbedPane2);

        lblCustomerHeader3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 18)); // NOI18N
        lblCustomerHeader3.setText("Delivery Management System(DMS)");

        jLabel4.setText("Welcome !");

        lblIdentity.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDelivery, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnPackage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblIdentity)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTabbedPane1)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(lblCustomerHeader3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lblIdentity))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(lblCustomerHeader3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        this.setVisible(false);
        new CustMgmtJFrame().setVisible(true);
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        this.setVisible(false);
        new OrderMgmtjFrame().setVisible(true);
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveryActionPerformed
        this.setVisible(false);
        new DeliveryMgmtJFrame().setVisible(true);
    }//GEN-LAST:event_btnDeliveryActionPerformed

    private void btnPaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaymentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPaymentActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportActionPerformed

    private void btnPackageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPackageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPackageActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        orderObj.retrieveData();
        String listONo,tempIC,oNoStatus;
        boolean recordCheck=false;
        
        for (int i = 0; i < orderObj.orderV.size(); i++) {
            tempIC= Integer.toString(orderObj.orderV.elementAt(i).custObj.getCustIC());
            oNoStatus = orderObj.orderV.elementAt(i).getOStatus().toString();
            if ((tempIC.equals(this.txtIC.getText()))&& (oNoStatus.equals("pending")) ) {
                for (int j = 1; j < (this.cBoxOrderNo.getItemCount()); j++) { 
                    this.cBoxOrderNo.removeItemAt(1);
                }
                recordCheck = true;
                break;
            }
            else {recordCheck =false;}
        }
        
        if (recordCheck) {
            for (int i = 0; i < orderObj.orderV.size(); i++) {
                oNoStatus = orderObj.orderV.elementAt(i).getOStatus();
                tempIC= Integer.toString(orderObj.orderV.elementAt(i).custObj.getCustIC());
                listONo=Integer.toString(orderObj.orderV.elementAt(i).getOrderNo());
                
                if ((tempIC.equals(this.txtIC.getText()))&& oNoStatus.equals("pending") ) {
                    this.cBoxOrderNo.addItem(listONo);
//                    System.out.println(oNoStatus);
                }
            }
            this.cBoxOrderNo.removeItemAt(0);
            this.btnGenerate.setEnabled(true);
        }
        else {
            this.cBoxOrderNo.addItem("-");
            for (int j = 0; j < (this.cBoxOrderNo.getItemCount()); j++) { 
                    this.cBoxOrderNo.removeItemAt(0); }
            JOptionPane.showMessageDialog(this, "Record Not Found!", "Information",JOptionPane.ERROR_MESSAGE);
            this.btnGenerate.setEnabled(false);
            clearField();
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        //COMPLETE
        invNo =Integer.parseInt(this.cBoxOrderNo.getSelectedItem().toString()); 
        Invoice invoice = new Invoice(invNo,invNo,"pending");
        Order order = new Order(amount,IC,orderNo,weight,name,sName,sAdd,cName,cAdd,"done");
        orderObj.edit(order);
        invObj.add(invoice);
        
        JOptionPane.showMessageDialog(this, "Invoice Successful Generated!", "Information",JOptionPane.INFORMATION_MESSAGE);
        clearField();
        this.btnGenerate.setEnabled(false);
        this.cBoxOrderNo.addItem("-");
        for (int j = 0; j < (this.cBoxOrderNo.getItemCount()); j++) { 
                    this.cBoxOrderNo.removeItemAt(0); }
        
    }//GEN-LAST:event_btnGenerateActionPerformed

    private void cBoxOrderNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxOrderNoActionPerformed
       
    }//GEN-LAST:event_cBoxOrderNoActionPerformed

    private void cBoxOrderNoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cBoxOrderNoItemStateChanged
        //COMPLETE
        for (int i = 0; i < orderObj.orderV.size(); i++) {
            
            if ( ((this.cBoxOrderNo.getSelectedItem().toString()).equals(Integer.toString(orderObj.orderV.elementAt(i).getOrderNo()) ))) {
                double rate = orderObj.orderV.elementAt(i).getAmount()/(orderObj.orderV.elementAt(i).getWeight()*100);
                orderNo=orderObj.orderV.elementAt(i).getOrderNo();
                IC=orderObj.orderV.elementAt(i).custObj.getCustIC();
                weight = orderObj.orderV.elementAt(i).getWeight();
                name=orderObj.orderV.elementAt(i).custObj.getCustName();
                sName=orderObj.orderV.elementAt(i).custObj.getShipperName();
                sAdd=orderObj.orderV.elementAt(i).custObj.getShipperAdd();
                cName = orderObj.orderV.elementAt(i).getCName();
                cAdd=orderObj.orderV.elementAt(i).getCAdd();
                amount = orderObj.orderV.elementAt(i).getAmount();
                 
                this.txtOrderDetail.setText("Order No : "+ orderNo+
                                           "\nName       : "+ name+ 
                                           "\nIC             : "+ IC +
                                           "\n=========================Shipping Details===========================" +
                                           "\nShipper Name           : " + sName+
                                           "\nShipper Address      : " + sAdd+
                                           "\nConsignee Name      : " + cName+
                                           "\nConsignee Address : " + cAdd+
                                           "\n\nWeight : "+ weight + "kg"+
                                           "\nRate : "+ (Double.toString(Math.round(rate*100.0)/100.0)) + "/100 gram"+
                                           "\nAmount : "+ amount);     
            }
        }
    }//GEN-LAST:event_cBoxOrderNoItemStateChanged

    private void btnSearch2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearch2ActionPerformed
        //COMPLETE
        orderObj.retrieveData();
        invObj.retrieveData();
        
        String tempIC,oNoStatus,invStatus;
        boolean recordCheck=false;
        
        for (int i = 0; i < orderObj.orderV.size(); i++) {
            tempIC= Integer.toString(orderObj.orderV.elementAt(i).custObj.getCustIC());
            oNoStatus = orderObj.orderV.elementAt(i).getOStatus().toString();
  
            
            if ((tempIC.equals(this.txtIC2.getText()))&& (oNoStatus.equals("done")) ) {
              
                for (int j = 0; j < invObj.invoiceV.size(); j++) {
                    
                    invStatus = invObj.invoiceV.elementAt(j).getInvStatus();
//                    System.out.println(orderObj.orderV.elementAt(i).getOrderNo());
//                    System.out.println(invObj.invoiceV.elementAt(j).orderObj.getOrderNo());
                    System.out.println(invStatus);
                    if ((orderObj.orderV.elementAt(i).getOrderNo())== invObj.invoiceV.elementAt(j).orderObj.getOrderNo()
                            && (invStatus.equals("pending"))) {
                        this.cBoxOrderNo2.addItem(orderObj.orderV.elementAt(i).getOrderNo());
                        recordCheck=true;
                    }
                }
            }
        }
        
        if (recordCheck) {            
            this.cBoxOrderNo2.removeItemAt(0);
            this.btnPay.setEnabled(true);

        }else {
            this.cBoxOrderNo2.addItem("-");
            for (int j = 0; j < (this.cBoxOrderNo2.getItemCount()); j++) { 
                    this.cBoxOrderNo2.removeItemAt(0); }
            JOptionPane.showMessageDialog(this, "Record Not Found!", "Information",JOptionPane.ERROR_MESSAGE);
            this.btnPay.setEnabled(false);
            clearField();
        }
    }//GEN-LAST:event_btnSearch2ActionPerformed

    private void cBoxOrderNo2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cBoxOrderNo2ItemStateChanged
        //COMPLETE 
        for (int i = 0; i < orderObj.orderV.size(); i++) {
            
            if ( ((this.cBoxOrderNo2.getSelectedItem().toString()).equals(Integer.toString(orderObj.orderV.elementAt(i).getOrderNo()) ))) {
                double rate = orderObj.orderV.elementAt(i).getAmount()/(orderObj.orderV.elementAt(i).getWeight()*100);
                orderNo=orderObj.orderV.elementAt(i).getOrderNo();
                IC=orderObj.orderV.elementAt(i).custObj.getCustIC();
                weight = orderObj.orderV.elementAt(i).getWeight();
                name=orderObj.orderV.elementAt(i).custObj.getCustName();
                sName=orderObj.orderV.elementAt(i).custObj.getShipperName();
                sAdd=orderObj.orderV.elementAt(i).custObj.getShipperAdd();
                cName = orderObj.orderV.elementAt(i).getCName();
                cAdd=orderObj.orderV.elementAt(i).getCAdd();
                amount = orderObj.orderV.elementAt(i).getAmount();
                
                this.txtOrderDetail2.setText("Order No : "+ orderNo+
                                           "\nName       : "+ name+ 
                                           "\nIC             : "+ IC +
                                           "\n=========================Shipping Details===========================" +
                                           "\nShipper Name           : " + sName+
                                           "\nShipper Address      : " + sAdd+
                                           "\nConsignee Name      : " + cName+
                                           "\nConsignee Address : " + cAdd+
                                           "\n\nWeight : "+ weight + "kg"+
                                           "\nRate : "+ (Double.toString(Math.round(rate*100.0)/100.0)) + "/100 gram"+
                                           "\nAmount : "+ amount);     
            }
        }
    }//GEN-LAST:event_cBoxOrderNo2ItemStateChanged

    private void cBoxOrderNo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxOrderNo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxOrderNo2ActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        //COMPLETE
        int dialogButton = JOptionPane.YES_NO_OPTION;
        String dialogContent = "Payment Confirm ? \nOrder No : "+ this.cBoxOrderNo2.getSelectedItem().toString();
        int dialogResult = JOptionPane.showConfirmDialog(this, dialogContent, "Payment Confirmation",dialogButton);
        
        if (dialogResult==0) {
            payNo =Integer.parseInt(this.cBoxOrderNo2.getSelectedItem().toString()); 
            Invoice invoice = new Invoice(invNo,invNo,"done");
            Payment payment = new Payment(payNo,"paid",payNo);
            invObj.edit(invoice);
            payObj.add(payment);
            clearField();
            JOptionPane.showMessageDialog(this, "Payment made ", "Information",JOptionPane.INFORMATION_MESSAGE);
            this.btnPay.setEnabled(false);
            this.cBoxOrderNo2.addItem("-");
            for (int i = 0; i < (this.cBoxOrderNo2.getItemCount()); i++) { 
                        this.cBoxOrderNo2.removeItemAt(0); }
        }        
    }//GEN-LAST:event_btnPayActionPerformed

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
            java.util.logging.Logger.getLogger(PaymentMgmtJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentMgmtJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentMgmtJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentMgmtJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentMgmtJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnDelivery;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnPackage;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSearch2;
    private javax.swing.JComboBox cBoxOrderNo;
    private javax.swing.JComboBox cBoxOrderNo2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel lblCustomerHeader3;
    private javax.swing.JLabel lblDeliveryHeader1;
    private javax.swing.JLabel lblDeliveryHeader2;
    public static javax.swing.JLabel lblIdentity;
    private javax.swing.JLabel lblPIC;
    private javax.swing.JLabel lblPIC1;
    private javax.swing.JLabel lblPIC2;
    private javax.swing.JLabel lblPIC3;
    private javax.swing.JLabel lblPIC4;
    private javax.swing.JLabel lblPIC5;
    private javax.swing.JTextField txtIC;
    private javax.swing.JTextField txtIC2;
    private javax.swing.JTextArea txtOrderDetail;
    private javax.swing.JTextArea txtOrderDetail2;
    // End of variables declaration//GEN-END:variables
}
