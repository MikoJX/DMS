/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Classes;

/**
 *
 * @author Miko
 */
public class Payment {
    private int PaymentNo;
    private String PaymentStatus;
    protected Invoice InvoiceObj;

    public int getPaymentNo() {
        return PaymentNo;
    }

    public void setPaymentNo(int PaymentNo) {
        this.PaymentNo = PaymentNo;
    }

    public String getPaymentStatus() {
        return PaymentStatus;
    }

    public void setPaymentStatus(String PaymentStatus) {
        this.PaymentStatus = PaymentStatus;
    }
    
}
