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
public class Invoice implements java.io.Serializable{
    private int invoiceNo;
    private String invStatus;
    public Order orderObj = new Order();
    
    public Invoice(){
        this.invoiceNo = 0;
        this.invStatus ="empty";
    }
    
    public Invoice(int invoiceNo,int orderNo,String invStatus) {
        this.invoiceNo=invoiceNo;
        this.orderObj.setorderNo(orderNo);
        this.invStatus=invStatus;
    }
    
    public int getinvoiceNo() {
        return invoiceNo;
    }

    public void setinvoiceNo(int invoiceNo) {
        this.invoiceNo = invoiceNo;
    }
    
    public String getInvStatus() {
        return invStatus;
    }

    public void setInvStatus(String invStatus) {
        this.invStatus = invStatus;
    }
    
    
}
