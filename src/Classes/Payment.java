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
    private int payNo;
    private String payStatus;
    public Invoice invoiceObj = new Invoice();

    public Payment(){
        this.payNo=0;
        this.payStatus="pending";
    }
    
    public Payment(int payNo,String payStatus,int invNo){
        this.payNo=payNo;
        this.payStatus=payStatus;
        this.invoiceObj.setinvoiceNo(invNo);
    }
    
    public int getpayNo() {
        return payNo;
    }

    public void setpayNo(int payNo) {
        this.payNo = payNo;
    }

    public String getpayStatus() {
        return payStatus;
    }

    public void setpayStatus(String payStatus) {
        this.payStatus = payStatus;
    }
    
}
