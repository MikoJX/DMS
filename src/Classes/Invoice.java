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
public class Invoice {
    private int InvoiceNo;
    protected Order OrderObj;
    
    public int getInvoiceNo() {
        return InvoiceNo;
    }

    public void setInvoiceNo(int InvoiceNo) {
        this.InvoiceNo = InvoiceNo;
    }
    
    
}
